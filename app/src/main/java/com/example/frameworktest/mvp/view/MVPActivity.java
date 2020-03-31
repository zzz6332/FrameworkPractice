package com.example.frameworktest.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.frameworktest.R;
import com.example.frameworktest.mvp.presenter.MVPPresenterImpl;
import com.example.frameworktest.mvp.presenter.MVPPresenter;

public class MVPActivity extends AppCompatActivity implements MVPView {
    private MVPPresenterImpl presenter = new MVPPresenter();
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_p);
        init();
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClicked();
            }
        });
    }

    private void init() {
        setPresenter(presenter);
        presenter.setView(this);
    }

    @Override
    public void setPresenter(MVPPresenterImpl presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showData(String s) {
       btn.setText(s);
    }
}
