package com.lauchlantoal.csci3130assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * The class for inputting one's password and checking its strength.
 */
public class PasswordInput extends AppCompatActivity {

    @Override
    /**
     * Creates an activity/view.
     *
     * @param savedInstanceState A Bundle. (Need to look into what this actually does.)
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_input2);
    }

    /**
     * Takes the string from the EditText, passes it to the Validator.validate() method, and
     * displays if the password is strong or weak in the TextView.
     *
     * @param view A View object, allows the method to access the things in the view.
     */
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
