package org.example.framework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyViewImpl implements MyView {
    @Override
    public void showView(MyViewResolver viewResolver, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("").forward(request, response);
    }
}
