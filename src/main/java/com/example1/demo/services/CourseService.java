package com.example1.demo.services;

import java.util.List;

import com.example1.demo.entity.Course;

public interface CourseService {
    
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);
}
