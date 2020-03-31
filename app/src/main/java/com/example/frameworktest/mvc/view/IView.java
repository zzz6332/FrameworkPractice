package com.example.frameworktest.mvc.view;

import com.example.frameworktest.mvc.controller.IController;

public interface IView {
    void upDate(String s);
    void setController(IController controller);
}
