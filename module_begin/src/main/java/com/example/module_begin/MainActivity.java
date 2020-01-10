package com.example.module_begin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.baselibrary.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
