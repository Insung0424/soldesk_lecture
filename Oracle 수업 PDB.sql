create table student(
stu_no char(9),
stu_name varchar2(12),
stu_dept varchar2(20),
stu_grade number(1),
stu_class char(1),
stu_gender char(1),
stu_height number(5,2),
stu_weight number(5,2),
constraint p_stu_no primary key(stu_no));

create table subject(
sub_no char(3),
sub_name varchar2(30),
sub_prof varchar2(12),
sub_grade number(1),
sub_dept varchar2(20),
constraint p_sub_no primary key(sub_no));

create table enrol(
sub_no char(3),
stu_no char(9),
enr_grade number(3),
constraint p_course primary key(sub_no,stu_no));

--desc student;
--desc subject;
--desc enrol;
select *from student;
--(student테이블내에서 *정보를 검색해서 가져온다)
insert into student values(20153075,'이은결','기계',1,'c','m',177,80);
insert into student values(20153088,'이태연','기계',1,'c','f',162,50);
insert into student values(20143054,'유가인','기계',2,'c','f',154,47);
insert into student values(20152088,'조민우','전기전자',1,'c','m',188,90);
insert into student values(20142021,'심수정','전기전자',2,'a','f',167,45);
insert into student values(20132003,'박희철','전기전자',3,'b','m',null,63);
insert into student values(20151062,'김인중','컴퓨터정보',1,'b','m',166,67);
insert into student values(20141007,'진현무','컴퓨터정보',2,'a','m',174,64);
insert into student values(20131001,'김종헌','컴퓨터정보',3,'c','m',null,72);
insert into student values(20131025,'옥성우','컴퓨터정보',3,'a','f',172,63);

--select * from student order by stu_height;

insert into subject values('111','데이터베이스','이재영',2,'컴퓨터정보');
insert into subject values('110','자동제어','정순정',2,'전기전자');
insert into subject values('109','자동화설계','박민영',3,'기계');
insert into subject values('101','컴퓨터개론','강종영',3,'컴퓨터정보');
insert into subject values('102','기계공작법','김태영',1,'기계');
insert into subject values('103','기초전자실험','김유석',1,'전기전자');
insert into subject values('104','시스템분석설계','강석현',3,'컴퓨터정보');
insert into subject values('105','기계요소설계','김명성',1,'기계');
insert into subject values('106','전자회로시험','최영민',3,'전기전자');
insert into subject values('107','CAD응용실습','구봉규',2,'기계');
insert into subject values('108','소프트웨어공학','권민성',1,'컴퓨터정보');

insert into enrol values('101','20131001',80);
insert into enrol values('104','20131001',56);
insert into enrol values('106','20132003',72);
insert into enrol values('103','20152088',45);
insert into enrol values('101','20131025',65);
insert into enrol values('104','20131025',65);
insert into enrol values('108','20151062',81);
insert into enrol values('107','20143054',41);
insert into enrol values('102','20153075',66);
insert into enrol values('105','20153075',56);
insert into enrol values('102','20153088',61);
insert into enrol values('105','20153088',78);

drop table enrol; -- 해당테이블 내용 구조 까지 삭제
delete from enrol; -- 해당테이블 내용 삭제(데이터만 삭제)

desc student; --테이블 구조 출력

select * from student;
-- 원하는 테이블에서 해당테이블의 모든정보( * )검색 
select * from subject;
select * from enrol;

select stu_no,stu_name from student;
-- 원하는 테이블내에서 검색시 ,로 원하는 필드들만 검색해서 볼 수 있다 

select stu_dept from student; --학과만 검색

desc enrol;

select stu_name,stu_no,stu_grade
from student
order by stu_height;

select distinct stu_dept from student; 
--해당 열의 중복제거(distinct)
select all stu_dept from student; 
--중복제거 없이 출력




--6. 과목들의 과목번호와 과목이름을 검색하라.
select sub_no,sub_name from subject;
--7. 학생들의 학번과 이름, 성별을 검색하라.
select stu_no,stu_name,stu_gender from student;
--8. 학생들의 모든 정보를 검색하라.
select * from student;
--9. 학생들의 학번과 이름, 학년, 반을 검색하라.
select stu_no,stu_name,stu_grade,stu_class
from student;
--10. 과목들의 과목이름과 교수이름을 검색하라.
select sub_name,sub_prof
from subject;
--11. 과목번호, 학번, 점수를 검색하라.
--SELECT * FROM enrol;
SELECT sub_no,stu_no,enr_grade FROM enrol;
--12. 학생들의 체중과 신장을 학번, 이름과 함께 검색하라.
select stu_weight,stu_height,stu_name 
from student;
--13. 학생들의 학과 중복을 제거하고 검색하라.
select distinct stu_dept from student;
--14. 학생들의 성별 중복을 제거하고 검색하라.
select distinct stu_gender from student;
--15. 학생들의 학년 중복을 제거하고 검색하라.
select distinct stu_grade from student;

select stu_no as ID, stu_name as name
from student; 
-- 결과 열에 별명 부여하기(소문자로 만들어도 대문자로 출력)

select stu_no,stu_name
from student    --학생테이블에서
where stu_grade = 3; --학년이 3학년인 

select stu_name ||','|| stu_dept||'학과입니다' as 학과성명 from student;
--student테이블에서 학과와 이름을 뽑아서 별칭을 부여
-- || : or기호가 아니라 concat과 같이 합침 (연결연산자)

select stu_name,stu_dept,stu_class,stu_grade 
from student
where stu_dept = '컴퓨터정보' AND stu_grade = 3;
-- 학과가 컴퓨터 정보이고 학년이 3학년인 학생의 이름,학과,반,학년


select *
from student
where stu_weight between 60 and 70;
        --범위조건 between a and b
        
select *
from student
where stu_no between 20140001 and 20149999;
--20140001 부터 20149999 의 학번을 가진학생의 정보

select *
from student
where stu_name like '_인%';
-- 김인중 의 정보만 출력됨

select stu_no,stu_name,stu_dept
from student
where stu_name like '김%';
--where stu_name like '김_'; 김씨로 시작하는 외 자인 사람 예)김 범
-- 의 학번,이름,학과를 출력

select stu_no,stu_name,stu_dept
from student
where stu_name like '_수%';
-- 이름의 첫글자는 아무거나 가운데는 수 인 사람의 학번,이름,학과

select *
from student
where stu_no like '2014%';
-- 학번이 2014로 시작하는 학생의 모든 정보

select * from student;
