package com.mirea.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView phone;
    ImageView image;
    TextView txt;
    Button btn;
    CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = (TextView) findViewById(R.id.editTextPhone);
        image = (ImageView) findViewById(R.id.imageView);
        txt = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        chk = (CheckBox) findViewById(R.id.checkBox);

        image.setImageResource(R.drawable.picture);
        phone.setText("+7 (911)111-11-11");

        txt.setText("New text in MIREA");
        btn.setText("MireaButton");
        chk.setChecked(true);



    }

    public void ButtonCancelClick(View v)
    {

    }
}