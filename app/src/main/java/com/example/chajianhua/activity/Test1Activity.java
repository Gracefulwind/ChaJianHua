package com.example.chajianhua.activity;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibrary.base.BaseActivity;
import com.example.chajianhua.R;

@Route(path = "/main/test1Activity")
public class Test1Activity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

    }
}
