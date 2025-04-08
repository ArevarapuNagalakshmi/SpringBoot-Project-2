package com.Course.Courses.Controller;

import com.Course.Courses.Dto.CourseDto;
import com.Course.Courses.Entity.Course;
import com.Course.Courses.Services.CourseServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class ControllerCourse {
    @Autowired
    private CourseServicesImpl courseServicesImpl;

    @PostMapping("/savecourse")
    public ResponseEntity<CourseDto>savecourse(@RequestBody CourseDto courseDto){
      CourseDto courseDto1=courseServicesImpl.savecourse(courseDto);
        return new ResponseEntity<>(courseDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CourseDto>getcourse(@PathVariable int id){
     CourseDto courseDto=courseServicesImpl.getcourse(id);
        return new ResponseEntity<>(courseDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CourseDto> updatecourse(
            @PathVariable int id,@RequestBody CourseDto courseDto){
        CourseDto courseDto1=courseServicesImpl.updatecourse(id,courseDto);
        return new ResponseEntity<>(courseDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Course>deletecourse(@PathVariable int id){
        Course course=courseServicesImpl.deletecourse(id);
        return new ResponseEntity<>(course,HttpStatus.OK);
    }
}
