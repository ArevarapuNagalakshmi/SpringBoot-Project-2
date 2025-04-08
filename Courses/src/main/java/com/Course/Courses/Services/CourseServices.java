package com.Course.Courses.Services;

import com.Course.Courses.Dto.CourseDto;

public interface CourseServices {
    CourseDto savecourse(CourseDto courseDto);
    CourseDto getcourse(int id);
    CourseDto updatecourse(int id,CourseDto courseDto);


}
