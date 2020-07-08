package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_USER = MainActivity.class.getName() + "_USER_EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startActivity2Button = findViewById(R.id.START_ACTIVITY_2_BUTTON);
        startActivity2Button.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra(EXTRA_USER, new User("osayd", 21, 116));
            startActivity(i);
        });

        Toast.makeText(getApplicationContext(), "Hello from Activity one", Toast.LENGTH_LONG).show();
    }
}