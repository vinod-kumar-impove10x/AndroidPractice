package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sumButton = findViewById(R.id.sum_btn);
        sumButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, SumActivity.class);
            startActivity(intent);
        });

        Button androidToastBtn = findViewById(R.id.android_toast_btn);
        androidToastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AndroidToastActivity.class);
            startActivity(intent);
        });

        Button customToastBtn = findViewById(R.id.custom_toast_btn);
        customToastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });

        Button toggleButtonBtn = findViewById(R.id.toggle_btn);
        toggleButtonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });

        Button checkBoxBtn = findViewById(R.id.check_box_btn);
        checkBoxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }
}