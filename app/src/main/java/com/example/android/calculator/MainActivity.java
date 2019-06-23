package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1 = 0;
    double num2 = 0;
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayResult(double result){
        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);
        resultTextView.setText(String.valueOf(result));
    }

    public void displayText(String string){
        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);
        resultTextView.setText(string);
    }

    public double findText1(){
        EditText num1EditText = (EditText) findViewById(R.id.number_1_edit_text);
        try {
            double number1 = Integer.parseInt(num1EditText.getText().toString());
            return number1;
        }
        catch (Exception e){
            return 0.0;
        }
    }

    public double findText2(){
        EditText num2EditText = (EditText) findViewById(R.id.number_2_edit_text);
        try {
            double number2 = Integer.parseInt(num2EditText.getText().toString());
            return number2;
        }
        catch (Exception e){
            return 0.0;
        }
    }

    public void add(View view){
        num1 = findText1();
        num2 = findText2();

        result = num1 + num2;
        displayResult(result);
    }

    public void substract(View view){
        num1 = findText1();
        num2 = findText2();

        result = num1 - num2;
        displayResult(result);
    }

    public void into(View view){
        num1 = findText1();
        num2 = findText2();

        result = num1 * num2;
        displayResult(result);
    }

    public void divide(View view){
        num1 = findText1();
        num2 = findText2();

        if (num2 == 0){
            displayText("Undefined");
        }
        else {
            result = num1 / num2;
            displayResult(result);
        }
    }

    public void square(View view){
        num1 = findText1();

        result = num1 * num1;
        displayResult(result);
    }

    public void sqroot(View view){
        num1 = findText1();

        result = Math.sqrt(num1);
        displayResult(result);
    }

    public void tothepower(View view){
        num1 = findText1();
        num2 = findText2();

        result = Math.pow(num1, num2);
        displayResult(result);
    }

    public void factorial(View view){
        num1 = findText1();

        if (num1 == 0) {
            displayResult(1.0);
        }
        else {
            int fact = (int) num1;
            for (int i = 1; i < fact; i++)
                num1 *= i;
            displayResult(num1);
        }
    }
}
