package co.edu.eci.ieti.android.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import co.edu.eci.ieti.android.data.dao.TaskDAO;
import co.edu.eci.ieti.android.data.entities.Task;

public class TaskRepository {

    public TaskDAO taskDAO;
    private LiveData<List<Task>> listTask;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    TaskRepository(Application application) {
        AppRoomDatabase database = AppRoomDataBase.getDatabase(application);
        taskDAO = database.getTaskDAO();
        listTask = taskDAO.getTasks();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Task>> getAllTasks() {
        return listTask;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Task task) {
        AppRoomDatabase.databaseWriteExecutor.execute(() -> {
            taskDAO.insert(task);
        });
    }
}
