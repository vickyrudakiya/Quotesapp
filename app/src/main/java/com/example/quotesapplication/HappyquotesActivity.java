package com.example.quotesapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HappyquotesActivity extends AppCompatActivity {

    RecyclerView rcvhappy;

    ArrayList<HappyModelclass> thorts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happyquotes);
        initview();

    }

    private void initview() {
        rcvhappy=findViewById(R.id.rcvhappy);

        HappyModelclass h1=new HappyModelclass();
        h1.setHappy("happy");
        thorts.add(h1);

        HappyAdapter obj = new HappyAdapter(HappyquotesActivity.this,thorts);
        rcvhappy.setAdapter(obj);
    }
}