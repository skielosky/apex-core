/*
 *  Copyright (c) 2012-2013 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.datatorrent.engine;

import com.datatorrent.tuple.Tuple;
import com.datatorrent.api.Sink;
import com.datatorrent.netlet.util.CircularBuffer;

/**
 *
 * @author Chetan Narsude <chetan@malhar-inc.com>
 */
public class DefaultReservoir extends CircularBuffer<Object> implements SweepableReservoir
{
  private Sink<Object> sink;
  private String id;
  private int count;

  public DefaultReservoir(String id, int capacity)
  {
    super(capacity);
    this.id = id;
  }

  @Override
  public Sink<Object> setSink(Sink<Object> sink)
  {
    try {
      return this.sink;
    }
    finally {
      this.sink = sink;
    }
  }

  @Override
  public Tuple sweep()
  {
    final int size = size();
    for (int i = 1; i <= size; i++) {
      if (peekUnsafe() instanceof Tuple) {
        count += i;
        return (Tuple)peekUnsafe();
      }
      sink.put(pollUnsafe());
    }

    count += size;
    return null;
  }

  @Override
  public String toString()
  {
    return "DefaultReservoir{" + "sink=" + sink + ", id=" + id + ", count=" + count + '}';
  }

  /**
   * @return the id
   */
  public String getId()
  {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id)
  {
    this.id = id;
  }

  @Override
  public int getCount(boolean reset)
  {
    try {
      return count;
    }
    finally {
      if (reset) {
        count = 0;
      }
    }
  }

}
