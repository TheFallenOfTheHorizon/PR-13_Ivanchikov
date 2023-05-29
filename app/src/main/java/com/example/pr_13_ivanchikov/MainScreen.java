package com.example.pr_13_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.imageView9:
                Toast.makeText(this, "Спокойным", Toast.LENGTH_SHORT).show();break;
            case R.id.imageView11:
                Toast.makeText(this, "Расслабленным", Toast.LENGTH_SHORT).show();break;
            case R.id.imageView12:
                Toast.makeText(this, "Сосредоточенным", Toast.LENGTH_SHORT).show();break;
            case R.id.imageView13:
                Toast.makeText(this, "Взволнованным", Toast.LENGTH_SHORT).show();
                break;
        }
}   }