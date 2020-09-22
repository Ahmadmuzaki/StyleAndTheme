package com.ahmadmuzaki.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Digunakan untuk mengganti Judul
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Google Pixel");
        }
    }
}