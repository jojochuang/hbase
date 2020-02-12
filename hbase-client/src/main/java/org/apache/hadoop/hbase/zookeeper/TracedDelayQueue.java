package org.apache.hadoop.hbase.zookeeper;

import io.opentracing.Span;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class TracedDelayQueue<E extends Delayed> extends DelayQueue<E> {
  Span span;

  public boolean add(E e) {

    return super.add(e);
  }
}
