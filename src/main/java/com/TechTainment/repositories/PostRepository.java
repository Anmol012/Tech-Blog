package com.TechTainment.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.TechTainment.entities.Category;
import com.TechTainment.entities.Post;
import com.TechTainment.entities.User;



public interface PostRepository extends JpaRepository<Post,Integer> {
	
	List<Post> findPostByUser(User username);
	List<Post> findPostByUser(User username,Sort sort);
	List<Post> findPostByCategory(Category category);
	Page<Post> findPostByCategory(Category category,Pageable pageable);

}
