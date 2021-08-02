package com.spring.jdbc.domain;

import org.springframework.data.annotation.Id;

public class SuperOne {
    @Id
    private Long id;
    private String superName;
    private SubOne subOne;

    private SuperOne() {
    }

    public SuperOne(final String superName, final SubOne subOne) {
        this.superName = superName;
        this.subOne = subOne;
    }

    public Long getId() {
        return id;
    }

    public SubOne getSubOne() {
        return subOne;
    }
}
