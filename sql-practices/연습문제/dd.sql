drop table member;
create table member(
	no int(11) not null auto_increment,
	email varchar(200) not null,
	password varchar(64) not null,
	name varchar(100) not null,
	deparment varchar(100),
	primary key(no)
);
desc member;
alter table member add juminbunho char(13) not null after email;
desc member;
alter table member drop juminbunho;
desc member;
alter table member add join_date datetime not null;
desc member;
alter table member change deparment department varchar(100) not null;
desc member;
alter table member add self_intro text;
desc member;


delete from member;
insert into member values(null, 'ktmdgus970807@gmail.com', password('0326'), '김승현', '개발팀', now(), null);

insert into member (no, email, password, name, department, join_date, self_intro)
values(null, 'ktmdgus970807@gmail.com', password('0326'), '김승현', '개발팀', now(), null);

-- update
update member
	set email='sh970807@naver.com', password = password('0807')
    where no = 3;
select * from member;
    
    
-- delete
delete
	from member
    where no = 3;
select * from member;

-- transaction
select @@AUTOCOMMIT;
set autocommit=0;

insert into member (no, email, password, name, department, join_date, self_intro)
values(null, 'ktmdgus9708071@gmail.com', password('0326'), '김승현1', '개발팀1', now(), null);
select * from member;

commit;
select * from member;