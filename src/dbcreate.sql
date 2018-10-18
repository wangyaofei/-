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