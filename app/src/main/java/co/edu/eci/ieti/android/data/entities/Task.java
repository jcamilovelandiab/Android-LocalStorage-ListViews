package co.edu.eci.ieti.android.data.entities;


public class Task {

    String _id;
    String title;
    String status;
    String dueDate;
    String description;
    User responsible;

    public Task() {
    }

    public Task(String _id, String title, String status, String dueDate, String description, User responsible) {
        this._id = _id;
        this.title = title;
        this.status = status;
        this.dueDate = dueDate;
        this.description = description;
        this.responsible = responsible;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "Task{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", description='" + description + '\'' +
                ", responsible=" + responsible +
                '}';
    }
}
