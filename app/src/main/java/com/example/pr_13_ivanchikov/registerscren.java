package com.example.pr_13_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registerscren extends AppCompatActivity {
 EditText email;
 EditText password;
 String e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerscren);
        email=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
        e1= String.valueOf(email.getText());
    }
    public void onClick(View v) {
    if (e1!="" && password!=null) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);}

    }
}