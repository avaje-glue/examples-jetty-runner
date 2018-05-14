package org.example.config;

import org.avaje.glue.config.BaseConfig;
import org.example.web.IndexResource;
import org.example.web.MyResource;

public class RestConfig extends BaseConfig {

  public RestConfig() {
    super();
    //GlueApplicationComponent appComponent = DaggerGlueApplicationComponent.create();
//    register(appComponent.getWidgetResource());

    register(IndexResource.class);
    register(MyResource.class);
  }
}
