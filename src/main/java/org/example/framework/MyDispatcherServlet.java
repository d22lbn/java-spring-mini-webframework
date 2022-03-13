package org.example.framework;

import org.example.site.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class MyDispatcherServlet extends HttpServlet {
//    private ApplicationContext context;

    @Override
    public void init() throws ServletException {
        super.init();

        ApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(Config.class);

//        todo: сделать для xml файла
        ApplicationContext xmlConfigContext = new ClassPathXmlApplicationContext("config.xml");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

// todo: точка входа
// todo: routing
// todo: ioc-container
// todo: событийная модель
