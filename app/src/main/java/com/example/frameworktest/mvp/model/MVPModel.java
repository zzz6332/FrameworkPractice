package com.example.frameworktest.mvp.model;

import com.example.frameworktest.mvp.presenter.MVPPresenterImpl;

public class MVPModel implements IMVPModel {
    private MVPPresenterImpl presenter;
    @Override
    public void setPresenter(MVPPresenterImpl presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getData() {
        presenter.onDataBack("网络请求数据");
    }
}
