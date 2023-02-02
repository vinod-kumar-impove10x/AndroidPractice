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

        Button radioBtn = findViewById(R.id.radio_btn);
        radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });

        Button ratingBarBtn = findViewById(R.id.ratingbar_btn);
        ratingBarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });

        Button seekBarBtn = findViewById(R.id.seek_bar_btn);
        seekBarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });

        Button datePickerBtn = findViewById(R.id.datepicker_btn);
        datePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });

        Button timePickerBtn = findViewById(R.id.time_picker_btn);
        timePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });

        Button progressBarBtn = findViewById(R.id.progress_bar_btn);
        progressBarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProgressBarActivity.class);
            startActivity(intent);
        });

        Button verticalScrollViewBtn = findViewById(R.id.vertical_scroll_view_btn);
        verticalScrollViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,VerticalScrollViewActivity.class);
            startActivity(intent);
        });

        Button horizontalScrollViewBtn = findViewById(R.id.horizontal_scroll_view_btn);
        horizontalScrollViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,HorizontalScrollViewActivity.class);
            startActivity(intent);
        });

        Button listViewBtn = findViewById(R.id.list_view_btn);
        listViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,ListViewActivity.class);
            startActivity(intent);
        });

        Button alertDialogBtn = findViewById(R.id.alert_dialog_btn);
        alertDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AlertDialogActivity.class);
            startActivity(intent);
        });

        Button progressDialogBtn = findViewById(R.id.progress_dialog_btn);
        progressDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,ProgressDialogActivity.class);
            startActivity(intent);
        });

        Button webViewBtn = findViewById(R.id.web_view_btn);
        webViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,WebViewActivity.class);
            startActivity(intent);
        });

        Button spinnerBtn = findViewById(R.id.spinner_btn);
        spinnerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });

        Button customAlertDialogBtn = findViewById(R.id.custom_alert_dialog_btn);
        customAlertDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CustomAlertDialogActivity.class);
            startActivity(intent);
        });
    }
}