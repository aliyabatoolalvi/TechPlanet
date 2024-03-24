package com.aliya.techplanet;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;
@Database(entities = {Tech.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
        public abstract TechDao techDao();
        private static volatile AppDatabase INSTANCE;

        public static AppDatabase getDatabase(final Context context){
            if (INSTANCE == null) {
                synchronized (AppDatabase.class) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context,
                                        AppDatabase.class, "database_10")
                                .fallbackToDestructiveMigration()
                                .fallbackToDestructiveMigrationOnDowngrade()
                                .allowMainThreadQueries()
                                .build();
                    }
                }
            }
            return INSTANCE;
        }

}
