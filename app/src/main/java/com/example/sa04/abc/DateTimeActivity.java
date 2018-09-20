package com.example.sa04.abc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeActivity extends AppCompatActivity {
    TextView tvdate,tvyear,tvday,tvweek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        tvdate=(TextView)findViewById(R.id.tv_date);
        tvyear=(TextView)findViewById(R.id.currnt_year);
        tvday=(TextView)findViewById(R.id.currnt_year_day);
        tvweek=(TextView)findViewById(R.id.currnt_week);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat d = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        String s = d.format(c.getTime());

        int dayofyear = c.get(Calendar.DAY_OF_YEAR);
        int year = c.get(Calendar.YEAR);
        int dayofweek = c.get(Calendar.DAY_OF_WEEK);

        tvdate.setText(s +"");
        tvweek.setText(dayofweek +"");
        tvday.setText(dayofyear +"");
        tvyear.setText(year +"");

    }
}
