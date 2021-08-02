package com.spring.jdbc.domain;

import org.springframework.data.annotation.Id;

public class SubOne {
    // Embedded가 아닌 참조 엔티티는 id가 필요하다.
    @Id
    private Long id;
    // 선언할 필요없다. 자신을 참조하는 엔티티의 테이블 명으로 컬럼이 필요하도록 기본전략이 걸려있다.
    // private Long superOne;
    private String subName;

    private SubOne() {
    }

    public SubOne(final String subName) {
        this.subName = subName;
    }

    public Long getId() {
        return id;
    }
}
