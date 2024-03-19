package com.aliya.techplanet;

import android.os.Bundle;
import android.view.MenuItem;

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
        // setting binding as contentView .. getRoot() = it will take top level layout of that given activity_add_edit_tech.xml
        binding = ActivityTechDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // enabling back button
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // put tech object from "data" intent and display
        tech=new Gson().fromJson(getIntent().getStringExtra("data"),Tech.class);

        binding.name.setText(tech.getName());
        binding.type.setText(tech.getType());
        binding.specs.setText(tech.getSpecs());
        binding.price.setText(String.valueOf(tech.getPrice()));

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Handle the Up button click here (e.g., navigate back or perform some action)
                finish(); // Close the current activity
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}