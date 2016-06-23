package com.weopencom.scary.androidintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //Create Intent Object and get Value from first activity

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");

        //Set Text into Text View
        TextView txt=(TextView)findViewById(R.id.textView);
        txt.setText(name);
    }
}
