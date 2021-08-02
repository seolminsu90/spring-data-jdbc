package com.spring.jdbc.domain;

import java.util.Set;

import org.springframework.data.annotation.Id;

public class SetSingle {
    @Id
    private Long id;

    private Set<SetMany> manies;

    private SetSingle() {
    }

    public SetSingle(final Set<SetMany> manies) {
        this.manies = manies;
    }

    public Long getId() {
        return id;
    }

    public Set<SetMany> getManies() {
        return manies;
    }
}
