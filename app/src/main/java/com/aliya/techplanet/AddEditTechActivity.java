package com.aliya.techplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.aliya.techplanet.databinding.ActivityAddEditTechBinding;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class AddEditTechActivity extends AppCompatActivity {

    ActivityAddEditTechBinding binding;
    Tech tech = new Tech();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddEditTechBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

//
//        if (getIntent().hasExtra("data")) {
//            tech = new Gson().fromJson(getIntent().getStringExtra("data"), Tech.class);
//            binding.price.setText(tech.getPrice());
//            binding.specs.setText(tech.getSpecs());
//            binding.typeradio.setText(tech.getType());
//
//        }



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.savemenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.save) {
            //save note to database
            if (binding.name.getText().toString().isEmpty() && binding.specs.getText().toString().isEmpty() && binding.specs.getText().toString().isEmpty()) {
                Toast.makeText(this, "Name, Specs or price could not be empty", Toast.LENGTH_SHORT).show();
                return true;
            }
            tech.setName(binding.name.getText().toString());
            tech.setSpecs(binding.specs.getText().toString());
            tech.setPrice(Integer.parseInt(binding.price.getText().toString()));

            if(binding.laptop.isChecked()){
                tech.setType("Laptop");
            } else if (binding.tablet.isChecked()) {
                tech.setType("Tablet");
            } else if (binding.mobile.isChecked()) {
                tech.setType("Mobile");
            }


            //save
            AppDatabase.getDatabase(this).techDao().insertOrReplace(tech);
            Toast.makeText(this, "Tech saved", Toast.LENGTH_SHORT).show();
            // Broadcast intent indicating that a new tech item has been added
            Intent intent = new Intent("com.aliya.techplanet.NEW_TECH_ITEM_ADDED");
            sendBroadcast(intent);
            finish();
            return true;
        }
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}