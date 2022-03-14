package org.example.framework;

public class MyViewImpl implements MyView {
    private String viewName;

    @Override
    public String getName() {
        return viewName;
    }
}
