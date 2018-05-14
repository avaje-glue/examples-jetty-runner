package org.example;

import org.avaje.glue.jetty.JettyRun;
import org.eclipse.jetty.servlet.FilterHolder;

public class Application {

  public static void main(String[] args) {

    JettyRun jettyRun = new JettyRun();

    FilterHolder holder = new FilterHolder();
    holder.setName("jersey");
    holder.setClassName("org.glassfish.jersey.servlet.ServletContainer");
    holder.getInitParameters().put("jersey.config.servlet.filter.staticContentRegex", "(/favicon.ico|/(assets|images|fonts|css|js|res)/.*)");
    holder.getInitParameters().put("javax.ws.rs.Application", "org.example.config.RestConfig");

    jettyRun.getContext().addFilter(holder, "/*", null);
    jettyRun.run();
  }
}
