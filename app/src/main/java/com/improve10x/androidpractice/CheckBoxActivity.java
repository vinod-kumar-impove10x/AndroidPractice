package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox pizzaCheckBox;
    private CheckBox coffeeCheckBox;
    private CheckBox burgerCheckBox;
    private Button orderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        getSupportActionBar().setTitle("Check Box");

        setupViews();
        HandleBtn();
    }

    private void HandleBtn() {
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Select Item : ");
                if (pizzaCheckBox.isChecked()) {
                    result.append(("\t Pizza 100Rs "));
                    totalAmount+= 100;
                }  if(coffeeCheckBox.isChecked()){
                    result.append("\t Coffee 50Rs");
                    totalAmount+= 50;
                }if(burgerCheckBox.isChecked()){
                    result.append("\t Burger 120Rs");
                    totalAmount+= 120;
                }
                result.append("\t Total: "+totalAmount+"Rs");
                Toast.makeText(CheckBoxActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupViews() {
        pizzaCheckBox = findViewById(R.id.pizza_check_box);
        coffeeCheckBox = findViewById(R.id.cofee_check_box);
        burgerCheckBox = findViewById(R.id.pizza_check_box);
        orderBtn = findViewById(R.id.order_btn);
    }
}