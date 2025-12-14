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

        statusBarColor();
        initRecyclerview();
    }

    private void statusBarColor() {}

    private void initRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Maçãs","maca",15,4,12.00,""));
        items.add(new PopularDomain("Goiabas","goiaba",10,4.5,5.60,""));
        items.add(new PopularDomain("Batatas Doce","batatadoce",3,4.6,2.70,""));
        items.add(new PopularDomain("Mangas","manga",10,4.3,2.23,""));
        items.add(new PopularDomain("Melões","melao",5,2.1,2.30,""));
        items.add(new PopularDomain("Macaxeiras","macaxeira",20,4.7,4.69,""));
        items.add(new PopularDomain("Laranjas","laranja",15,4,2.49,""));
        items.add(new PopularDomain("Maracujas","maracuja",15,3.9,11.40,""));
        items.add(new PopularDomain("Limões","limao",4,4.7,2.34,""));
        items.add(new PopularDomain("Aboboras/Jerimuns","abobora",8,3.8,4.50,""));
        items.add(new PopularDomain("Cebola","cebola",1,5,3.49,""));
        items.add(new PopularDomain("Bananas","banana",34,4.6,2.79,""));
        items.add(new PopularDomain("Abacates","abacate",15,4,4.99,""));
        items.add(new PopularDomain("Brócolis","brocolis",2,5,5.99,""));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}
