package com.bacacoding.jamanalog;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;

import java.text.CollationElementIterator;

public class MainActivity extends AppCompatActivity {

    private static final android.R.attr R = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout."activity_main";
        View analogClock = (AnalogClock) findViewById(R.id."analogClock);
        Button "button"" = (Button) findViewById(R.id.button);
        analogClock.setVisibility(View.INVISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void onButtonClicked(View view){
        CollationElementIterator button;
        button.setText("Analog Clock");
        View analogClock;
        analogClock.setVisibility(View.VISIBLE);
    }
}