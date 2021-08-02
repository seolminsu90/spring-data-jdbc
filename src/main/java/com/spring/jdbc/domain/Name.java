package com.spring.jdbc.domain;

public class Name {
    // id 필드가 존재해선 안된다.
    private String firstName;
    private String lastName;

    private Name() {
    }

    public Name(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
