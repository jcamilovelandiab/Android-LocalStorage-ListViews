package co.edu.eci.ieti.android.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import co.edu.eci.ieti.android.data.entities.Task;


@Database(entities={Task.class}, version=1)
public abstract class AppRoomDatabase extends RoomDatabase {

}
