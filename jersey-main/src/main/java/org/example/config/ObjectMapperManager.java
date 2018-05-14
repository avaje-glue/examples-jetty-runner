package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperManager {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static ObjectMapper get() {
    return objectMapper;
  }
}
