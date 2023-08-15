package com.TechTainment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechTainment.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
