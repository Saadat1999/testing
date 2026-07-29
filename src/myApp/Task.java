package myApp;

import java.util.Date;

public class Task {
    String task;
    int id;
    Date created;
    Date modified;
    boolean done;

    public Task() {

    }
    public Task(String task) {
        this.task = task;
//        this.id = id;
        this.created = new Date();
        this.modified = created;
    }

    public void markDone() {
        this.done = true;
        this.modified = new Date();
    }

    public void showCreatedTime() {
        System.out.println(created);
    }

    public void showModifiedTime() {
        System.out.println(modified);
    }

    private void setTask(String name) {
        task = name;
    }

    private void setIndex(int id) {
        this.id = id;
    }

    public String getTaskName() {
      return task;
    }

    public int getTaskID() {
        return id;
    }

    @Override
    public String toString() {
        if(done) {
            return task + " ✓";
        }
        return task;
    }
}
