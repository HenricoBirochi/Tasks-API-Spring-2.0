package com.henrico.tasks.domain;

public class Tag {

    private String tagId;
    private String title;
    private String description;

    public Tag() {
    }

    public Tag(String tagId, String title, String description) {
        this.tagId = tagId;
        this.title = title;
        this.description = description;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
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

}
