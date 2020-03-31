package com.example.frameworktest.mvc.controller;

import com.example.frameworktest.mvc.model.Imodel;

public interface IController {
    void setModel(Imodel model);
    void onClickButton();
}
