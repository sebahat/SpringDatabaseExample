package com.backend.backend.daoImpl;

import com.backend.backend.dao.CourseDao;
import com.backend.backend.model.Courses;
import com.backend.backend.model.Instructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseDaoImpl implements CourseDao {
    //Persistence Context managed lifecyle entity Entity manager
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Courses getCourse(Integer courseId) {
        return entityManager.find(Courses.class, courseId);
    }

    @Override
    public Instructor getCourseInstructor(Integer courseId) {
        return null;
    }

    @Override
    public void deleteCourse(Integer courseId) {
        Courses course = entityManager.find(Courses.class, courseId);
        entityManager.remove(course);
    }

    @Override
    public void updateCourse(Integer courseId, String title) {
        Courses tmpCourse = entityManager.find(Courses.class, courseId);
        tmpCourse.setTitle(title);
    }

    @Override
    public void addCourse(Courses course) {
        entityManager.persist(course);
    }
}
