package com.weopencom.scary.androidintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Implicit Intent /Open a browser
        /*Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.javatpoint.com"));
         startActivity(intent);*/

        Button button=(Button)findViewById(R.id.button);
        final EditText etInput=(EditText)findViewById(R.id.textView) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get Value from Input Form
                String name=etInput.getText().toString();
                Intent intent=new Intent(getApplicationContext(),NextActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

    }
}
