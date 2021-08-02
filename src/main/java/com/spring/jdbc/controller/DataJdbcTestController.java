package com.spring.jdbc.controller;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbc.domain.Article;
import com.spring.jdbc.domain.Comment;
import com.spring.jdbc.domain.Comments;
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

        Set<Comment> set = new HashSet<>();
        set.add(comment1);
        set.add(comment2);
        Article article = new Article(new Comments(set));
        article = articleRepository.save(article);

        System.out.println("\n##################\n" + article.getComments().getSize());

    }

    @GetMapping("/test2")
    public void repositoryTest2() {
        Comment comment4 = new Comment(1L, "11");
        Comment comment5 = new Comment(1L, "22");
        commentRepository.save(comment4);
        commentRepository.save(comment5);

        Optional<Article> articleOp = articleRepository.findById(1L);
        // 하위가 삭제되고 comment가 Insert되는데 긁적
        if (articleOp.isPresent()) {
            Article article = articleOp.get();
            article.setTitle("UpdatedTitle");
            articleRepository.save(article);
        }
    }

    @GetMapping("/test22")
    public void repositoryTest22() {
        Comment comment4 = new Comment(1L, "111");
        Comment comment5 = new Comment(1L, "222");
        Comment comment6 = new Comment(1L, "333");
        commentRepository.save(comment4);
        commentRepository.save(comment5);
        commentRepository.save(comment6);

        Optional<Article> articleOp = articleRepository.findById(1L);
        // 하위가 삭제되고 comment가 Insert되는데 긁적
        if (articleOp.isPresent()) {
            Article article = articleOp.get();
            article.setTitle("UpdatedTitle");
            articleRepository.save(article);
        }
    }

    @GetMapping("/test3")
    public void repositoryTest3() {
        // 앜티클만 가져와서 업데이트해도 똑같ㄴ타?
        Optional<Article> articleOp = articleRepository.findById(1L);
        // 하위가 삭제되고 comment가 Insert되는데 긁적
        if (articleOp.isPresent()) {
            System.out.println("#####################");
            Article article = articleOp.get();

            System.out.println("#####################");
            article.setTitle("UpdatedTitle");
            articleRepository.save(article);
        }
    }
}
