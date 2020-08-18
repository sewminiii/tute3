package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etnum1;
    EditText etnum2;

    TextView result;

    String number1;
    String number2;

    int n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etnum1 = findViewById(R.id.text1);
        etnum2 = findViewById(R.id.text2);
        result = findViewById(R.id.result);

        Intent intent = getIntent();

        String number1 = intent.getStringExtra("n1");
        String number2 = intent.getStringExtra("n2");

        etnum1.setText(number1);
        etnum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view){
        result.setText(n1+" + "+ n2 +" = "+(n1+n2));
    }
    public void substraction(View view){
        result.setText(n1+" - "+n2+" = "+(n1 - n2));
    }
    public void multiply(View view){
        result.setText(n1+" x "+n2+" = "+(n1 * n2));
    }
    public void divide(View view){
        result.setText(n1+" / "+n2+" = "+(n1 / n2));
    }
}