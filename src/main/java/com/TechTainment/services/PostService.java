package com.TechTainment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.web.multipart.MultipartFile;

import com.TechTainment.dto.PostResponseDto;
import com.TechTainment.entities.Category;
import com.TechTainment.entities.Post;
import com.TechTainment.entities.User;

public interface PostService {
	
	Post createPost(Post post,String username,String categoryname,MultipartFile file,String folderpath);
	Post getPostById(Integer id);
	Post updatePostById(Post newpostdata,Integer postid,String username);
	void deletePostById(Integer id);
	PostResponseDto getAllPosts(Integer pagenumber,Integer pagesize,boolean mostrecentfirst);
	PostResponseDto getAllPostsByCategory(String category,Integer pagenumber, Integer pagesize,
			boolean mostrecentfirst);
	List<Post> getAllPostsByUser(String username,boolean mostrecentfirst);
}
