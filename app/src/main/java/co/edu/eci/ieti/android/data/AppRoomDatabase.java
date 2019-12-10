package co.edu.eci.ieti.android.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import co.edu.eci.ieti.android.data.entities.Task;
import co.edu.eci.ieti.android.data.entities.User;


@Database(entities={Task.class, User.class}, version=1, exportSchema = false)
public abstract class AppRoomDatabase extends RoomDatabase {

    public abstract TaskDAO getTaskDAO();
    public abstract UserDAO getUserDAO();

    private static volatile AppRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static AppRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppRoomDatabase.class, "app_database").build();
                }
            }
        }
        return INSTANCE;
    }

}
