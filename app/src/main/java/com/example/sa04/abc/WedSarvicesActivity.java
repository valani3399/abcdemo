package com.example.sa04.abc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sa04.abc.R;

public class WedSarvicesActivity extends AppCompatActivity  {
    Button btnpost,btnget,btnput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wed_sarvices);
        btnpost=(Button)findViewById(R.id.btn_post);
        btnget=(Button)findViewById(R.id.btn_get);
        btnput=(Button)findViewById(R.id.btn_put);
        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WedSarvicesActivity.this, GetMethodActivity.class);
                startActivity(intent);
            }
        });
        btnpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WedSarvicesActivity.this, PostMethodActivity.class);
                startActivity(intent);
            }
        });
        btnput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WedSarvicesActivity.this, PutMethodActivity.class);
                startActivity(intent);
            }
        });


    }
}
