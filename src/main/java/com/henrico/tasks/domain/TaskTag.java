package com.henrico.tasks.domain;

public class TaskTag {

    private String taskTagId;
    private String tagId;
    private String taskId;

    public TaskTag() {
    }

    public TaskTag(String taskTagId, String tagId, String taskId) {
        this.taskTagId = taskTagId;
        this.tagId = tagId;
        this.taskId = taskId;
    }

    public String getTaskTagId() {
        return taskTagId;
    }

    public void setTaskTagId(String taskTagId) {
        this.taskTagId = taskTagId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

}
