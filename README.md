# spring-data-jdbc
spring-data-jdbc 연결 샘플

Spring Data Jdbc는 Data Jpa가 가진 단점(? 또는 복잡성?)을 해결하기 위해 나온 라이브러리
https://www.slideshare.net/SpringCentral/the-new-kid-on-the-block-spring-data-jdbc

다만 아직은 미완성 느낌이 든다.
차차 하나씩 Sample을 붙여서 나중에 쓸일 있을 때 쓰기.

메모
```

생성자
no-argument constructor를 제일 우선으로 사용한다.
argument를 받는 생성자 한 개만 있다면 그 생성자를 사용한다.
argument를 받는 생성자가 여러 개 있다면 @PersistenceConstructor 애노테이션이 붙은 생성자를 사용한다.

권장 사항
불변 객체를 사용해라
all-args constructor를 제공해라
생성자 오버로딩보다는 팩터리 메서드를 사용해라(@PersistenceConstructor를 사용하지 않아도 됨)
롬복을 사용해라

```
