package com.example.limy.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.limy.Adapter.PopularAdapter;
import com.example.limy.databinding.ActivityMainBinding;
import com.example.limy.domain.PopularDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusBarColor()
        initRecyclerview();
    }

    private void statusBarColor() {}

    private void initRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Tomates","item_1",15,4,500,"test"));
        items.add(new PopularDomain("Leite","item_2",10,4.5,450,"test"));
        items.add(new PopularDomain("Batatas","item_3",3,4.9,800,"test"));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}
