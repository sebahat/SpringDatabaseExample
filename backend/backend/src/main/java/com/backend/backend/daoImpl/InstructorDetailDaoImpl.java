package com.backend.backend.daoImpl;

import com.backend.backend.dao.InstructorDetailDao;
import com.backend.backend.dto.InsructorDetail;
import com.backend.backend.dto.Instructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class InstructorDetailDaoImpl implements InstructorDetailDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public InsructorDetail getInstructorDetail(Integer instructorDetailId) {

        return entityManager.find(InsructorDetail.class, instructorDetailId);
    }

    @Override
    public void saveInstructorDetail(InsructorDetail instructorDetail) {
        entityManager.persist(instructorDetail);
    }

    @Override
    public InsructorDetail instructorDetailUpdate() {
        return null;
    }

    @Override
    public Instructor getInstructor(Integer instructorDetailId) {
        InsructorDetail detail = entityManager.find(InsructorDetail.class, instructorDetailId);
        return detail.getInstructor();
    }
}


