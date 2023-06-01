package com.example.quotesapplication;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.MyviewHolder> {

    Context quotesActivity;

    ArrayList<QuotesModelclass> thorts;
    public QuotesAdapter(quotesActivity quotesActivity, ArrayList<QuotesModelclass> thorts) {
        this.quotesActivity=quotesActivity;
        this.thorts=thorts;

    }

    @NonNull
    @Override
    public QuotesAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(quotesActivity).inflate(R.layout.quotes_array_list_item_file,parent,false);
        MyviewHolder v= new  MyviewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesAdapter.MyviewHolder holder, int position) {
        holder.txtquotes.setText(thorts.get(position).Quotes);

        holder.imagshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent p = new Intent(Intent.ACTION_SEND);
                p.setType("text/plain");
//
                String shyari_item = thorts.get( position ).Quotes;
                p.putExtra(Intent.EXTRA_TEXT, shyari_item);
                Intent chooser = Intent.createChooser(p, "Share");
                chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                quotesActivity.startActivity(chooser);


            }
        });

        holder.imagcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) quotesActivity.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple text",  holder.txtquotes.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(quotesActivity, "Copied", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return thorts.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView txtquotes;

        ImageView imagcopy,imagshare;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            txtquotes=itemView.findViewById(R.id.txtquotes);
            imagcopy=itemView.findViewById(R.id.imagcopy);
            imagshare=itemView.findViewById(R.id.imagshare);

        }
    }
}
