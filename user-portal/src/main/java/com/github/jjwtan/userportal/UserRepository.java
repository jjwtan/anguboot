package com.github.jjwtan.userportal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);

    User findByUsername(String username);
}