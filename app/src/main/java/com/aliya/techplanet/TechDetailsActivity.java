package com.aliya.techplanet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.aliya.techplanet.databinding.ActivityTechDetailsBinding;

import com.google.gson.Gson;

import java.util.Objects;

public class TechDetailsActivity extends AppCompatActivity {
    Tech tech;
    ActivityTechDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityTechDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding = ActivityTechDetailsBinding.inflate(getLayoutInflater());
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        tech=new Gson().fromJson(getIntent().getStringExtra("data"),Tech.class);

        binding.name.setText(tech.getName());
        binding.type.setText(tech.getType());
        binding.specs.setText(tech.getSpecs());
        binding.price.setText(String.valueOf(tech.getPrice()));

    }
}