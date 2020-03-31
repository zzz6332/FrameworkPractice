package com.example.frameworktest.mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.frameworktest.mvvm.model.IMVVMModel;
import com.example.frameworktest.mvvm.model.MVVMModel;

public class MVVMViewModel extends ViewModel {
    private final MutableLiveData<String> liveData = new MutableLiveData<>();
    private IMVVMModel model = new MVVMModel(this);

    public MutableLiveData<String> getLiveData() {
        return liveData;
    }

    public void textChanged(String s) {
        model.handleData(s);
    }

    public void onDataBack(String s) {
        liveData.postValue(s);
    }
}
