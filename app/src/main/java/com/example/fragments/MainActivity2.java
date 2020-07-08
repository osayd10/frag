package com.example.fragments;

import android.os.Bundle;
import android.widget.Toast;
import com.example.fragments.databinding.ActivityMain2Binding;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import static com.example.fragments.MainActivity.EXTRA_USER;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding activityMain2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        User user = getIntent().getParcelableExtra(EXTRA_USER);
        activityMain2Binding.setUser(user);

        if (savedInstanceState == null) {
            addFragmentsToActivity();
        }
        Toast.makeText(getApplicationContext(), "Hello from Activity two", Toast.LENGTH_LONG).show();
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