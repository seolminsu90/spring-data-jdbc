package com.spring.jdbc.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.relational.core.mapping.MappedCollection;

public class Comments {
    @MappedCollection(idColumn = "articleId")
    private Set<Comment> comments;

    public Comments() {

    }

    public int getSize() {
        if (this.comments == null)
            return 0;
        return this.comments.size();
    }

    public void addComment(Comment comment) {
        if (this.comments != null)
            this.comments.add(comment);
    }

    public Comments(Set<Comment> comments) {
        this.comments = comments;
    }

    public static Comments empty() {
        return new Comments(new HashSet<>());
    }
}
