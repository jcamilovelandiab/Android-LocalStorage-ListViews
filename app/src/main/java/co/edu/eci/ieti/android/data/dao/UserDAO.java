package co.edu.eci.ieti.android.data.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import co.edu.eci.ieti.android.data.entities.User;

@Dao
public interface UserDAO {

    //@Query("select * from user")
    LiveData<List<User>> getUsers();

    @Insert
    void insert(User user);

}
