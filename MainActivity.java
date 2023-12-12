package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText name,lname;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.name);
        lname= findViewById(R.id.lname);
        button= findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String fname=name.getText().toString();
            String llname= lname.getText().toString();

            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("keyname", fname);
            intent.putExtra("keylname", llname);
            startActivity(intent);
        });
    }
}