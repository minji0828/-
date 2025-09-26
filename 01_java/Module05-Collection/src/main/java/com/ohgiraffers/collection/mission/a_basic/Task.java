package com.ohgiraffers.collection.mission.a_basic;

public class Task {
    private int id;
    private String content;
    public Task(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
