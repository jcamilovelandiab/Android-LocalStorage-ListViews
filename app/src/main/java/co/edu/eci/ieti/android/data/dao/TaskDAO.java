package co.edu.eci.ieti.android.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import co.edu.eci.ieti.android.data.entities.Task;

@Dao
public interface TaskDAO {

    //@Query("select * from task")
    //LiveData<List<Task>> getTasks();

    @Insert
    void insert(Task task);

}
