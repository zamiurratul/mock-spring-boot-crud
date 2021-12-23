package com.zamiurratul.spring.mock.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zamiurratul.spring.mock.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAll();
}
