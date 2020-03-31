package com.example.frameworktest.mvp.presenter;

import com.example.frameworktest.mvp.model.IMVPModel;
import com.example.frameworktest.mvp.view.MVPView;

public interface IMVPPresenter {
    void setView(MVPView view);

    void setModel(IMVPModel model);

    void removeView();
}
