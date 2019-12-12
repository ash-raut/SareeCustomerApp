package com.example.sareecustomerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerLoginActivity extends AppCompatActivity {
    Button button,buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);
        button=findViewById(R.id.btnLoginRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CustomerLoginActivity.this,CustomerSignupActivity.class);
                startActivity(intent);
            }
        });
        buttonlogin=findViewById(R.id.btnLogin);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CustomerLoginActivity.this,CustomerDrawerActivity.class);
                startActivity(intent);
            }
        });
    }
}
