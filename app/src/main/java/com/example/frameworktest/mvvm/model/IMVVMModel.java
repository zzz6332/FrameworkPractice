package com.example.frameworktest.mvvm.model;

import com.example.frameworktest.mvvm.viewmodel.MVVMViewModel;

public interface IMVVMModel {
    void setViewModel(MVVMViewModel viewModel);

    void handleData(String s);
}
