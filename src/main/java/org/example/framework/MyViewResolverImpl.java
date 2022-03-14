package org.example.framework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyViewResolverImpl implements MyViewResolver{

    @Override
    public Map<HttpServletRequest, HttpServletResponse> showView(MyView view, MyModel model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //todo req.setAttribute(entry.getKey(), entry.getValue());
        Map<HttpServletRequest, HttpServletResponse> reqAndResp = new HashMap<>();
        reqAndResp.put(request, response);

        request.getRequestDispatcher(view.getName()).forward(request, response);
        return reqAndResp;
    }

    @Override
    public Map<HttpServletRequest, HttpServletResponse> showViewNotFound(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<HttpServletRequest, HttpServletResponse> reqAndResp = new HashMap<>();
        reqAndResp.put(request, response);

        request.getRequestDispatcher(""/* todo добавить путь к отображению ошибки 404*/).forward(request, response);
        return reqAndResp;
    }
}
