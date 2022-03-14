package org.example.framework;

import java.util.HashMap;
import java.util.Map;

public class MyModelAndViewImpl implements MyModelAndView {
    private String viewName;
    private Map<String, Map<String, Object>> model;

    public MyModelAndViewImpl(String viewName) {
        this(viewName, new HashMap<>());
    }

    public MyModelAndViewImpl(String viewName, Map<String, Map<String, Object>> model) {
        this.viewName = viewName;
        this.model = model;
    }
}
