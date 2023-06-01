package com.example.quotesapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rcv1;
    ArrayList<homearrayModelclass> Categary = new ArrayList<>();
    ArrayList<homearrayModelclass> Picture = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initview();
    }

    private void initview() {
        rcv1=findViewById(R.id.rcv1);

        homearrayModelclass m1=new homearrayModelclass();
        m1.setName("Happy");
        m1.setPhoto(R.drawable.happy);
        Categary.add(m1);

        homearrayModelclass m2=new homearrayModelclass();
        m2.setName("Sad");
        m2.setPhoto(R.drawable.sad);
        Categary.add(m2);

        homearrayModelclass m3=new homearrayModelclass();
        m3.setName("Health");
        m3.setPhoto(R.drawable.health);
        Categary.add(m3);

        homearrayModelclass m4=new homearrayModelclass();
        m4.setName("Funny");
        m4.setPhoto(R.drawable.funny);
        Categary.add(m4);

        homearrayModelclass m5=new homearrayModelclass();
        m5.setName("Birthday");
        m5.setPhoto(R.drawable.bday);
        Categary.add(m5);

        homearrayModelclass m6=new homearrayModelclass();
        m6.setName("purpose");
        m6.setPhoto(R.drawable.purpose);
        Categary.add(m6);

        homearrayModelclass m7=new homearrayModelclass();
        m7.setName("Love");
        m7.setPhoto(R.drawable.love);
        Categary.add(m7);

        homearrayModelclass m8=new homearrayModelclass();
        m8.setName("Motivational");
        m8.setPhoto(R.drawable.motivational);
        Categary.add(m8);

        homearrayModelclass m9=new homearrayModelclass();
        m9.setName("Attitude");
        m9.setPhoto(R.drawable.attitude);
        Categary.add(m9);

        homearrayModelclass m10=new homearrayModelclass();
        m10.setName("Good Morning");
        m10.setPhoto(R.drawable.goodmorning);
        Categary.add(m10);

        homearrayModelclass m11=new homearrayModelclass();
        m11.setName("Brother");
        m11.setPhoto(R.drawable.brothers);
        Categary.add(m11);

        homearrayModelclass m12=new homearrayModelclass();
        m12.setName("Bike");
        m12.setPhoto(R.drawable.bike);
        Categary.add(m12);

        homearrayModelclass m13=new homearrayModelclass();
        m13.setName("Break-Up");
        m13.setPhoto(R.drawable.brokup);
        Categary.add(m13);




        homeInterface homeinterface = new homeInterface() {
            @Override
            public void select(String name) {

                Intent i=new Intent(HomeActivity.this,quotesActivity.class);
                i.putExtra("Categari",name);
                startActivity(i);
            }
        };

        homeadapter adapter = new homeadapter(HomeActivity.this,Categary,homeinterface);
        GridLayoutManager manager = new GridLayoutManager(HomeActivity.this,2);
        rcv1.setAdapter(adapter);
        rcv1.setLayoutManager(manager);

    }
}