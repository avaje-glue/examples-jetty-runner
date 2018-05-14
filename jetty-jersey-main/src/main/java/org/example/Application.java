package org.example;

import org.avaje.glue.GlueApp;
import org.avaje.glue.GlueAppBuilder;
import org.example.config.RestConfig;

@GlueApp(config = RestConfig.class, port = 8090)
public class Application {

  public static void main(String[] args) {

    new GlueAppBuilder(Application.class).run();

  }
}
