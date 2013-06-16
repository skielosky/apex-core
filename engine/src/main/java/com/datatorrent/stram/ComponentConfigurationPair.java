/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.datatorrent.stram;

import com.datatorrent.api.ComponentComplementPair;
import com.datatorrent.api.Component;
import com.datatorrent.api.Context;

import org.apache.hadoop.conf.Configuration;


/**
 *
 * @author Chetan Narsude <chetan@malhar-inc.com>
 */
public class ComponentConfigurationPair<COMPONENT extends Component<Context>, CONFIG extends Configuration> extends ComponentComplementPair<COMPONENT, CONFIG>
{
  public final CONFIG config;

  public ComponentConfigurationPair(COMPONENT component, CONFIG context)
  {
    super(component);
    this.config = context;
  }

  @Override
  public CONFIG getComplement()
  {
    return config;
  }
}
