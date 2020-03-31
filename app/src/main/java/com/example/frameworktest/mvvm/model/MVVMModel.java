package com.example.frameworktest.mvvm.model;

import com.example.frameworktest.mvvm.viewmodel.MVVMViewModel;

public class MVVMModel implements IMVVMModel {
    private MVVMViewModel viewModel;
    public MVVMModel(MVVMViewModel viewModel){
        this.viewModel = viewModel;
    }
    @Override
    public void setViewModel(MVVMViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void handleData(String s) {
        viewModel.onDataBack(s);
    }
}
