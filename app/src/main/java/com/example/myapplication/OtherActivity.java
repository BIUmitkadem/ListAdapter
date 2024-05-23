package com.example.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        textView = findViewById(R.id.text);

        int itemID = getIntent().getIntExtra("itemID", 0);

        textView.setText(String.format("Item ID: %d", itemID));
    }
}