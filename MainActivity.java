package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1,et2,et3;
    Button bt1,bt2,bt3,bt4;
    String rno;
    String name;
    String dept;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        DbHelper dbHelper = new DbHelper(this);
        db = dbHelper.getWritableDatabase();
        db = dbHelper.getReadableDatabase();
    }
    public void onInsert(View view) {
        rno = et1.getText().toString();
        name = et2.getText().toString();
        dept = et3.getText().toString();
        if (rno.equals("") || name.equals("") || dept.equals("")) {
            Toast.makeText(this,"please enter values",Toast.LENGTH_LONG).show();
        }
        else {
            ContentValues values = new ContentValues();
            values.put("rollno",rno);
            values.put("name",name);
            values.put("dept",dept);
            db.insert("student",null,values);
            Toast.makeText(this,"Inserted",Toast.LENGTH_LONG).show();
        }
    }

    public void onUpdate(View view) {
    }

    public void onRead(View view) {
    }

    public void onDelete(View view) {
    }
}