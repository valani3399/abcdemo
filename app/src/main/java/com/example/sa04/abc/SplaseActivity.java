package com.example.sa04.abc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextView;

public class SplaseActivity extends AppCompatActivity {
    private Handler mWaitHandler = new Handler();
    AnalogClock analogClock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splase);
        analogClock=(AnalogClock)findViewById(R.id.anlog);
        mWaitHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(SplaseActivity.this, nav.class);
                    startActivity(intent);
                    finish();
                }

        }, 200);  // Give a 2 seconds delay.

    }

}
