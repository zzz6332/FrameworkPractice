package com.example.frameworktest.mvc.controller;

import com.example.frameworktest.mvc.model.Imodel;

public class MyController implements IController {
    private Imodel imodel;
    @Override
    public void setModel(Imodel model) {
        imodel = model;
    }

    @Override
    public void onClickButton() {
     imodel.requestData();
    }
}
