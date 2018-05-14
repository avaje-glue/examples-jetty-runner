package org.example.config;

//import io.avaje.zing.common.HealthResource;

import org.avaje.glue.config.BaseConfig;
import org.example.web.IndexResource;
import org.example.web.MyResource;

public class RestConfig extends BaseConfig {

  public RestConfig() {
    //GlueApplicationComponent appComponent = DaggerGlueApplicationComponent.create();

    register(IndexResource.class);
    register(MyResource.class);
//    register(appComponent.getWidgetResource());
  }
}
