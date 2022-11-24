package com.training.userapplication.dao;

import com.training.userapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //jpql

    User findByFirstName(String firstName);

}
