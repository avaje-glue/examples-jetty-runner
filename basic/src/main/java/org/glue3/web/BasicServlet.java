package org.glue3.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BasicServlet extends HttpServlet {

  private final Logger log = LoggerFactory.getLogger(BasicServlet.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    log.info("process request ... ");
    resp.getWriter().write("Hello from servlet");
  }
}
