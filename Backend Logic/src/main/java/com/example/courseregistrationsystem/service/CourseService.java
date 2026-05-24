package com.example.courseregistrationsystem.service;

import com.example.courseregistrationsystem.model.Course;
import com.example.courseregistrationsystem.model.CourseRegistry;
import com.example.courseregistrationsystem.repo.CourseRegistryRepo;
import com.example.courseregistrationsystem.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void courseEnrolled(String name, String email, String course) {

        CourseRegistry courseRegistry=new CourseRegistry(name,email,course);

        courseRegistryRepo.save(courseRegistry);
    }
}
