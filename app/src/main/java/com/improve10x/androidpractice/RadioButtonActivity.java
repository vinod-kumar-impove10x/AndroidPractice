package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
    private RadioButton radioBtnMale;
    private RadioButton radioBtnFemale;
    private Button showBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        getSupportActionBar().setTitle("Radio Button");

        setupViews();
        handleBtn();

    }

    private void handleBtn() {
        showBtn.setOnClickListener(view -> {
            if(radioBtnMale.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            }

            if (radioBtnFemale.isChecked()) {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupViews() {
       radioBtnMale = findViewById(R.id.radio_male_btn);
       radioBtnFemale = findViewById(R.id.radio_female_btn);
       showBtn = findViewById(R.id.show_selected_btn);
    }
}