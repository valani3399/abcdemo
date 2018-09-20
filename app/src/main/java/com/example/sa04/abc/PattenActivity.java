package com.example.sa04.abc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PattenActivity extends AppCompatActivity {
    EditText etnumber;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patten);
        textView=(TextView) findViewById(R.id.et_patten);
        etnumber=(EditText)findViewById(R.id.et_number);
        button=(Button)findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = "";
                Integer n= Integer.parseInt(etnumber.getText().toString());
                for(int i=1; i<=n; i++)
                {
                    String t = "";
                    for(int j=1; j<=i; j++)
                    {
                        t = t + "*";
                    }
                    temp = temp + t + "\n";
                }
                textView.setText(temp);
            }
        });



    }
}
