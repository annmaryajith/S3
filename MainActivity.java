package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String VALID_USERNAME="user";
    private static final String VALID_PASSWORD="password";

    private EditText usernameEditText1;
    private EditText passwordEditText2;
    private Button loginButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText1=findViewById(R.id.usernameEditText1);
        passwordEditText2=findViewById(R.id.passwordEditText2);
        loginButton=findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredUsername = usernameEditText1.getText().toString();
                String enteredPassword = passwordEditText2.getText().toString();
                if (isValidCredentials(enteredUsername, enteredPassword)) {
                    showToast("Login successful");
                }
                else {
                    showToast("Invalid credentials");
                }
            }
        }
        );}
    private boolean isValidCredentials(String enterUsername, String enteredPassword){
        return VALID_USERNAME.equals(enterUsername) && VALID_PASSWORD.equals(enteredPassword);
    }
    private void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}