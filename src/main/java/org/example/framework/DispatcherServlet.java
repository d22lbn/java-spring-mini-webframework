package org.example.framework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
//    private ApplicationContext context;

    @Override
    public void init() throws ServletException {
        super.init();
//        context =
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

    }
}

// todo: точка входа
// todo: routing
// todo: ioc-container
// todo: событийная модель
