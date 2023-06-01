package com.example.quotesapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HappyAdapter extends RecyclerView.Adapter<HappyAdapter.MyviewHolder> {

    Context happyquotesActivity;

    ArrayList<HappyModelclass> thorts;
    public HappyAdapter(HappyquotesActivity happyquotesActivity, ArrayList<HappyModelclass> thorts) {
        this.happyquotesActivity=happyquotesActivity;
        this.thorts=thorts;
    }

    @NonNull
    @Override
    public HappyAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(happyquotesActivity).inflate(R.layout.happy_quotes_array_list_item_file,parent,false);
        MyviewHolder h=new MyviewHolder(view);
        return h;
    }

    @Override
    public void onBindViewHolder(@NonNull HappyAdapter.MyviewHolder holder, int position) {
        holder.txthappy.setText(thorts.get(position).happy);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView txthappy;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            txthappy=itemView.findViewById(R.id.txthappy);
        }
    }
}
