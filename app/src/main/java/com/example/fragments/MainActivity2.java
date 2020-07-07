package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addfrag();
        Intent I =getIntent();
        String var;
        var=I.getStringExtra("var");
        Toast.makeText(getApplicationContext(),var+"two",Toast.LENGTH_LONG).show();
    }
    private void addfrag(){
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        Fragment3 fragment3=new Fragment3();
        Fragment4 fragment4=new Fragment4();
        ft.add(R.id.frame1,fragment3);
        ft.add(R.id.frame2,fragment4);
        ft.commit();

    }
}