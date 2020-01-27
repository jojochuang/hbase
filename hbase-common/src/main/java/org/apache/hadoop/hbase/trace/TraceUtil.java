/**
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
package org.apache.hadoop.hbase.trace;

import io.jaegertracing.Configuration.SamplerConfiguration;

import io.opentracing.Scope;
import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.util.GlobalTracer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hbase.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.yetus.audience.InterfaceAudience;

/**
 * This wrapper class provides functions for accessing htrace 4+ functionality in a simplified way.
 */
@InterfaceAudience.Private
public final class TraceUtil {
  private static io.jaegertracing.Configuration conf;
  private static Tracer tracer;

  private TraceUtil() {
  }

  public static void initTracer(Configuration c) {
    /*if(c != null) {
      conf = new HBaseHTraceConfiguration(c);
    }

    if (tracer == null && conf != null) {
      tracer = new Tracer.Builder("Tracer").conf(conf).build();
    }*/

    if (!GlobalTracer.isRegistered()) {
      conf = io.jaegertracing.Configuration.fromEnv("Tracer");
      tracer = conf.getTracerBuilder().build();

      GlobalTracer.register(tracer);
    }

  }

  @VisibleForTesting
  public static void registerTracerForTest(Tracer tracer) {
    TraceUtil.tracer = tracer;
    GlobalTracer.register(tracer);
  }

  /**
   * Wrapper method to create new TraceScope with the given description
   * @return TraceScope or null when not tracing
   */
  public static Scope createTrace(String description) {
    return (tracer == null) ? null :
        tracer.buildSpan(description).startActive(true);
  }

  /**
   * Wrapper method to create new child TraceScope with the given description
   * and parent scope's spanId
   * @param span parent span
   * @return TraceScope or null when not tracing
   */
  public static Scope createTrace(String description, Span span) {
    if(span == null) return createTrace(description);

    return (tracer == null) ? null : tracer.buildSpan(description).
        asChildOf(span).startActive(true);
  }

  /**
   * Wrapper method to add new sampler to the default tracer
   * @return true if added, false if it was already added
   */
  public static boolean addSampler(SamplerConfiguration sampler) {
    if (sampler == null) {
      return false;
    }

    return (tracer == null) ? false : tracer.addSampler(sampler);
  }

  /**
   * Wrapper method to add key-value pair to TraceInfo of actual span
   */
  public static void addKVAnnotation(String key, String value){
    Span span = tracer.activeSpan();
    if (span != null) {
      span.setTag(key, value);
    }
  }

  /**
   * Wrapper method to add receiver to actual tracerpool
   * @return true if successfull, false if it was already added
   */
  public static boolean addReceiver(SpanReceiver rcvr) {
    return (tracer == null) ? false : tracer.getTracerPool().addReceiver(rcvr);
  }

  /**
   * Wrapper method to remove receiver from actual tracerpool
   * @return true if removed, false if doesn't exist
   */
  public static boolean removeReceiver(SpanReceiver rcvr) {
    return (tracer == null) ? false : tracer.getTracerPool().removeReceiver(rcvr);
  }

  /**
   * Wrapper method to add timeline annotiation to current span with given message
   */
  public static void addTimelineAnnotation(String msg) {
    Span span = tracer.activeSpan();
    if (span != null) {
      span.log(msg);
    }
  }

  /**
   * Wrap runnable with current tracer and description
   * @param runnable to wrap
   * @return wrapped runnable or original runnable when not tracing
   */
  public static Runnable wrap(Runnable runnable, String description) {
    return (tracer == null) ? runnable : tracer.wrap(runnable, description);
  }
}
