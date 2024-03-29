package org.example;

import org.avaje.glue.Glue;
import org.avaje.glue.GlueAppBuilder;
import org.example.config.SpringRestConfig;

@Glue(config = SpringRestConfig.class, port = 8090)
public class Application {

  public static void main(String[] args) {

    new GlueAppBuilder(Application.class).run(args);

  }
}
