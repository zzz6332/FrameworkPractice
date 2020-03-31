package com.example.frameworktest.mvp.presenter;

import com.example.frameworktest.mvp.model.IMVPModel;
import com.example.frameworktest.mvp.model.MVPModel;
import com.example.frameworktest.mvp.view.MVPView;

public class MVPPresenter implements MVPPresenterImpl {
    private MVPView view;
    private IMVPModel model;
    @Override
    public void onButtonClicked() {
        model.getData();
    }

    @Override
    public void onDataBack(String s) {
       view.showData("网络请求数据");
    }

    @Override
    public void setView(MVPView view) {
        this.view = view;
        setModel(new MVPModel());
    }

    @Override
    public void setModel(IMVPModel model) {
     this.model = model;
     model.setPresenter(this);
    }

    @Override
    public void removeView() {
        this.view = null;
    }
}
