package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private ArrayList<String> titles;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("List View");

        setData();
        handleListView();
    }

    private void handleListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,titles);
        binding.titleLv.setAdapter(arrayAdapter);
        binding.titleLv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, String.valueOf(titles.get(position)), Toast.LENGTH_SHORT).show();
        });
    }

    private void setData() {
        titles = new ArrayList<>();
        titles.add("Android");
        titles.add("Java");
        titles.add("Php");
        titles.add("Hadoop");
        titles.add("Sap");
        titles.add("Python");
        titles.add("Ajax");
        titles.add("C++");
        titles.add("Ruby");
        titles.add("Rails");
    }
}