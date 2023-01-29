package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private TextView  currentTimeTxt;
    private Button changeTimeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        getSupportActionBar().setTitle("Time Picker");

        setupViews();
        handleBtn();
    }

    private void handleBtn() {
        changeTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTimeTxt.setText("current time :" + getCurrentTime());
                currentTimeTxt.setText("current time :" + getCurrentTime());
            }

            private String getCurrentTime() {
                StringBuilder builder = new StringBuilder();
                String currentTime="Current Time: "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                return currentTime;
            }
        });
    }

    private void setupViews() {

        timePicker = findViewById(R.id.time_picker);
        currentTimeTxt = findViewById(R.id.current_time_txt);
        changeTimeBtn = findViewById(R.id.change_time_btn);
    }
}