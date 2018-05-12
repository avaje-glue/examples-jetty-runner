package org.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

  private static final Logger log = LoggerFactory.getLogger(MyResource.class);

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getIt() {
    log.debug("hello 2");
    return "Got it!";
  }
}
