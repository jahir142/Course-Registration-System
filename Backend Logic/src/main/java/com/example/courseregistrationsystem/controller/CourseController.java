package com.example.courseregistrationsystem.controller;


import com.example.courseregistrationsystem.model.Course;
import com.example.courseregistrationsystem.model.CourseRegistry;
import com.example.courseregistrationsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/enroll")
    public List<CourseRegistry> enrolled(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String courseEnroll(@RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("course") String course){

        courseService.courseEnrolled(name,email,course);
        return "Congratulation! "+ name +" Enrolled for course in "+ course;
    }
}
