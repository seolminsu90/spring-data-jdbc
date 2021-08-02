package com.spring.jdbc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbc.domain.Article;
import com.spring.jdbc.domain.Comment;
import com.spring.jdbc.repository.ArticleRepository;
import com.spring.jdbc.repository.CommentRepository;

@RestController
public class DataJdbcTestController {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/test1")
    public void repositoryTest() {
        Comment comment1 = new Comment("1");
        Comment comment2 = new Comment("2");

        Article article = new Article(new ArrayList<>(Arrays.asList(comment1, comment2)));
        article = articleRepository.save(article);

        System.out.println("\n##################\n");
        Comment comment3 = new Comment("3");
        article.addComment(comment3); // 전부 삭제가 이루어진 후 전부 다시 Insert 한다.

        article = articleRepository.save(article);

        // 이거 뭔가 쓰기 어렵네
    }
}
