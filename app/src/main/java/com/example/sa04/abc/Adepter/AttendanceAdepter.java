package com.example.sa04.abc.Adepter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sa04.abc.Model.AppModel;
import com.example.sa04.abc.R;

import java.util.ArrayList;

public class AttendanceAdepter extends RecyclerView.Adapter<AttendanceAdepter.MyViewHolder> {
    ArrayList<AppModel> arrayList;
    Context context;
    TextView tvabsert,tvpresent;
    int num=0;


    public AttendanceAdepter(Context context,ArrayList<AppModel> data,TextView tvabsert,TextView tvpresent,int num) {
        arrayList = data;
        this.context = context;
        this.tvabsert=tvabsert;
        this.tvpresent=tvpresent;
        this.num=num;

    }

    @NonNull
    @Override
    public AttendanceAdepter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attendance_line, parent, false);
        AttendanceAdepter.MyViewHolder myViewHolder = new AttendanceAdepter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final AttendanceAdepter.MyViewHolder holder, int position) {
        final AppModel appModel= arrayList.get(position);
        holder.button.setText("" + appModel.getNumber());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.color){
                    num++;
                    tvpresent.setText("" + num);
                    holder.button.setBackgroundColor(Color.BLUE);
                    holder.color=false;

                }else {
                    num--;
                    tvpresent.setText("" + num);
                    holder.button.setBackgroundColor(Color.WHITE);
                    holder.color=true;
                }
                String p=tvpresent.getText().toString();
                int pre=Integer.valueOf(p);
                int arr=arrayList.size();
                int q=arr-pre;
                tvabsert.setText("" + q);
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        Button button;
        Boolean color=true;

        int p;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.button = (Button) itemView.findViewById(R.id.btn_attendance);
        }
    }
}
