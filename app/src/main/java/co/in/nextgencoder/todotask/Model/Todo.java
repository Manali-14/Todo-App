package co.in.nextgencoder.todotask.Model;

public class Todo {
    private String id;
    private String todoTask;
    private boolean status;

    public Todo() {
    }

    public Todo(String id, String todoTask, boolean status) {
        this.id = id;
        this.todoTask = todoTask;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(String todoTask) {
        this.todoTask = todoTask;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
