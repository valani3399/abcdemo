package com.example.sa04.abc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sa04.abc.RecyclerView.RecyclerActivity;

public class FirsPageActivity extends AppCompatActivity {
    Button btnsubmit;
    EditText tvrool,tvname,tvboold;
    private DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firs_page);
        btnsubmit=(Button)findViewById(R.id.btn_submit);
        tvboold=(EditText) findViewById(R.id.tv_boold_group);
        tvname=(EditText) findViewById(R.id.tv_name);
        tvrool=(EditText) findViewById(R.id.tv_rollno);
        dbHelper = new DbHelper(getApplicationContext());
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean is=dbHelper.inserRecord(tvrool.getText().toString(),
                        tvname.getText().toString(),
                        tvboold.getText().toString());
                if(is){
                    Intent f = new Intent(FirsPageActivity.this, RecyclerActivity.class);
                    startActivity(f);
                    finish();
                }
                else {
                    Toast.makeText(FirsPageActivity.this, "not insert", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
