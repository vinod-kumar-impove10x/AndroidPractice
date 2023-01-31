package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;

import com.improve10x.androidpractice.databinding.ActivityAlertDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);
        getSupportActionBar().setTitle("Progress Dialog");

        showProgressDialog();
    }

    private void showProgressDialog() {

        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(view -> {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("This is Title");
            progressDialog.setTitle("This is Message");
            progressDialog.show();
        });
    }
}