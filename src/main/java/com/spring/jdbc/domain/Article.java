package com.spring.jdbc.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "Article")
public class Article {
    @Id
    @Column("id")
    private Long id;

    @Column("createdAt")
    @CreatedDate
    private LocalDateTime createdAt;

    @Column("title")
    private String title;

    @Column("content")
    private String content;

    @Column("updatedAt")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Embedded.Nullable
    private Comments comments;

    private Article() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Article(Comments comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Comments getComments() {
        return comments;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

}
