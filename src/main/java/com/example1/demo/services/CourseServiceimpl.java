package com.example1.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example1.demo.entity.Course;

@Service
public class CourseServiceimpl implements CourseService {
    List<Course> list;
    public CourseServiceimpl(){
        list = new ArrayList<>();
        list.add(new Course(100, "This is a new course for Computer Science", "New Course"));
        list.add(new Course(101, "learning Spring boot ", "Spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list){
            if(course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
    
}
