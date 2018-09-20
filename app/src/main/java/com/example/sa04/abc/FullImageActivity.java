package com.example.sa04.abc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.sa04.abc.Adepter.GridAdepter;


public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        GridAdepter gridAdepter = new GridAdepter(this);
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(gridAdepter.a[position]);

    }
}
