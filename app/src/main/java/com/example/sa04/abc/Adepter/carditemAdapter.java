package com.example.sa04.abc.Adepter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sa04.abc.DbHelper;
import com.example.sa04.abc.Model.AppModel;
import com.example.sa04.abc.R;

import java.util.ArrayList;

/**
 * Created by Softices on 5/23/2018.
 */
public class carditemAdapter extends RecyclerView.Adapter<carditemAdapter.MyViewHolder> {

    ArrayList<AppModel> arrayList;
    static Context context;

    public carditemAdapter(Context context, ArrayList<AppModel> data) {
        arrayList = data;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_line, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
       final AppModel appModel= arrayList.get(position);
       holder.tv.setText(appModel.getTv());
       holder.imageView.setImageResource(appModel.getImage());


    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.image);
            this.tv = (TextView) itemView.findViewById(R.id.tv_name2);






        }
    }
}