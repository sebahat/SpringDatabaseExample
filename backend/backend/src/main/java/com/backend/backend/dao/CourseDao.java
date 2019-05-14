package com.backend.backend.dao;

import com.backend.backend.dto.Courses;
import com.backend.backend.dto.Instructor;

public interface CourseDao {
    public Courses getCourse(Integer courseId);

    public Instructor getCourseInstructor(Integer courseId);

    public void deleteCourse(Integer courseId);

    public void updateCourse(Integer courseName);

    public void addCourse(Courses course);
}
