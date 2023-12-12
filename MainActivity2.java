package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name,lname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name =findViewById(R.id.textname);
        lname =findViewById(R.id.textage);

        String fname = getIntent().getStringExtra("keyname");
        String llname = getIntent().getStringExtra("keylname");

        name.setText(fname);
        lname.setText(llname);
    }
}