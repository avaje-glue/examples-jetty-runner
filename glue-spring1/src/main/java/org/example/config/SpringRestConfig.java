package org.example.config;

import org.avaje.glue.config.BaseConfig;
import org.example.web.IndexResource;
import org.example.web.MyResource;
import org.example.web.SpringResource;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class SpringRestConfig extends BaseConfig {

  /**
   * Register JAX-RS application components.
   */
  public SpringRestConfig() {
    register(RequestContextFilter.class);
    register(IndexResource.class);
    register(MyResource.class);

    register(SpringResource.class);
  }
}
