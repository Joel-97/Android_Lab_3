package com.abc.android_lab_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityTest : AppCompatActivity() {

    @Override
    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }
}

