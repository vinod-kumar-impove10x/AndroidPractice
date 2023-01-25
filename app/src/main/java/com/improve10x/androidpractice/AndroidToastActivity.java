package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class AndroidToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andorid_toast);
        getSupportActionBar().setTitle("Android Toast");


        //Displaying Toast with Hello Java T point message
        Toast.makeText(getApplicationContext(),"Hello Java T point",Toast.LENGTH_SHORT).show();
    }
}