package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    private Button customToastBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        getSupportActionBar().setTitle("Custom Toast");
        setUpViews();
        handleBtn();
    }

    private void handleBtn() {
        customToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showToast();
            }

            private void showToast() {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_item, (ViewGroup)findViewById(R.id.toast_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);

                toast.show();
            }
        });
    }

    private void setUpViews() {
        customToastBtn = findViewById(R.id.custom_toast_btn);
    }
}