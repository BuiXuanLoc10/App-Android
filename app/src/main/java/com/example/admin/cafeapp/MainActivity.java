package com.example.admin.cafeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rG;
    RadioButton rbDec;
    RadioButton rbCol;
    RadioButton rbExp;
    CheckBox chbCream;
    CheckBox chbSugar;
    Button btPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rG = (RadioGroup)findViewById(R.id.radioGroup);
        rbDec = (RadioButton)findViewById(R.id.rbDecaf);
        rbCol = (RadioButton)findViewById(R.id.rbColombian);
        rbExp = (RadioButton)findViewById(R.id.rbExpresso);
        chbCream = (CheckBox)findViewById(R.id.chbCream);
        chbSugar = (CheckBox)findViewById(R.id.chbSugar);
        btPay = (Button)findViewById(R.id.btPay);
    btPay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String msg = "Cafe";
            int id = rG.getCheckedRadioButtonId();
            switch(id){
                case R.id.rbDecaf:
                    msg = "Decaf " + msg;
                    break;
                case R.id.rbColombian:
                    msg = "Colombian " + msg;
                    break;
                case R.id.rbExpresso:
                    msg = "Expresso " + msg;
                    break;
            }
            if(chbCream.isChecked() == true)
                msg += " & Cream";
            if(chbSugar.isChecked() == true)
                msg += " & Sugar";
            Toast.makeText(MainActivity.this, msg.toString(),Toast.LENGTH_LONG).show();
        }
    });

    }
}
