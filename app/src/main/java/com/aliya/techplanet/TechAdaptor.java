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
        holder.sid.setText(blog.getId());
        holder.name.setText(blog.getName());
        holder.icon.setImageResource(blog.getImg());
        holder.item.setOnClickListener(v -> {
            Intent intent=new Intent(context,TechDetailsActivity.class);
            intent.putExtra("data",new Gson().toJson(techList));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
       return techList.size();
    }
}
