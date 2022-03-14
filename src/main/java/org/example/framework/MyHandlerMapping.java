package org.example.framework;

import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;

public interface MyHandlerMapping {
//    HandlerExecutionChain getHandler(HttpServletRequest request);

    void addController(HttpServletRequest request, MyController controller);
    MyController getController(HttpServletRequest request);
    boolean hasController(HttpServletRequest request);
}
