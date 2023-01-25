package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {

    private EditText sum1, sum2;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        getSupportActionBar().setTitle("Sum of two Numbers");

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        sum1 = (EditText) findViewById(R.id.sum1_txt);
        sum2 = (EditText) findViewById(R.id.sum2_txt);
        addBtn = (Button) findViewById(R.id.add_btn);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=sum1.getText().toString();
                String value2=sum2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum = a+b;

                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}