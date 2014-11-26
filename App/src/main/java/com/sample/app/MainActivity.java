package com.sample.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sample.library.Library;
import com.sample.library.Service;

import javax.inject.Inject;


public class MainActivity extends Activity {

    @Inject
    public Library library;

    @Inject
    public Service service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((StartApplication) getApplication()).inject(this);

        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText(library.getMessage());

        textView = (TextView) findViewById(R.id.text2);
        textView.setText(String.valueOf(service.getValue()));
    }
    
}
