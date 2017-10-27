create table board(
	num int NOT NULL,
	writer varchar2(10) NOT NULL,
	email varchar2(30) default NULL,
	subject varchar2(50) NOT NULL,
	passwd varchar2(12) NOT NULL,
	reg_date date NOT NULL,
	readcount int default 0,
	ref int NOT NULL,
	re_step int NOT NULL,
	re_level int NOT NULL,
	content varchar2(2000) NOT NULL,
	ip varchar2(20) NOT NULL,
	PRIMARY KEY(num)
);
create sequence board_num_seq;
