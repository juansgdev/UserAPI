package com.juca.usersapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juca.usersapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
