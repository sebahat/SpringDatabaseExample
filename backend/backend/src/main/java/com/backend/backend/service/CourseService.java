package com.backend.backend.service;

import com.backend.backend.dao.CourseDao;
import com.backend.backend.daoImpl.CourseDaoImpl;
import com.backend.backend.dto.Courses;
import com.backend.backend.dto.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public Courses getCourse(Integer courseId) {
        return courseDao.getCourse(courseId);
    }


    public Instructor getCourseInstructor(Integer courseId) {
        return courseDao.getCourseInstructor(courseId);
    }

    public void deleteCourse(Integer courseId) {
        courseDao.deleteCourse(courseId);
    }

    public void addCourse(Courses course) {
        courseDao.addCourse(course);
    }
}
