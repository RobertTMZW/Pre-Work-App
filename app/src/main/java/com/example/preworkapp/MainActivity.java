package com.example.preworkapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.chartreuse));

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String replaceText = ((EditText) findViewById(R.id.editText )).getText().toString();
              if(TextUtils.isEmpty(replaceText)){
                  ((TextView) findViewById(R.id.textView2)).setText("Hello from Robert!");
              }
              else {
                ( (TextView) findViewById(R.id.textView2)).setText(replaceText);
            }}
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            ((TextView) findViewById(R.id.textView2)).setText("Hello from Robert!");
            }

        });




    }
}
