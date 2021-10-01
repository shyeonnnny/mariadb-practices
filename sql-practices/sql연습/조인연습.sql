-- ineer join
-- 에제1 : employees 테이블과 title 테이블을 join하여 직원의 이름과 직책을 모두 출력
select a.first_name, b.title
	from employees a, titles b
    where a.emp_no= b.emp_no    -- join 조건 (n-1)
    and b.to_date = '9999-01-01';  -- row 선택 조건

-- 예제2 : employees 테이블과 titles 테이블을 join 하여 직원의 이름과 직책을 출력하되 여성 엔지니어만 출력
select a.first_name, b.title, a.gender
	from employees a, titles b
    where a.emp_no= b.emp_no    -- join 조건 (n-1)
    and b.to_date = '9999-01-01'  -- row 선택 조건1
	and a.gender = 'f' -- row 선택 조건2
    and b.title = 'engineer'; -- row 선택 조건3
    
-- ANSI/ISO SQL1999 join 표준 문법
-- 1) natural join
-- 두 테이블에 공통 컬럼이 있으면 별 다른 조인 조건 없이 암묵적으로 조인이 됨
-- 쓸 일 없음
select a.first_name, b.title
	-- from employees a join title b on a.emp_no = b.emp_no
    from employees a natural join titles b  -- natural일때는 위와같은 on 생략
											-- 그대신 공통 colume을 가질 경우
    where b.to_date = '9999-01-01'; -- row 선택 조건
    
-- 2) join ~ using
select a.first_name, b.title
	from employees a  join titles b  using (emp_no)
    where b.to_date = '9999-01-01'; -- row 선택 조건
    
    
-- 3) join ~ on
select a.first_name, b.title
	from employees a join titles b on a.emp_no = b.emp_no
	where b.to_date = '9999-01-01'; -- row 선택 조건

-- outer join
-- insert into dept values(null, '개발');
-- insert into dept values(null, '영업');
-- insert into dept values(null, '총무');
-- insert into dept values(null, '기획');
-- ctrl + slush = 여러줄 주석
select * from dept;
-- insert into emp values(null, '둘리', 3);
-- insert into emp values(null, '마이콜', 2);
-- insert into emp values(null, '또치', 1);
-- insert into emp values(null, '길동이', null);
select * from emp;

select a.name as '이름', b.name as '부서'
	from emp a join dept b on a.dept_no = b.no; -- 이까지만하면 길동이없이나옴

select a.name as '이름', ifnull(b.name, '없음') as '부서'
	from emp a left join dept b on a.dept_no = b.no; -- 왼쪽(이름)이 안나온 사람도 나오게 출력
    
select a.name as '이름', b.name as '부서'
	from emp a right join dept b on a.dept_no = b.no; -- 오른쪽(부서)은 전부 출력