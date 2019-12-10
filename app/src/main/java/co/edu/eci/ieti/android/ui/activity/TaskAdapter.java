package co.edu.eci.ieti.android.ui.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.edu.eci.ieti.R;
import co.edu.eci.ieti.android.data.entities.Task;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {


    private final List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Task task = taskList.get(position);
        holder.title.setText(task.getTitle());
        holder.description.setText(task.getDescription());
        holder.title.setText(task.getDueDate());

    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        TextView dueDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            //description = itemView.findViewById(R.id.description);
            //dueDate = itemView.findViewById(R.id.dueDate);
        }
    }
}

