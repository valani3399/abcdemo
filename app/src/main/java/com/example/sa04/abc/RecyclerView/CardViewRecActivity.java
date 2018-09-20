package com.example.sa04.abc.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sa04.abc.Adepter.carditemAdapter;
import com.example.sa04.abc.DbHelper;
import com.example.sa04.abc.Model.AppModel;
import com.example.sa04.abc.R;

import java.util.ArrayList;

public class CardViewRecActivity extends AppCompatActivity {
    private RecyclerView redemo;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_rec);
        redemo = (RecyclerView) findViewById(R.id.recyler);
        linearLayoutManager = new LinearLayoutManager(this);
        redemo.setLayoutManager(linearLayoutManager);

        String cov[] = {"pankaj", "raj", "rahul", "rakesh", "manan","sagar","karan","rakesh","manan"};
        int image[] = {R.drawable.a,R.drawable.download,
                       R.drawable.f,R.drawable.g,
                       R.drawable.ic_launcher_background,
                       R.drawable.baicical,R.drawable.banan,
                       R.drawable.birth,R.drawable.glass};

        ArrayList<AppModel> data = new ArrayList<>();

        for (int i = 0; i < cov.length; i++) {
            AppModel appModel = new AppModel();
            appModel.setTv(cov[i]);
            appModel.setImage(image[i]);
            data.add(appModel);
        }

        carditemAdapter itemAdapter = new carditemAdapter(this,data);
        redemo.setAdapter(itemAdapter);
    }
}
