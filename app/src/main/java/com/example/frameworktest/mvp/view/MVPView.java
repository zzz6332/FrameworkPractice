package com.example.frameworktest.mvp.view;

import com.example.frameworktest.mvp.presenter.MVPPresenterImpl;

public interface MVPView {
    void setPresenter(MVPPresenterImpl presenter);
    void showData(String s);
}
