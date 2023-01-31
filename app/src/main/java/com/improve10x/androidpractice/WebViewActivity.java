package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getSupportActionBar().setTitle("Web View");
        WebView myWebView = findViewById(R.id.web_view);

        myWebView.loadUrl("https://www.youtube.com/watch?v=Ccc-Sk8qMAQ");
    }
}