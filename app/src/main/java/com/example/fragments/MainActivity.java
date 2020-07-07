package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt;
    private String s="Hello in Activity ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.button);
        bt.setOnClickListener(this);
        Toast.makeText(getApplicationContext(),s+"one",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        i.setAction(i.ACTION_SEND);
        i.putExtra("var",s);
        startActivity(i);

    }
}