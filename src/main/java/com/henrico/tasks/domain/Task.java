package com.henrico.tasks.domain;

import com.henrico.tasks.domain.enums.TaskStatus;

import java.util.Date;

public class Task {

    private String taskId;
    private String title;
    private String description;
    private Date deadline;
    private TaskStatus taskStatus;
    private Integer coins;

    private Integer userId;

    public Task() {
    }

    public Task(String taskId, String title, String description, Date deadline, TaskStatus taskStatus, Integer coins, Integer userId) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.taskStatus = taskStatus;
        this.coins = coins;
        this.userId = userId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
