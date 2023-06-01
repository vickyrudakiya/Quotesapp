package com.example.quotesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginScreenActivity extends AppCompatActivity {

    TextView edtcontinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        initview();
    }

    private void initview() {
        edtcontinue=findViewById(R.id.edtcontinue);


        edtcontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(LoginScreenActivity.this,OtpActivity.class);
                startActivity(i);
            }
        });



    }
}