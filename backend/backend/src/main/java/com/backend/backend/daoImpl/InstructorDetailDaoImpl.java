package com.backend.backend.daoImpl;

import com.backend.backend.dao.InstructorDetailDao;
import com.backend.backend.dto.InsructorDetail;
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
    public List<InsructorDetail> getInstructorDetail() {
        return null;
    }

    @Override
    public InsructorDetail saveInstructorDetail() {
        return null;
    }
}


