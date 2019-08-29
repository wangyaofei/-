create database cppmanage;

use cppmanage;

create table admin
(
	admid varchar(32) PRIMARY KEY,
	admname VARCHAR(32),
	admpsw varchar(32)
);
INSERT into admin VALUES(10000,'����Ա','1234');

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

create table mclass
(
	clsid varchar(32) PRIMARY KEY,
	clsname varchar(32),
	tchid varchar(32),
	FOREIGN KEY (tchid) REFERENCES teacher(tchid)
);

INSERT into mclass(clsid,clsname) values('1','16�ƿ�1');

create table mproject
(
	proid varchar(32) PRIMARY KEY,
	proname varchar(32),
	proinfo text,
	prodegree varchar(32)
);

INSERT into mproject values('1','������','�ܳ��ܳ�������','3.5');


create table mgroup
(
	grpid varchar(32) PRIMARY KEY,
	grpname varchar(32),
	grpleader varchar(32),
	proid varchar(32),
	FOREIGN KEY (proid) REFERENCES mproject(proid)
);

INSERT into mgroup(grpid,grpname) values('1','������');


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
    proid varchar(32),
    FOREIGN KEY (tchid) REFERENCES teacher(tchid),
    FOREIGN KEY (clsid) REFERENCES mclass(clsid),
    FOREIGN KEY (grpid) REFERENCES mgroup(grpid),
    FOREIGN KEY (proid) REFERENCES mproject(proid)
);

INSERT into student(stuid,stuname,stupsw,stusex,stuemail) VALUES('1','��ͬѧ','1234','��','123@qq.com');
INSERT into student(stuid,stuname,stupsw,stusex,stuemail) VALUES('2','��ͬѧ','1234','Ů','wangyf_hi@126.com');
INSERT into student(stuid,stuname,stupsw,stusex,stuemail) VALUES('3','��ͬѧ','1234','��','haha@163.com');

create table score
(
	scrid varchar(32) PRIMARY KEY,
	scrvalue int,
	tchid varchar(32),
	stuid varchar(32),
	FOREIGN KEY (tchid) REFERENCES teacher(tchid),
	FOREIGN KEY (stuid) REFERENCES student(stuid)
);

INSERT into score(scrid,scrvalue) values('1',95);


