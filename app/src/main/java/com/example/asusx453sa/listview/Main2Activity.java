package com.example.asusx453sa.listview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        hasil = (TextView)findViewById(R.id.output);
        Intent a = getIntent();
        String b = a.getStringExtra("hasil");
        hasil.setText(b);

    }



}
