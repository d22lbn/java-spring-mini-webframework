package org.example.framework;

import java.util.HashMap;
import java.util.Map;

public class MyModelAndViewImpl implements MyModelAndView {
    MyView view;
    MyModel model;
    private Map<MyView, MyModel> modelsAndViews;

    @Override
    public MyModel getModel() {
        return null; // todo: что-то возвращает
    }

    @Override
    public MyView getView() {
        return null; // todo что-то возвращает
    }
//    private String viewName;
//    private Map<String, Map<String, Object>> model;
//
//    public MyModelAndViewImpl(String viewName) {
//        this(viewName, new HashMap<>());
//    }
//
//    public MyModelAndViewImpl(String viewName, Map<String, Map<String, Object>> model) {
//        this.viewName = viewName;
//        this.model = model;
//    }
}
