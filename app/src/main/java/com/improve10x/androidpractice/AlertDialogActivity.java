package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityAlertDialogBinding;
import com.improve10x.androidpractice.databinding.ActivityListViewBinding;

public class AlertDialogActivity extends AppCompatActivity {

    private ActivityAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Alert Dialog");
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Android Studio");
        alert.setMessage("Do you Love Android ?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "Good Job", Toast.LENGTH_SHORT).show();
            }
        });
        alert.setNegativeButton(" No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "To bad , cuz it's awesome", Toast.LENGTH_SHORT).show();
            }
        });

        alert.create().show();

    }
}