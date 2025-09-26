package com.ohgiraffers.collection.mission.a_basic;

import java.util.ArrayList;

public class console {
    private ArrayList<Task> tasklist = new ArrayList<>();
    private int id;

    public void addtask(String content) {
        tasklist.add(new Task(id, content));
        id++;
    }

    public void removetask(int id) {
        tasklist.remove(id);
        --id;
    }

    public void findtask(int id) {
        for (Task task : tasklist) {
            if (task.getId() == id) {
                System.out.println(task.getContent());
            }
        }
    }
    public void prinalltask() {
        System.out.println(tasklist.toString());
    }
}
