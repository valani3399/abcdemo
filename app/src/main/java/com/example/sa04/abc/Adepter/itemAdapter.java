package com.example.sa04.abc.Adepter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sa04.abc.Model.AppModel;
import com.example.sa04.abc.DbHelper;
import com.example.sa04.abc.R;

import java.util.ArrayList;

/**
 * Created by Softices on 5/23/2018.
 */
public class itemAdapter extends RecyclerView.Adapter<itemAdapter.MyViewHolder> {

    ArrayList<AppModel> arrayList;
    static Context context;
    private DbHelper dbHelper;

    public itemAdapter(Context context, DbHelper dbHelper, ArrayList<AppModel> data) {
        arrayList = data;
        this.dbHelper = dbHelper;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.line_by_line, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
       final AppModel appModel= arrayList.get(position);
        holder.tvroll.setText(appModel.getRollNo());
        holder.tvName.setText(appModel.getName());
        holder.tvblod.setText(appModel.getBloodGroup());
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvroll,tvblod;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.tv_name);
            this.tvroll = (TextView) itemView.findViewById(R.id.tv_rollno);
            this.tvblod = (TextView) itemView.findViewById(R.id.tv_blood);


        }
    }
}