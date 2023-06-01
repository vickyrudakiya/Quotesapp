package com.example.quotesapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class OtpActivity extends AppCompatActivity {

    TextView texcoun;
    CardView cardregister;
    TextInputEditText edtusename, edtemail, edtpassword, edtconform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        initview();
    }

    private void initview() {

        cardregister = findViewById(R.id.cardregister);
        edtusename = findViewById(R.id.edtusename);
        edtemail = findViewById(R.id.edtemail);
        edtpassword = findViewById(R.id.edtpassword);
        edtconform = findViewById(R.id.edtconform);
        cardregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, e_mail, password, c_password;
                username = edtusename.getText().toString();
                e_mail = edtemail.getText().toString();
                password = edtpassword.getText().toString();
                c_password = edtconform.getText().toString();

                if(username.isEmpty())
                {
                    Toast.makeText(OtpActivity.this, "Please enter your username", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (e_mail.isEmpty())
                    {
                        Toast.makeText(OtpActivity.this, "Please enter your E-mail", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        if (password.isEmpty())
                        {
                            Toast.makeText(OtpActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            if (c_password.isEmpty())
                            {
                                Toast.makeText(OtpActivity.this, "Please enter your conform password", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Intent i=new Intent(OtpActivity.this,HomeActivity.class);
                                startActivity(i);
                            }
                        }
                    }
                }
            }
        });


    }
}