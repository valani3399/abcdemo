package com.example.sa04.abc.RecyclerView;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.sa04.abc.Adepter.AttendanceAdepter;
import com.example.sa04.abc.Adepter.carditemAdapter;
import com.example.sa04.abc.DbHelper;
import com.example.sa04.abc.Model.AppModel;
import com.example.sa04.abc.R;

import java.util.ArrayList;

public class AttendanceRecyclerActivity extends AppCompatActivity {
    private RecyclerView redemo;
    private GridLayoutManager gridLayoutManager;
    TextView tvpresent,tvabsert,tvtotal;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_recycler);
        redemo = (RecyclerView) findViewById(R.id.attendance_recyclew_view);
        gridLayoutManager = new GridLayoutManager(this,4);
        redemo.setLayoutManager(gridLayoutManager);
        tvabsert=(TextView)findViewById(R.id.tv_absert);
        tvpresent=(TextView)findViewById(R.id.tv_present);
        tvtotal=(TextView)findViewById(R.id.tv_total);

        ArrayList<AppModel> data = new ArrayList<>();
        for (int i = 0; i <=40; i++) {
            AppModel appModel = new AppModel();
            appModel.setNumber(i);
            appModel.setCount("" +count);
            data.add(appModel);
        }
        int s=data.size();
        tvtotal.setText("" + s);


        AttendanceAdepter attendanceAdepter = new AttendanceAdepter(this, data,tvpresent,tvabsert,count);
        redemo.setAdapter(attendanceAdepter);
    }
}
