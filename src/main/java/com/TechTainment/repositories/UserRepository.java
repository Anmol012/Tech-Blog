package com.TechTainment.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechTainment.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findUserByUsername(String username);
	Optional<User> findUserByUsernameAndPassword(String username,String password);

}
