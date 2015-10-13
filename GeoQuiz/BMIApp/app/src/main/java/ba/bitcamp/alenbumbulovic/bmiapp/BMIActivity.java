package ba.bitcamp.alenbumbulovic.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class BMIActivity extends AppCompatActivity {

    public int getBmi(){
        EditText height = (EditText)findViewById(R.id.height);
        int height1 = Integer.parseInt(height.getText().toString());

        EditText weight = (EditText)findViewById(R.id.weight);
        int weight1 = Integer.parseInt(weight.getText().toString());

        int bmi = (weight1 / (height1 * height1))*10000;

        return bmi;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }
}
