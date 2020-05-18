package com.u1065138.intentbundleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtHeight, edtWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);

    }
    public void btnBMI(View view) {

       Intent intent = new Intent();
       intent.setClass(MainActivity.this,Bmi2Activity.class);

       Bundle bundle =new Bundle();
       bundle.putString("HEIGHT",edtHeight.getText().toString());
       bundle.putString("WEIGHT",edtWeight.getText().toString());
       intent.putExtras(bundle);
       startActivity(intent);
       
    }
}


