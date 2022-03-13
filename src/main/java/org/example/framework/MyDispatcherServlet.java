package org.example.framework;

import org.example.site.config.Config;
import org.reflections.Reflections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

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

    @Override
    public void init() throws ServletException {
        super.init();
        // ссылаемся на созданный конфиг java класса
        // todo: проверить, какой именно контекст надо брать
        context = new AnnotationConfigApplicationContext(Config.class);
//        handlerMapping = context.getBean(MyHandlerMapping.class);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestPath = req.getRequestURI().substring(req.getContextPath().length()); // todo: отдельный класс на получение
        resp.getWriter().println(requestPath);


        // todo: через рефлексию список контроллеров. у них методы с GetMapping и там
        //  либо есть модель либо только вью

        // todo: через handlermapping получаю список классов контроллеров
        // todo: они возвращают modalandview (а там список путь и ключ/значение)
        // todo: вьюрезолвер берет эти modalandview и идет по списку получая классы вью
        // todo: классы вью делают форвард на нужные вью и сохраняют модели в атрибутах

//        String packageToScan = "org/example";
//        Reflections scanner = new Reflections("org.example.site");
//        scanner.
//
//        System.out.println(classes.size());
//
//        for (Class<?> cls : classes) {
////            resp.getWriter().println(cls.getClass().getName());
//            System.out.println(cls.getName());
//        }

//        MyModelAndView modelAndViews =

    }
}


