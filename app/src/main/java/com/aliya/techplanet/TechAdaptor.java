package com.aliya.techplanet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;

import java.util.List;
import java.util.Objects;

public class TechAdaptor extends RecyclerView.Adapter<TechViewHolder> {
    Context context;
    List<Tech> techList;

    public TechAdaptor(Context context, List<Tech> techList) {
        this.context = context;
        this.techList = techList;
    }

    @NonNull
    @Override
    public TechViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.tech_card,parent,false);
        return new TechViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TechViewHolder holder, int position) {
        Tech blog=techList.get(position);
        holder.sid.setText(String.valueOf(blog.getId()));
        holder.name.setText(blog.getName());
//        holder.icon.setImageResource(blog.getImg());
        holder.status.setText(blog.getStatus());

        if(Objects.equals(blog.type, "Laptop")) {

            holder.icon.setImageResource(R.drawable.baseline_laptop_24);
        } else if(Objects.equals(blog.type, "Tablet")) {
            holder.icon.setImageResource(R.drawable.baseline_tablet_android_24);
        }
        else if(Objects.equals(blog.type, "Mobile")) {

            holder.icon.setImageResource(R.drawable.baseline_phone_android_24);
        }
        else {
            holder.icon.setImageResource(R.drawable.bg);
        }
        holder.item.setOnClickListener(v -> {
            Intent intent=new Intent(context,TechDetailsActivity.class);
            intent.putExtra("data",new Gson().toJson(blog));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return techList != null ? techList.size() : 0;

    }
}
