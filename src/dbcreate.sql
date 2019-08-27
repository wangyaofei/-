create database cppmanage;

use cppmanage;

create TABLE student
(
    stuid varchar(32) PRIMARY KEY,
    stuname VARCHAR(32),
    stupsw varchar(32),
    stusex varchar(4),
    stuemail varchar(20),
    tchid varchar(32),
    clsid varchar(32),
    grpid varchar(32),
    proid varchar(32)
);

INSERT into student(stuid,stuname,stupsw,stusex,stuemail) VALUES('1','��ͬѧ','1234','��','123@qq.com');
INSERT into student(stuid,stuname,stupsw,stusex,stuemail) VALUES('2','��ͬѧ','1234','Ů','wangyf_hi@126.com');
INSERT into student(stuid,stuname,stupsw,stusex,stuemail) VALUES('3','��ͬѧ','1234','��','haha@163.com');

create TABLE teacher
(
    tchid varchar(32) PRIMARY KEY,
    tchname VARCHAR(32),
    tchpsw varchar(32),
    tchsex varchar(4),
    tchemail varchar(20),
    tchdep varchar(20),
    tchtitle varchar(20)
);
INSERT into teacher(tchid,tchname,tchpsw,tchsex,tchemail) VALUES('3','����ʦ','1234','��','haha@163.com');
INSERT into teacher(tchid,tchname,tchpsw,tchsex,tchemail) VALUES('4','����ʦ','1234','��','haha@163.com');

create table admin
(
	admid varchar(32) PRIMARY KEY,
	admname VARCHAR(32),
	admpsw varchar(32)
);
INSERT into admin VALUES(10000,'����Ա','1234');


