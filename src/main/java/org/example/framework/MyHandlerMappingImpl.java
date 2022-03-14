package org.example.framework;

import org.example.site.controllers.TestController;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;

public class MyHandlerMappingImpl implements MyHandlerMapping {

    @Override
    public MyController getController(HttpServletRequest request, ApplicationContext context) {
        String path = cleanRequestPath(request);
        if (path.equals("")) {
            MyController controller = (MyController) context.getBean(TestController.class);
            return controller;
        }
        return null; // todo: если нет в контексте обработать этот момент
    }

    private String cleanRequestPath(HttpServletRequest req) {
        String requestUri = req.getRequestURI();
        return requestUri.substring(req.getContextPath().length());
    }
}
