package com.mirea.vyaznikov.intentapp;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        Intent intent2 = getIntent();
        String data = intent2.getStringExtra("m");

        TextView txt = (TextView) findViewById(R.id.textView);
        txt.setText(data);


    }


}
