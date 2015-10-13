package com.example.ajlaeltabari.andorid2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    public static final String BMI = "bmi";

    private Button mGetBmi;
    private EditText heightStr;
    private EditText weightStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGetBmi = (Button)findViewById(R.id.getBMI);

        mGetBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bmi.class);
                i.putExtra(BMI, calculateBmi());
                startActivity(i);
            }
        });
    }

    public Integer calculateBmi() {
        heightStr = (EditText)findViewById(R.id.height);
        weightStr = (EditText)findViewById(R.id.weight);

        Integer height = Integer.parseInt(heightStr.getText().toString());
        Integer weight = Integer.parseInt(weightStr.getText().toString());

        Integer bmi = (weight / height * height) * 10000;

        return bmi;

    }

}
