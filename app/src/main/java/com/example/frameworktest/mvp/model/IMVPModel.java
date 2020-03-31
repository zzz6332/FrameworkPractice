package com.example.frameworktest.mvp.model;

import com.example.frameworktest.mvp.presenter.MVPPresenterImpl;

public interface IMVPModel {
    void setPresenter(MVPPresenterImpl presenter);
    void getData();
}
