package com.Course.Courses.Repository;

import com.Course.Courses.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
    Course findById(int id);
}
