package com.campusdual.springbackend.model.dao;


import com.campusdual.springbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
