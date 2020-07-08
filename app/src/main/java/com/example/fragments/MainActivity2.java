package com.example.fragments;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static com.example.fragments.MainActivity.EXTRA_USER;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView activityData = findViewById(R.id.ACTIVITY_DATA);

        if (savedInstanceState == null) {
            addFragmentsToActivity();
        }

        Toast.makeText(getApplicationContext(), "Hello from Activity two", Toast.LENGTH_LONG).show();

        User user = getIntent().getParcelableExtra(EXTRA_USER);

        assert user != null;
        activityData.setText(String.format(Locale.ENGLISH, " %s %d %d", user.getName(), user.getAge(), user.getId()));

    }

    private void addFragmentsToActivity() {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment3 fragment3 = new Fragment3();
        Fragment4 fragment4 = new Fragment4();
        ft.add(R.id.frame1, fragment3);
        ft.add(R.id.frame2, fragment4);
        ft.commit();
    }
}