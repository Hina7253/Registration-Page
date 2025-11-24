package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

}
