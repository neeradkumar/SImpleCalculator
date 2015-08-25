package com.bard.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstNumber = (EditText) findViewById(R.id.first_number);
        final EditText secondNumber = (EditText) findViewById(R.id.second_number);

        Button plusButton = (Button) findViewById(R.id.plus_button);
        Button minusButton = (Button) findViewById(R.id.minus_button);
        Button multiplyButton = (Button) findViewById(R.id.multiply_button);
        Button divisionButton = (Button) findViewById(R.id.divide_button);

        final TextView resultText = (TextView) findViewById(R.id.result_text);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberString = firstNumber.getText().toString();
                if(firstNumberString.equals("")){
                    firstNumber.setError("Can't be empty");
                    return;
                }
                String secondNumberString = secondNumber.getText().toString();
                if(secondNumberString.equals("")){
                    secondNumber.setError("Can't be empty");
                    return;
                }
                double firstArgument = Double.parseDouble(firstNumberString);
                double secondArgument = Double.parseDouble(secondNumberString);
                double answer = firstArgument+secondArgument;
                resultText.setText(answer+"");

            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberString = firstNumber.getText().toString();
                if(firstNumberString.equals("")){
                    firstNumber.setError("Can't be empty");
                    return;
                }
                String secondNumberString = secondNumber.getText().toString();
                if(secondNumberString.equals("")){
                    secondNumber.setError("Can't be empty");
                    return;
                }
                double firstArgument = Double.parseDouble(firstNumberString);
                double secondArgument = Double.parseDouble(secondNumberString);
                double answer = firstArgument-secondArgument;
                resultText.setText(answer+"");

            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberString = firstNumber.getText().toString();
                if(firstNumberString.equals("")){
                    firstNumber.setError("Can't be empty");
                    return;
                }
                String secondNumberString = secondNumber.getText().toString();
                if(secondNumberString.equals("")){
                    secondNumber.setError("Can't be empty");
                    return;
                }
                double firstArgument = Double.parseDouble(firstNumberString);
                double secondArgument = Double.parseDouble(secondNumberString);
                double answer = firstArgument*secondArgument;
                resultText.setText(answer+"");

            }
        });
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberString = firstNumber.getText().toString();
                if(firstNumberString.equals("")){
                    firstNumber.setError("Can't be empty");
                    return;
                }
                String secondNumberString = secondNumber.getText().toString();
                if(secondNumberString.equals("")){
                    secondNumber.setError("Can't be empty");
                    return;
                }
                double firstArgument = Double.parseDouble(firstNumberString);
                double secondArgument = Double.parseDouble(secondNumberString);
                double answer = firstArgument/secondArgument;
                resultText.setText(answer+"");

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
