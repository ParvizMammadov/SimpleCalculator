package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        Button divideBtn = (Button) findViewById(R.id.divideBtn);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double result = num1 + num2;

                resultTextView.setText(result + "");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double result = num1 - num2;

                resultTextView.setText(result + "");
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double result = num1 * num2;

                resultTextView.setText(result + "");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double result = num1 / num2;

                resultTextView.setText(result + "");
            }
        });
    }
}