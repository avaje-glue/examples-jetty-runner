package org.example.config;

//import io.avaje.zing.common.HealthResource;

import org.example.web.IndexResource;
import org.example.web.MyResource;
import org.glassfish.jersey.CommonProperties;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class GlueApplication extends ResourceConfig {

  public GlueApplication() {
    //GlueApplicationComponent appComponent = DaggerGlueApplicationComponent.create();

    register(ObjectMapperManager.get());
    register(JacksonFeature.class);

    property(CommonProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
    property(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, true);
    property(CommonProperties.MOXY_JSON_FEATURE_DISABLE, true);
//    property(ServletProperties.FILTER_FORWARD_ON_404, true);

//    register(HealthResource.class);
    register(IndexResource.class);
    register(MyResource.class);
//    register(appComponent.getWidgetResource());
  }
}
