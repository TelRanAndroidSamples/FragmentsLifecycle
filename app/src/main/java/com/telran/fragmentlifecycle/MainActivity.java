package com.telran.fragmentlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TEL-RAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "MainActivity onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "MainActivity onRestart()");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "MainActivity onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "MainActivity onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "MainActivity onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "MainActivity onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "MainActivity onDestroy()");
        super.onDestroy();
    }

}
