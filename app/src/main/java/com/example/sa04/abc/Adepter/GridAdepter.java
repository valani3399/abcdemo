package com.example.sa04.abc.Adepter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.sa04.abc.R;
import com.example.sa04.abc.R;


public class GridAdepter extends BaseAdapter {
    public Context context;
    public Integer[] a = {R.drawable.a,R.drawable.p,R.drawable.download,R.drawable.f,R.drawable.g};


    public GridAdepter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return a.length;
    }

    @Override
    public Object getItem(int position) {
        return a[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ImageView imageView = new ImageView(context);
        imageView.setImageResource(a[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        return imageView;
    }
}
