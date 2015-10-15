package com.example.ajlaeltabari.todo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends ActionBarActivity {

    private Button mAddTask;
    private EditText mTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddTask = (Button)findViewById(R.id.btnAddTask);
        mTask = (EditText)findViewById(R.id.txtTask);

        mAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout cbsTasks = (LinearLayout) findViewById(R.id.cbsTasks);

                CheckBox task = new CheckBox(MainActivity.this);
                task.setText(mTask.getText().toString());
                cbsTasks.addView(task);
            }
        });
    }
}
