package org.example.framework;

import javax.servlet.http.HttpServletRequest;

public interface MyHandlerMapping {
//    HandlerExecutionChain getHandler(HttpServletRequest request);

    Class getController(HttpServletRequest request);
}
