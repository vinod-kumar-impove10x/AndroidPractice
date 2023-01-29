package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarActivity extends AppCompatActivity {

    private RatingBar ratingBarBtn;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        getSupportActionBar().setTitle("Rating Bar");

        setupViews();
        handleBtn();
    }

    private void handleBtn() {
        submitBtn.setOnClickListener(view -> {
            String rating = String.valueOf(ratingBarBtn.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_SHORT).show();
        });
    }

    private void setupViews() {
        ratingBarBtn = findViewById(R.id.ratingbar_btn);
        submitBtn = findViewById(R.id.submit_btn);
    }
}