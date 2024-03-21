package com.aliya.techplanet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TechAdaptor adapter;
    RecyclerView recyclerView;

    List<Tech> techList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//            techList = new ArrayList<>();
//          techList=gettechList();
            recyclerView = findViewById(R.id.recyclerView);
            adapter=new TechAdaptor(this,techList);
            recyclerView=findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);

//            techList.clear();
//            techList.addAll(AppDatabase.getDatabase(this).techDao().getAll());
//            adapter.notifyDataSetChanged();

        findViewById(R.id.add).setOnClickListener(v->{
            startActivity(new Intent(this,AddEditTechActivity.class));
        });



    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onResume() {
        techList = new ArrayList<>();

        super.onResume();
        techList.clear();
        techList.addAll(AppDatabase.getDatabase(this).techDao().getAll());
        adapter.notifyDataSetChanged();
    }


//    private List<Tech> gettechList(){
//        List<Tech> techs= new ArrayList<Tech>();
//        Tech t1=new Tech(
//                1,R.drawable.baseline_laptop_24,"Laptop","Lenovo y33","64GB RAM, Quad Core, intel i9",349999
//        );
//        techs.add(t1);
//
//        t1=new Tech(
//                2,R.drawable.baseline_laptop_24,"Laptop","Lenovo y23","32GB RAM, Quad Core, intel i7",249999
//        );
//        techs.add(t1);
//        t1=new Tech(
//                3,R.drawable.baseline_tablet_android_24,"Tablet","Samsung z11","12GB RAM, Quad Core, Touch pen",24999
//        );
//        techs.add(t1);
//
//        return techs;
//    }

}