package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.button);
        bt.setOnClickListener(this);
        Toast.makeText(getApplicationContext(),"Hello from Activity one",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {

        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        i.putExtra("user",new user("osayd",21,116));
        startActivity(i);

    }
}