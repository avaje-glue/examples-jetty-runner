package org.example.service;

import javax.inject.Singleton;

@Singleton
public class HelloService {

  public String greet(String who) {
    return String.format("hello, %s! Whatsup!!", who);
  }

}
