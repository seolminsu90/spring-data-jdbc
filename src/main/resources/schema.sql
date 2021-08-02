/* 1 : 1 */
CREATE TABLE SUPER_ONE
(
    id         BIGINT auto_increment,
    super_name varchar(255),
    primary key (id)
);

CREATE TABLE SUB_ONE
(
    id        BIGINT auto_increment,
    super_one BIGINT,
    sub_name  varchar(255),
    primary key (id)
);

ALTER TABLE SUB_ONE
    ADD FOREIGN KEY (super_one)
        REFERENCES SUB_ONE (id);
        
/* Embedded VO */

CREATE TABLE MEMBER
  (
      id BIGINT auto_increment,
      first_name varchar(255),
      last_name  varchar(255),
      primary key (id)
  );
  
/* 1 : N */
  
  CREATE TABLE SET_SINGLE
  (
      id BIGINT auto_increment,
      primary key (id)
  );

  CREATE TABLE SET_MANY
  (
      id         BIGINT auto_increment,
      set_single BIGINT,
      many_name  varchar(255),
      primary key (id)
  );

  ALTER TABLE SET_MANY
      ADD FOREIGN KEY (set_single)
          REFERENCES SET_SINGLE (id);

/* Test */
  CREATE TABLE Article
  (
    id BIGINT auto_increment,
    createdAt DATETIME NULL,
    updatedAt DATETIME NULL,
    title VARCHAR(100),
    content VARCHAR(500),

    primary key (id)
  );
  
  CREATE TABLE Comment
  (
    id BIGINT auto_increment,
    articleId BIGINT,
    createdAt DATETIME NULL,
    updatedAt DATETIME NULL,
    content VARCHAR(300),

    primary key (id)
  );
  