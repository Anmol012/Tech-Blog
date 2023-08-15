package com.TechTainment.dto;

import java.util.Date;
import java.util.List;

import com.TechTainment.entities.Category;
import com.TechTainment.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private int pid;
	private String title;
	private String content;
	private String image;
	private Date date;
	private CategoryDto category;
	private UserDto user;
	private List<CommentDto> comments;
}
