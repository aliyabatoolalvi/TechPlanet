package com.aliya.techplanet;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.aliya.techplanet.databinding.ActivityAddEditTechBinding;
import com.google.gson.Gson;

import java.util.Objects;


public class AddEditTechActivity extends AppCompatActivity {


    Tech tech = new Tech();


    EditText name, specs;
    Number price;
    TextView type;

    boolean edit= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityAddEditTechBinding binding = ActivityAddEditTechBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
//
//        setContentView(R.layout.activity_add_edit_tech);
//
//        if (getIntent().hasExtra("data")) {
//            tech = new Gson().fromJson(getIntent().getStringExtra("data"), Tech.class);
//            binding.price.setText(tech.getPrice());
//            binding.specs.setText(tech.getSpecs());
//            binding.typeradio.setText(tech.getType());
//
//        }



    }
}