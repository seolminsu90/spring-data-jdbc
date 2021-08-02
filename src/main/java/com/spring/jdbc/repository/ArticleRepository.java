package com.spring.jdbc.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.jdbc.domain.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}
