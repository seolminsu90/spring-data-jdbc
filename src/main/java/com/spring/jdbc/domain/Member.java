package com.spring.jdbc.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

public class Member {
    @Id
    private Long id;

    @Embedded.Nullable // Embedded라고 선언해야한다.
    private Name name;

    private Member() {
    }

    public Member(final Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
