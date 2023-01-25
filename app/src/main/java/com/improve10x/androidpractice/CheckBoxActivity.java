package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox pizzaCheckBox;
    private CheckBox coffeeCheckBox;
    private CheckBox burgerCheckBox;
    private Button orderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        getSupportActionBar().setTitle("Check Box");

        setupViews();
    }

    private void setupViews() {

    }
}