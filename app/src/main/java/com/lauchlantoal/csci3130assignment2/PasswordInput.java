package com.lauchlantoal.csci3130assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_input2);
    }

    public void checkPassword(View view){
        EditText textbox = findViewById(R.id.editText);
        String password = textbox.getText().toString();
        Validator checker = new Validator();
        int strength = checker.validate(password);
        String message = "Weak Password";
        if(strength == 5){
            message = "Strong Password";
        }
        TextView alert = findViewById(R.id.textView2);
        alert.setText(message);
        return;
    }

}
