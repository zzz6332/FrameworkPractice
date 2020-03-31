package com.example.frameworktest.mvc.model;

import com.example.frameworktest.mvc.view.IView;

public class MyModel implements Imodel {
    private IView view;
    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void requestData() {
      view.upDate("model网络请求获得的数据");
    }

    @Override
    public void onViewDestroyed() {
        this.view = null;
    }
}
