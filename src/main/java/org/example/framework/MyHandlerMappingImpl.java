package org.example.framework;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class MyHandlerMappingImpl implements MyHandlerMapping {
    private Map<String, MyController> routesAndControllers = new HashMap<>();

    @Override
    public void addController(HttpServletRequest request, MyController controller) {
        if (!hasController(request)) {
            routesAndControllers.put(cleanRequestPath(request), controller);
        } else {
            System.out.println("Контроллер существует");
        }
    }

    @Override
    public MyController getController(HttpServletRequest request) {
        if (hasController(request)) {
            return routesAndControllers.get(cleanRequestPath(request));
        } else {
            System.out.println("Контроллера не существует");
            return null;
        }
    }

    @Override
    public boolean hasController(HttpServletRequest request) {
        if (routesAndControllers.containsKey(cleanRequestPath(request))) {
            return true;
        } else {
            // todo: посмотреть в файле properties
            return false;
        }
    }

    private String cleanRequestPath(HttpServletRequest req) {
        String requestUri = req.getRequestURI();
        return requestUri.substring(req.getContextPath().length());
    }
}
