CREATE TABLE users
(
    user_id    INT AUTO_INCREMENT,
    user_name  VARCHAR(255),
    user_email VARCHAR(255) UNIQUE,
    PRIMARY KEY (user_id)
);


CREATE DATABASE guest_book
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;


CREATE TABLE opinion
(
    opinion_id  INT AUTO_INCREMENT,
    name        VARCHAR(255),
    description VARCHAR(255),
    create_time DATETIME,
    PRIMARY KEY (opinion_id)
);


INSERT INTO opinion (name, description, create_time)
values ('opinia1','jest ok', now());

INSERT INTO opinion (name, description, create_time)
values ('opinia2','spoko', now());

INSERT INTO opinion (name, description, create_time)
values ('opinia3','kiepsko', now());

INSERT INTO opinion (name, description, create_time)
values ('opinia4','moglo by byc lepiej', now());

INSERT INTO opinion (name, description, create_time)
values ('opinia1','jest slabo', now());

INSERT INTO opinion (name, description, create_time)
values ('opinia1','bez komentarza', now());