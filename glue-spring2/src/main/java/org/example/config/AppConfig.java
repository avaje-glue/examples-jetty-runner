package org.example.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.service.HelloService;
import org.example.web.IndexResource;
import org.example.web.MyResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({IndexResource.class, HelloService.class, MyResource.class})
@Configuration
public class AppConfig {

  private ObjectMapper mapper = newObject();

  @Bean
  ObjectMapper mapper() {
    return mapper;
  }

  private ObjectMapper newObject() {

    ObjectMapper mapper = new ObjectMapper();
    mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    mapper.enable(SerializationFeature.INDENT_OUTPUT);

    return mapper;
  }
}
