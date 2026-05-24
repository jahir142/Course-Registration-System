package com.example.courseregistrationsystem.repo;

import com.example.courseregistrationsystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Long> {
}
