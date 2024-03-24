package com.aliya.techplanet;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;



@Dao
public interface TechDao {
    @Query("SELECT * FROM Tech order by id desc limit 500")
    List<Tech> getAll();

    @Query("SELECT * FROM Tech limit 500")
    LiveData<List<Tech>> liveGetAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertOrReplace(Tech tech);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertOrReplaceAll(List<Tech> techs);

    @Delete
    void delete(Tech tech);

    @Update
    void update(Tech tech);

    @Query("DELETE FROM Tech")
    void deleteAll();

}
