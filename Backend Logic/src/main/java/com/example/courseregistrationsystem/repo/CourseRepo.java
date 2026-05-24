package com.example.courseregistrationsystem.repo;

import com.example.courseregistrationsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, String> {
}
