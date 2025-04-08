package com.Course.Courses.Services;

import com.Course.Courses.Dto.CourseDto;
import com.Course.Courses.Entity.Course;
import com.Course.Courses.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServicesImpl implements CourseServices {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public CourseDto savecourse(CourseDto courseDto) {
        Course course=new Course(
           courseDto.getId(),
           courseDto.getName(),
           courseDto.getPrice(),
           courseDto.getType()
        );
        Course course1=courseRepo.save(course);
        CourseDto courseDto1=new CourseDto(
                course1.getId(),
                course1.getName(),
                course1.getPrice(),
                course1.getType()
        );
        return courseDto1;
    }

    @Override
    public CourseDto getcourse(int id) {
        Course course=courseRepo.findById(id);
        CourseDto courseDto=new CourseDto(
                course.getId(),
                course.getName(),
                course.getPrice(),
                course.getType()
        );
        return courseDto;
    }

    @Override
    public CourseDto updatecourse(int id, CourseDto courseDto) {
     Course course=courseRepo.findById(id);
     course.setName(courseDto.getName());
     course.setPrice(courseDto.getPrice());
     course.setPrice(courseDto.getPrice());
     Course course1=courseRepo.save(course);
        return new CourseDto(
                course1.getId(),
                course1.getName(),
                course1.getPrice(),
                course1.getType()

        );
    }
    public Course deletecourse(int id){
     Course course=courseRepo.findById(id);
        courseRepo.deleteById(id);
        return course;
    }
}
