package org.example.web;

import org.example.service.GreetingService;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Jersey Spring integration example.
 */
@Path("spring")
@Component
public class SpringResource {

  private final AtomicInteger counter = new AtomicInteger();

  private final GreetingService greetingService;

  @Inject
  public SpringResource(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getHello(@Context HttpHeaders headers, @QueryParam("p1") String p1) {
    if ("foobar".equals(p1)) {
      throw new IllegalArgumentException("foobar is illegal");
    }
    return String.format("%d: %s", counter.incrementAndGet(), greetingService.greet("world"));
  }
}
