package org.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.TEXT_PLAIN)
@Path("/")
public class IndexResource {

  private static final Logger log = LoggerFactory.getLogger(IndexResource.class);

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getIt() {
    log.debug("hello 1");
    return "Hi";
  }
}
