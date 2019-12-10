package co.edu.eci.ieti.android.network.service;


import java.util.List;

import co.edu.eci.ieti.android.data.entities.Task;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Camilo Velandia
 */
public interface TaskService {

    @GET("/api/tasks")
    Call<List<Task>> getTasks();
}
