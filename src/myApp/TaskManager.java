package myApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    List<Task> list = new ArrayList<>();



    public Task addTask(String name) {
        Task task = new Task(name);
        list.add(task);
        return task;
    }

    public void removeTask(int index) {
        try {
            list.remove(index);
//            System.out.println("Removed successfully ✓");
        } catch (IndexOutOfBoundsException e) {
//
        }
    }

    public void changeStatus(int index) {
        if(index>0 && list.size()>=index) {
            list.get(index).markDone();
        }
    }

    public List<Task> showAll() {
        return list;
    }

    public Date showCreatedTime(int index) {
       return list.get(index-1).created;
    }

    public Date showModifyTime(int index) {
        return list.get(index-1).modified;
    }
}
