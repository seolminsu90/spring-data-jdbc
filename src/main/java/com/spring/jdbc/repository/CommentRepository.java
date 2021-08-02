package com.spring.jdbc.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.jdbc.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
