package com.backend.backend.dao;

import com.backend.backend.model.Courses;
import com.backend.backend.model.Instructor;

public interface CourseDao {
    Courses getCourse(Integer courseId);

    Instructor getCourseInstructor(Integer courseId);

    void deleteCourse(Integer courseId);

    void updateCourse(Integer courseId, String title);

    void addCourse(Courses course);
}
