package org.example.framework;

import java.util.Map;

public class MyModelAndView {
    private Map<String, Object> model;
    private String viewName;

    public MyModelAndView(String viewName) {
        this.viewName = viewName;
    }

    public MyModelAndView(Map<String, Object> model, String viewName) {
        this.model = model;
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
