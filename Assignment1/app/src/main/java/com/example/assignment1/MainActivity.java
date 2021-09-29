package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button num1Text;
    Button num2Text;
    Button num3Text;
    Button num4Text;
    Button num5Text;
    Button num6Text;
    Button num7Text;
    Button num8Text;
    Button num9Text;
    Button num0Text;
    Button additionButt;
    Button subtractionButt;
    Button multiplicationButt;
    Button divisionButt;
    Button clearButton;
    Button equalsButton;
    Button advancedButton;
    TextView calculation;
    TextView history;
    String calculationString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator c = new Calculator();

        // Number buttons
        num1Text = (Button) findViewById(R.id.numberOne);
        num2Text = (Button) findViewById(R.id.numberTwo);
        num3Text = (Button) findViewById(R.id.numberThree);
        num4Text = (Button) findViewById(R.id.numberFour);
        num5Text = (Button) findViewById(R.id.numberFive);
        num6Text = (Button) findViewById(R.id.numberSix);
        num7Text = (Button) findViewById(R.id.numberSeven);
        num8Text = (Button) findViewById(R.id.numberEight);
        num9Text = (Button) findViewById(R.id.numberNine);
        num0Text = (Button) findViewById(R.id.numberZero);

        // Operator buttons
        additionButt = (Button) findViewById(R.id.additionSymbol);
        subtractionButt = (Button) findViewById(R.id.minusSymbol);
        multiplicationButt = (Button) findViewById(R.id.multiplicationSymbol);
        divisionButt = (Button) findViewById(R.id.divisionSymbol);

        // Other buttons
        clearButton = (Button) findViewById(R.id.clearButton);
        equalsButton = (Button) findViewById(R.id.equalsSymbol);
        advancedButton = (Button) findViewById(R.id.advanced);

        // TextViews
        calculation = (TextView) findViewById(R.id.calculation);
        history = (TextView) findViewById(R.id.historyArea);

        // ===================
        // = Event listeners =
        // ===================

        // Number key event listeners
        num1Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num1Text.getText().toString());
                calculationString += num1Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num2Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num2Text.getText().toString());
                calculationString += num2Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num3Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num3Text.getText().toString());
                calculationString += num3Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num4Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num4Text.getText().toString());
                calculationString += num4Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num5Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num5Text.getText().toString());
                calculationString += num5Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num6Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num6Text.getText().toString());
                calculationString += num6Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num7Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num7Text.getText().toString());
                calculationString += num7Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num8Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num8Text.getText().toString());
                calculationString += num8Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num9Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num9Text.getText().toString());
                calculationString += num9Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        num0Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(num0Text.getText().toString());
                calculationString += num0Text.getText().toString();
                calculation.setText(calculationString);
            }
        });

        // Operator button event listeners
        additionButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(additionButt.getText().toString());
                calculationString += additionButt.getText().toString();
                calculation.setText(calculationString);
            }
        });

        subtractionButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(subtractionButt.getText().toString());
                calculationString += subtractionButt.getText().toString();
                calculation.setText(calculationString);
            }
        });

        multiplicationButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(multiplicationButt.getText().toString());
                calculationString += multiplicationButt.getText().toString();
                calculation.setText(calculationString);
            }
        });

        divisionButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.push(divisionButt.getText().toString());
                calculationString += divisionButt.getText().toString();
                calculation.setText(calculationString);
            }
        });


        // Other button event listeners
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.clear();
                calculationString = "";
                calculation.setText("");
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempCalcString = calculationString + " = " + c.calculate();
                c.addToHistory(tempCalcString);
                history.setText(c.getHistory());
                calculation.setText(String.valueOf(c.calculate()));
            }
        });

        advancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (history.getVisibility() == View.INVISIBLE) {
                    history.setVisibility(View.VISIBLE);
                    advancedButton.setText("STANDARD - NO HISTORY");
                }
                else {
                    history.setVisibility(View.INVISIBLE);
                    advancedButton.setText("ADVANCED - WITH HISTORY");
                }
            }
        });

    }

}