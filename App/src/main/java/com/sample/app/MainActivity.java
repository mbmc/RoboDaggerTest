package com.sample.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sample.library.Library;

import javax.inject.Inject;


public class MainActivity extends Activity {

    @Inject
    public Library library;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((StartApplication) getApplication()).inject(this);

        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText(library.getMessage());
    }
    
}
