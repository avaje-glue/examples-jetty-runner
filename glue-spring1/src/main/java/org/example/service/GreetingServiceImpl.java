package org.example.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 */
public class GreetingServiceImpl implements GreetingService {

  @Autowired
  private HttpServletRequest servletRequest;

  @Override
  public String greet(String who) {
    final String serverName = servletRequest.getServerName();
    return String.format("hello, %s! Greetings from server %s!", who, serverName);
  }

}
