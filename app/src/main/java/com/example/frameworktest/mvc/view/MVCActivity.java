package com.example.frameworktest.mvc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.frameworktest.R;
import com.example.frameworktest.mvc.controller.IController;
import com.example.frameworktest.mvc.controller.MyController;
import com.example.frameworktest.mvc.model.Imodel;
import com.example.frameworktest.mvc.model.MyModel;

public class MVCActivity extends AppCompatActivity implements IView {
    private Button btn;
    private IController controller;
    private Imodel imodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_c);
        btn = findViewById(R.id.button);
        initMVC();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            controller.onClickButton();
            }
        });
    }
     private void initMVC(){
         controller = new MyController();
         imodel = new MyModel();
         setController(controller);
         controller.setModel(imodel);
         imodel.setView(this);
     }
    @Override
    public void upDate(String s) {
      btn.setText("从model得到的数据：" + s);
    }

    @Override
    public void setController(IController controller) {
     this.controller = controller;
    }
}
