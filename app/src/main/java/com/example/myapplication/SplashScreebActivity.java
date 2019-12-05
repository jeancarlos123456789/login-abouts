package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent o =new Intent( this,RegistrarseActivity.class);
        startActivity(o);
        finish();

        setContentView(R.layout.activity_splash_screeb);
    }
}
