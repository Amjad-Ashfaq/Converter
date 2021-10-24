package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText Text1;
private EditText Text3;
private Button btn1;
private Double val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text1=(EditText)findViewById(R.id.text1);
        Text3=(EditText)findViewById(R.id.text3);
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(Text1.getText().toString()))
                {

                }
                else if(Text1.getText().toString().length()>1){
                    val = Double.parseDouble(Text1.getText().toString());
                    val = val * 1000;
                    Text3.setText(val.toString());

                }

            }
        });



    }
}