package com.example.vhr_android_demo;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * Created by *** on 2016/10/10.
 */

public class LoginDoneActivity extends FragmentActivity {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list_fragment);
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_word, new EmployeeFragment());
        fragmentTransaction.add(R.id.fragment_meaning, new MeaningFragment());
        fragmentTransaction.commit();

    }
}