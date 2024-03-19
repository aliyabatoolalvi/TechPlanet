package com.aliya.techplanet;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;


public class TechViewHolder extends RecyclerView.ViewHolder {
    ImageView icon;
    TextView name,sid,status;

    CardView item;

    public TechViewHolder(@NonNull View techView){
        super(techView);
        icon= techView.findViewById(R.id.icon);
        name= techView.findViewById(R.id.name);
        sid= techView.findViewById(R.id.sid);
        status= techView.findViewById(R.id.status);
        item= techView.findViewById(R.id.item);
    }
}
