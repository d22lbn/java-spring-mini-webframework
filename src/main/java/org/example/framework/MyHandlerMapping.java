package org.example.framework;

import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;

public interface MyHandlerMapping {
//    HandlerExecutionChain getHandler(HttpServletRequest request);

    MyController getController(HttpServletRequest request, ApplicationContext context);
}
