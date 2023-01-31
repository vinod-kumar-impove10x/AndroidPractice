package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityAlertDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    ActivityAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);
        getSupportActionBar().setTitle("Progress Dialog");
    }
}