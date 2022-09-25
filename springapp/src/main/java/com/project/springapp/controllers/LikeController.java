package com.project.springapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.springapp.entities.Like;
import com.project.springapp.requests.LikeCreateRequest;
import com.project.springapp.responses.LikeResponse;
import com.project.springapp.services.LikeService;

import lombok.Data;

@Data
@RestController
@RequestMapping("/likes")
public class LikeController {
	
	private LikeService likeService;
	
	public LikeController(LikeService likeService) {
		this.likeService= likeService;
	}
	
	@GetMapping
	public List<LikeResponse> getAllLikes(@RequestParam Optional<Long> userId, @RequestParam Optional<Long> postId){
		return likeService.getAllLikesWithParam(userId, postId);
	}
	
	@PostMapping
	public Like createOneLike(@RequestBody LikeCreateRequest request) {
		return likeService.createOneLike(request);
	}
	
	@GetMapping("/{likesId}")
	public Like getOneLike(@PathVariable Long likeId) {
		return likeService.getOneLikeById(likeId);
	}
	
	@DeleteMapping("/{likesId}")
	public void deleteOneLike(@PathVariable Long likeId) {
		likeService.deleteOneLikeById(likeId);
	}

}
