package com.example.eastgate_dev.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
            Log.d("myTag", String.valueOf(view.getId()));
            String output;
            output = "Hello " + editText.getText().toString() + " from Button 1!";
            textView.setText(output);
        }
        if (view.getId() == R.id.btn2) {
            Log.d("myTag", String.valueOf(view.getId()));
            String output;
            output = "Hello " + editText.getText().toString() + " from Button 2!";
            textView.setText(output);
        }
    }
}

