package com.example.sa04.abc.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sa04.abc.Adepter.itemAdapter;
import com.example.sa04.abc.DbHelper;
import com.example.sa04.abc.Model.AppModel;
import com.example.sa04.abc.R;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView redemo;
    private LinearLayoutManager linearLayoutManager;
//    private ArrayList<String> data;
    private DbHelper dbHelper;
    public static final String MyPREFERENCES = "MyPrefs";
    public Cursor cursor;
    private String strName, strBloodgroup,strRollno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        redemo = (RecyclerView) findViewById(R.id.recyler_view);
        dbHelper = new DbHelper(getApplicationContext());
        linearLayoutManager = new LinearLayoutManager(this);
        redemo.setLayoutManager(linearLayoutManager);


        ArrayList<AppModel> is = new ArrayList<>();


        cursor = dbHelper.getUsersList();
        if (cursor.moveToFirst())

        {
            do {
                AppModel appModel = new AppModel();
                strRollno = cursor.getString(cursor.getColumnIndex(DbHelper.ROOLNO));
                strName = cursor.getString(cursor.getColumnIndex(DbHelper.NAME));
                strBloodgroup = cursor.getString(cursor.getColumnIndex(DbHelper.BLOODGROUP));
                appModel.setName(strName);
                appModel.setBloodGroup(strBloodgroup);
                appModel.setRollNo(strRollno );
                is.add((appModel));
            } while (cursor.moveToNext());
        }
        cursor.close();
        itemAdapter itemAdapter = new itemAdapter(this, dbHelper, is);
        redemo.setAdapter(itemAdapter);
    }
}