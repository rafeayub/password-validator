package com.example.rayub.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TypePassword extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_password);
    }

    public void validate(View view)
    {
        EditText editText = findViewById(R.id.editText);
        Validator val = new Validator(editText.toString());
        TextView text = findViewById(R.id.textView);


        if (val.isValid())
        {
            text.setText("Good password");
        }
        else
        {
            text.setText("Bad password");
        }
    }
}
