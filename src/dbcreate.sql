create database cppmanage;

use cppmanage;

create TABLE user
(
    id VARCHAR(16) PRIMARY KEY,
    name VARCHAR(32),
    password varchar(32),
    tel VARCHAR(16),
    power int
);

INSERT into USER VALUES('10000','admin','1234','15326004997',3);