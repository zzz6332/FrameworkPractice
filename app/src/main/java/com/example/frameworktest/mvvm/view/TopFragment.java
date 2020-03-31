package com.example.frameworktest.mvvm.view;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.frameworktest.R;
import com.example.frameworktest.mvvm.viewmodel.MVVMViewModel;

public class TopFragment extends Fragment {
    private TextView tv;
    private MVVMViewModel viewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragement_top,container,false);
        viewModel = ViewModelProviders.of(getActivity()).get(MVVMViewModel.class);
        tv = view.findViewById(R.id.tv);
        viewModel.getLiveData().observe(getActivity(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
              tv.setText(s);
            }
        });
        return view;
    }
}
