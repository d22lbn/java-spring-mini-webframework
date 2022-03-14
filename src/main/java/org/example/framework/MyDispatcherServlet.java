package org.example.framework;

import org.example.site.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * получает запрос
 * с помощью MyHandlerMapping понимает, какой контроллер нужен
 * запрос передается в контроллер и возвращается ModelAndView (модель + view)
 * с помощью MyViewResolver находит нужное представление
 * в представление передатся наши данные
 * выводится представление или, если его нет, ошибка со статусным кодом
 */

@WebServlet("/")
public class MyDispatcherServlet extends HttpServlet {
    private ApplicationContext context;
    private ApplicationContext xmlConfigContext; // todo: сделать для xml файла

    private MyHandlerMapping handlerMapping;
    private MyController controller;
    private MyModelAndView modelAndView;
    private MyViewResolver viewResolver;
    private MyView view;

    @Override
    public void init() throws ServletException {
        super.init();
        context = new AnnotationConfigApplicationContext(Config.class); //todo: добавить для xml
        handlerMapping = new MyHandlerMappingImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyController controller = handlerMapping.getController(req, context);
        MyModelAndViewImpl modelAndView = controller.doAction();
        MyViewResolver viewResolver = new MyViewResolverImpl();
        MyView view = viewResolver.getView(modelAndView);
        view.showView(viewResolver, req, resp);
    }
}


