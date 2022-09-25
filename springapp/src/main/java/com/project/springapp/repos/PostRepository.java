package com.project.springapp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUserId(Long userId);

}
