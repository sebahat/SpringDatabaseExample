package com.backend.backend.repsitory;

import com.backend.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAllById(Iterable<Integer> ıterable);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUserName(@Param("username") String username);

}
