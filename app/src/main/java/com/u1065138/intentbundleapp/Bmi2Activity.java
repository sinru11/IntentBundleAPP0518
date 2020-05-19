package com.u1065138.intentbundleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bmi2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi2);


            CalBmi();

    }
    protected void CalBmi(){
        Double height,weight,bmi;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null){

            height = Double.parseDouble(bundle.getString("HEIGHT"));
            weight = Double.parseDouble(bundle.getString("WEIGHT"));

            height = height/100;
            bmi = weight/(height*height);

            String result ="正常";
            if (bmi<35 && bmi>30)
                result = "中度肥胖";
            else if (bmi<30 && bmi>27)
                result = "輕度肥胖";

            TextView texBMI = findViewById(R.id.txvBMI);
            texBMI.setText("BMI:" + bmi+"\n" + result);


        }

    }

    public void btnOK(View view) {
        finish();
    }
}
