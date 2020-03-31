package com.example.frameworktest.mvc.model;

import com.example.frameworktest.mvc.view.IView;

public interface Imodel {
    void setView(IView view);
    void requestData();
    void onViewDestroyed();
}
