package com.TechTainment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechTainment.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
