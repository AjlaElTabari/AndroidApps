package com.example.ajlaeltabari.andorid2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class bmi extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        int bmi = getIntent().getExtras().getInt(MainActivity.BMI);

        TextView tv = (TextView) findViewById(R.id.bmi);
        if (bmi < 20) {
            tv.setText(R.string.bmi1);
        } //else if ()
    }

}
