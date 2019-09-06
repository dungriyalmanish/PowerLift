package android.data.app.powerlift.model.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

@Dao
public interface ExerciseDao {

    @Query("select * from exercise where date LIKE:date")
    Exercise getExerciseData(String date);

    @Insert
    void insertExerciseData(Exercise exercise);


}
