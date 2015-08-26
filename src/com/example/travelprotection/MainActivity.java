package com.example.travelprotection;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends Activity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b=(Button)findViewById(R.id.button1);
        b.setBackgroundColor(0x77FF0000);
        
        int i=0;
    }

}
