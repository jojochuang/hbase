/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.master.balancer;

import org.apache.hadoop.conf.Configuration;
import org.apache.yetus.audience.InterfaceAudience;

/**
 * Compute the cost of a potential cluster state from skew in number of primary regions on a
 * cluster.
 */
@InterfaceAudience.Private
class PrimaryRegionCountSkewCostFunction extends CostFunction {

  private static final String PRIMARY_REGION_COUNT_SKEW_COST_KEY =
    "hbase.master.balancer.stochastic.primaryRegionCountCost";
  private static final float DEFAULT_PRIMARY_REGION_COUNT_SKEW_COST = 500;

  private final float primaryRegionCountCost;
  private double[] stats;

  PrimaryRegionCountSkewCostFunction(Configuration conf) {
    // Load multiplier should be the greatest as primary regions serve majority of reads/writes.
    primaryRegionCountCost =
      conf.getFloat(PRIMARY_REGION_COUNT_SKEW_COST_KEY, DEFAULT_PRIMARY_REGION_COUNT_SKEW_COST);
    this.setMultiplier(primaryRegionCountCost);
  }

  @Override
  void prepare(BalancerClusterState cluster) {
    super.prepare(cluster);
    if (!isNeeded()) {
      return;
    }
    if (stats == null || stats.length != cluster.numServers) {
      stats = new double[cluster.numServers];
    }
  }

  @Override
  boolean isNeeded() {
    return cluster.hasRegionReplicas;
  }

  @Override
  protected double cost() {
    for (int i = 0; i < cluster.numServers; i++) {
      stats[i] = 0;
      for (int regionIdx : cluster.regionsPerServer[i]) {
        if (regionIdx == cluster.regionIndexToPrimaryIndex[regionIdx]) {
          stats[i]++;
        }
      }
    }

    return costFromArray(stats);
  }
}