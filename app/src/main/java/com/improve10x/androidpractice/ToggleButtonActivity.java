package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    private ToggleButton toggleButton1Btn;
    private ToggleButton toggleButton2Btn;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        setupViews();
        handleBtn();
    }

    private void handleBtn() {
        submitBtn.setOnClickListener(view -> {
            StringBuilder result = new StringBuilder();
            result.append("toggleButton1 : ").append(toggleButton1Btn.getText());
            result.append("toggleButton2 : ").append(toggleButton2Btn.getText());

            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
        });
    }

    private void setupViews() {

        toggleButton1Btn = findViewById(R.id.toggleButton1_btn);
        toggleButton2Btn = findViewById(R.id.toggleButton2_btn);
        submitBtn = findViewById(R.id.submit_btn);
    }
}