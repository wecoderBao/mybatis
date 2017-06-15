create database mybatis;

use mybatis;

create table user(
	id int primary key auto_increment,
	username varchar(20),
	password varchar(20),
	sex varchar(20),
	address varchar(20)
);