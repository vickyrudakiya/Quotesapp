package com.example.quotesapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class homeadapter extends RecyclerView.Adapter<homeadapter.MyviewHolder> {

    Context homeActivity;

    ArrayList<homearrayModelclass> categary;

    homeInterface homeinterface;
    public homeadapter(HomeActivity homeActivity, ArrayList<homearrayModelclass> categary, homeInterface homeinterface) {
        this.homeActivity=homeActivity;
        this.categary=categary;
        this.homeinterface=homeinterface;

    }

    @NonNull
    @Override
    public homeadapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(homeActivity).inflate(R.layout.home_array_list_item_file,parent,false);
        MyviewHolder v=new MyviewHolder(view);

        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull homeadapter.MyviewHolder holder, int position) {
        int p=position;
        holder.txtRcv.setText(categary.get(position).name);
        holder.imagepic.setImageResource(categary.get(position).Photo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                homeinterface.select(categary.get(p).name);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categary.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView txtRcv;

        ImageView imagepic;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            txtRcv=itemView.findViewById(R.id.txtRcv);
            imagepic=itemView.findViewById(R.id.imagepic);
        }
    }
}
