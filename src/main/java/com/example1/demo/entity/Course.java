package com.example1.demo.entity;

public class Course {
   
    private long id;
    private String desc;
    private String title;
    public Course(long id, String desc, String title) {
        super();
        this.id = id;
        this.desc = desc;
        this.title = title;
    }
    public Course() {
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Course [desc=" + desc + ", id=" + id + ", title=" + title + "]";
    }
   
    
    
}
