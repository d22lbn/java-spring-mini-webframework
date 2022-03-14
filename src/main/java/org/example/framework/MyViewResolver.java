package org.example.framework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public interface MyViewResolver {
    Map<HttpServletRequest, HttpServletResponse> showView(MyView view, MyModel model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    Map<HttpServletRequest, HttpServletResponse> showViewNotFound(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
