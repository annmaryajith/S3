package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFragment1 = findViewById(R.id.button);
        Button buttonFragment2 = findViewById(R.id.button2);

        buttonFragment1.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.framelayout, new FirstFragment())
                                .commit();
                    }
                }));

            buttonFragment2.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.framelayout, new SecondFragment())
                            .commit();
                }
        }));
    }
}