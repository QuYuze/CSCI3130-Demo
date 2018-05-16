package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.acme.csci3130_demo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void sendMessage(View view) {

        // copy and display the text
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.textView);
        textView1.setText(message);

    }
}
