/*
 * Copyright by sumit yadav
 */

package com.sample.app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Sumit Yadav on 15/12/17.
 */
public class ExampleServlet extends HttpServlet {

  private static final long serialVersionUID = -3852141914946061354L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    writer.println("Hello World");
  }
}
