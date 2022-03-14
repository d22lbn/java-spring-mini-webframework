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

/** FROM WEBSITE
 * First, DispatcherServlet (servlet manager) receives a request, then it looks at its settings to understand which controller to use (in the figure Handler Mapping).
 * After receiving the controller name, the request is passed to it (in the figure Controller). The request is processed in the controller and ModelAndView is sent back (the model is the data itself; view is how to display this data).
 * DispatcherServlet, based on the received ModelAndView, searches for which view to use (ViewResolver) and receives the name of the View in the response
 * Data (model) is transmitted to the view and, if necessary, a response from the view is sent back.
 */
@WebServlet("/")
public class MyDispatcherServlet extends HttpServlet {
    private ApplicationContext context; // todo: сделать для xml файла

    private MyHandlerMapping handlerMapping;
    private MyController controller;
    private MyModelAndView modelAndView;
    private MyViewResolver viewResolver;
    private MyView view;
    private MyModel model;

    @Override
    public void init() throws ServletException {
        super.init();
        context = new AnnotationConfigApplicationContext(Config.class);
        handlerMapping = new MyHandlerMappingImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        MyController controller = handlerMapping.getController(req, context);
//        MyModelAndViewImpl modelAndView = controller.doAction();
//        MyViewResolver viewResolver = new MyViewResolverImpl();
//        MyView view = viewResolver.getView(modelAndView);
//        view.showView(viewResolver, req, resp);
    }
}


