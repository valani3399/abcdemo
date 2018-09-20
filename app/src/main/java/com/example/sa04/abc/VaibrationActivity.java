package com.example.sa04.abc;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VaibrationActivity extends AppCompatActivity {
    Button btnstart,btnstop;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaibration);
        btnstart=(Button)findViewById(R.id.btn_start_vaibration);
        btnstop=(Button)findViewById(R.id.btn_stop_vaibration);

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final long[] pattern = {2000, 2000};
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,0);
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.cancel();
            }
        });


    }
}
