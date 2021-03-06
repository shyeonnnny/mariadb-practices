-- Basic Query

-- 테이블 삭제
drop table pet;

-- 테이블 생성
create table pet(
	name varchar(20),
    owner varchar(20),
    species varchar(20),
    gender char(1),
    birth date,
    death date
);

-- 스키마 확인
desc pet;

-- 조회
select name, owner, species, gender, birth, death from pet;

-- 데이터 넣기 ( 생성 : create )
insert
	into pet
    value ('멍멍이', '김승현', 'dog', 'f', '970807', null);
    
-- 데이터 삭제 (delete)
delete
	from pet
    where name = '멍멍이';
    
    
-- load data local infile
load data local  infile "c:\\pet.txt" into table pet;


-- update death
update pet
	set death = null
    where name != 'Bowser';

-- 조회연습 1: where
-- 1990년 이후에 태어난 아이들은 ?
select name, species, birth
	from pet
	where birth > '1990-12-31';
    

-- Gwen과 함께 사는 아이들은?
select name, species, owner
	from pet
    where owner = 'Gwen';


-- null 다루기 1 : 살아있는 애들은 ?
select name , birth, death
	from pet
	where death is null;
    
    
-- null 다루기 1 : 죽은 애들은 ?
select name , birth, death
	from pet
	where death is not null;
    

-- like 검색 (패턴 매칭) : 이름이 b로 시작하는 아이들은?
select name from pet where name like 'b%';

-- like 검색 (패턴 매칭) : 이름이 b로 시작하는 아이들중에 이름이 6자인 아이는?
select name from pet where name like 'b_____'; -- _을 5개 넣어주면 b포함 6글자

-- 집계 (동계) 함수
select count(*) from pet;

select count(death) from pet;
select count(*) from pet where death is not null;



    

-- insert : 데이터 검색
