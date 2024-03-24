package com.aliya.techplanet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class NewTechItemReceiver extends BroadcastReceiver {
    Context context;
    List<Tech> techList = new ArrayList<>();
    TechAdaptor adapter = new TechAdaptor(context, techList);
    @Override
    public void onReceive(Context context, Intent intent) {

        techList.clear();
        techList.addAll(AppDatabase.getDatabase(context).techDao().getAll());
        adapter.notifyDataSetChanged();

    }
}

