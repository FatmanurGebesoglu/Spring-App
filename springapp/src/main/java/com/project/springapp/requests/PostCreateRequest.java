package com.project.springapp.requests;

import lombok.Data;

@Data
public class PostCreateRequest {
	
	Long id;
	String text;
	String title;
	Long userId;

}
