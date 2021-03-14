package com.mirea.vyaznikov.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        //Intent intent = new Intent(this, SecondActivity.class);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key", "MIREA - ФАМИЛИЯ ИМЯ ОТЧЕТСВО СТУДЕНТА");
        startActivity(intent);

        //startActivity(intent);
    }



}