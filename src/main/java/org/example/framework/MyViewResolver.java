package org.example.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MyViewResolver {
    void showView(MyModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response);
    void showViewNotFound(HttpServletRequest request, HttpServletResponse response);
}
