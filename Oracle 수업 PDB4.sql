select a.*,sub_name from enrol a, subject b 
where a.sub_no=b.sub_no order by 1;

select a.*,sub_name from enrol a right outer join subject b
on a.sub_no=b.sub_no
order by 1;

--10, 20번부서 사원들 중 최고 급여를 받는 사원의 사원번호, 사원이름, 급여를검색하라. (부질의)
select empno,ename,sal,deptno from emp1 
where sal in --급여중
(select max(sal) --최고급여
from emp1 
group by deptno --부서별
having deptno in ('10','20')); --10,20부서에서

--30번 부서의사원 중 최저 급여를 받는 사원의 사원번호, 사원이름, 급여를검색하라. 
select empno,ename,sal,deptno from emp1 where sal in 
(select min(sal) from emp1 where deptno = 30);

--47. 전체 사원들중 최고 커미션을 받는 사원의 사원번호, 사원이름, 커미션을검색하라.(부질의)
select empno,ename,comm from emp1 where comm = 
(select max(comm) from emp1);

--전체 사원들중 최저 커미션을 받는 사원의 사원번호, 사원이름, 커미션을검색하라.(부질의)
select empno,ename,comm from emp1 where comm = 
(select min(comm) from emp1);

--11. FORD 사원과 같은 급여를 받는 사원의 사원번호를검색하라. (부질의)
select empno,ename from emp1 where sal = 
(select sal from emp1 where ename = 'FORD')
and ename<>'FORD';
--12. 부서이름이 ‘SALES’이면서 사원직무가 ‘MANAGER’인 사원의 사원번호, 사원이름을 사원이름 순으로 검색하라. (natural join)
select empno,ename from emp1 natural join dept1 
where dname='SALES' and job='MANAGER'
order by ename; 
--13. SCOTT 사원보다 많은 급여를 받는 사원 정보를검색하라. (부질의)
select * from emp1 where sal > 
(select sal from emp1 where ename='SCOTT');
--14. ALLEN 사원보다 적은 급여를 받는 사원 정보를검색하라. (부질의)
select * from emp1 where sal < 
(select sal from emp1 where ename='ALLEN');
--15. 전체 사원의 평균 급여보다 급여가 많은 사원 정보를 검색하라. (부질의)
select * from emp1 where sal > 
(select avg(sal) from emp1);
--16. CHICAGO 지역에 위치하는 부서에 근무하는사원 정보를 검색하라. (부질의)
select * from emp1 natural join dept1 where loc = 
(select loc from dept1 where loc in 'CHICAGO');

select * from emp1 natural join dept1 where loc in 'CHICAGO';

select * from emp1 
where deptno = (select deptno from dept1 where loc = 'CHICAGO')
order by empno;

select e.* 
from emp1 e inner join dept1 d 
on e.deptno = d.deptno 
and d.loc = 'CHICAGO'
order by e.empno; 

--각 학과별 평균키
select stu_dept,trunc(avg(stu_height))
from student group by stu_dept;

create table a_student as select * from student 
where stu_dept in ('기계','전기전자');
--기존의 student 테이블을 복사함
select * from a_student;

create table b_student as select * from student 
where stu_dept in ('전기전자','컴퓨터정보');
select * from b_student;

select * from a_student union select * from b_student;
-- student 테이블과 같은 결과 : 중복제거 되면서 합쳐짐

select * from a_student union all select * from b_student;
-- 중복제거 안되면서 합쳐짐 (단순 테이블 나열에 가까움)

select * from a_student intersect select * from b_student;
-- 교집합 중복된(공통된) 자료만 가져옴

select * from a_student minus select * from b_student;
-- 왼쪽을 기준으로 공통된 부분을 제외한 결과

--262 q1
select job,empno,ename,sal,deptno,dname 
from emp natural join dept 
where job = (select job from emp where ename='ALLEN');

--q2
select e.empno,e.ename,d.dname,e.hiredate,d.loc,e.sal,s.grade 
from emp e,dept d,salgrade s
where e.deptno = d.deptno 
and (e.sal between s.losal and s.hisal) 
and sal > (select avg(sal) from emp)
order by sal desc,e.empno;

select empno,ename,dname,hiredate,loc,sal,grade 
from emp natural join dept,salgrade 
where (sal between losal and hisal) 
and sal > (select avg(sal) from emp)
order by sal desc,empno;

--q3
select empno,ename,job,deptno,dname,loc 
from emp natural join dept
where deptno=10 and 
job not in (select job from emp where deptno = 30);

--q4 단일행 함수 사용 max(sal)
select e.empno,e.ename,e.sal,s.grade from emp e,salgrade s
where e.sal between s.losal and s.hisal
and sal > (select max(sal) from emp 
            where job in 'SALESMAN')
order by empno;

select empno,ename,sal,grade from emp,salgrade
where sal between losal and hisal
and sal > (select max(sal) from emp 
            where job in 'SALESMAN')
order by empno;

--다중행 함수 사용 all
select empno,ename,sal,grade from emp,salgrade
where sal between losal and hisal
and sal > all(select sal from emp 
            where job in 'SALESMAN')
order by empno;

--컴퓨터개론 과목을 수강하는 학생들의 학번,이름,과목이름
select stu.stu_no,stu.stu_name,sub.sub_name 
from student stu, subject sub, enrol en
where en.sub_no = sub.sub_no
and stu.stu_no = en.stu_no
and sub_name in '컴퓨터개론';

select a.empno, a.ename, 
b.empno as 상급자번호, b.ename as 상급자번호 
from emp1 a left outer join emp b on a.mgr=b.empno;
--          외부조인과                   셀프조인이 같이있는 형태

select a.ename,a.empno,
b.empno as 후임번호,b.ename as 후임이름
from emp1 a right outer join emp1 b on a.empno=b.mgr;

--컴퓨터정보 학과와 같은 반인 다른 학과의 학생 정보
select * from student where stu_dept not in '컴퓨터정보'
and stu_class in (select stu_class from student 
where stu_dept in '컴퓨터정보');

(select avg(stu_height) from student);--모든학과의 평균키 
select * from student where stu_height > 
(select avg(stu_height) from student);--평균키보다 큰 학생
select * from student where stu_height > all
(select avg(stu_height) from student group by stu_dept);
--(평균키보다 큰 학생들):부질의 중 제일 큰 학생 all사용
select * from student where stu_height > 
(select max(avg(stu_height)) from student group by stu_dept);
--(평균키보다 큰 학생들 중 제일 큰 학생):부질의 max사용

--컴퓨터과의 최소키와 비교해서 최소키가 더 큰 학과의 학과명과 최소키
select stu_dept,min(stu_height) 
from student group by stu_dept 
having min(stu_height) > 
(select min(stu_height) from student
where stu_dept in '컴퓨터정보');

--101번과목 수강한 학생 정보 검색
select * from student where stu_no in 
(select stu_no from enrol where sub_no=101);

create table a_enrol as select * from enrol 
where stu_no < 20150000; 
--enrol테이블의 2015학번보다 작은 값들만 복사

select * from a_enrol;

insert into a_enrol(sub_no,stu_no,enr_grade)
values (108,20151062,92);
insert into a_enrol values (108,20151062,92);
--순서대로면 인자의 이름을 생략 가능
delete from a_enrol where sub_no=108; 
--sub_no 가 108인 데이터 삭제
insert into a_enrol values(109,20152088,85);

insert into a_enrol(sub_no,stu_no) values (110,20152088);

insert into a_enrol values (111,20153075,null);

insert into a_enrol --테이블 복사생성이 아니라 추가 
select * from enrol where stu_no like '2015%';

-- 학생테이블로부터 학년이 1 또는 2학년인 조건들만 복사하여 student1 테이블을 생성한다.
create table student1 as select * 
from student where stu_grade in (1,2);
-- 과목테이블을 복사하여 subject1 테이블을 생성한다.
create table subject1 as select * from subject;
-- 수강테이블을 복사하여 enrol1 테이블을 생성한다.
create table enrol1 as select * from enrol;
-- 다 한 후 복사된 테이블의 내용을 확인한다.
select * from student1;
select * from subject1;
select * from enrol1;

--학번 20101059, 이름 조병준, 학과 컴퓨터정보, 학년 1, 반B, 키 164, 몸무게 70인남학생이 추가되었다.
insert into student1 values (20101059,'조병준','컴퓨터정보',1,'b','m',164,70);
--학번 20102038, 이름 남지선, 학과 전기전자, 학년 1, 반C, 여학생이 추가되었다.
insert into student1 values (20102038,'남지선','전기전자',1,'c','f',null,null);
--Student1 테이블에 학생 테이블의 3학년 학생들 데이터를 입력하라.
insert into student1 select * from student where stu_grade in 3;

select * from a_enrol;
update a_enrol set enr_grade = enr_grade+5;
-- enr_grade = enr_grade+5 로 수정
update a_enrol set enr_grade = enr_grade+5
where sub_no in 101;

update a_enrol set enr_grade = enr_grade+5
where sub_no = (select sub_no from subject
            where sub_name in '시스템분석설계');
-- 시스템분석설계 과목의 점수만 5씩 증가 (단일행)

--학번 20131001반을 B로 바꾸어라.
update student1 set  stu_class = 'b'
where stu_no in 20131001;
--20152088 학생의 키가 2cm자랐다.
update student1 set  stu_height = stu_height+2
where stu_no in 20152088;

rollback;
select * from student1;
select * from a_enrol;

delete from a_enrol where stu_no=20131001;

commit; --영구 반영

insert into enrol values (105,20153075,56); 
--기계요소설계 과목번호 삭제
delete from a_enrol where sub_no = 
(select sub_no from subject1 where sub_name in '기계요소설계');

drop table a_enrol; --ddl 정의어 rollback시 복구 안됨
delete from a_enrol; --dml 조작어
select *from a_enrol; --데이터 삭제 태이블 그대로

select *from student1;
select *from subject1;
select *from enrol1;

rollback;
commit;
--1
delete from student1 where stu_no in '20153088';
--2
insert into subject1 values(112,'자동화시스템','고종민',3,'기계');
--3
update subject1 set sub_no = 501 where sub_no in 110;
--4
delete from subject1 where sub_no in 101;
--5
update enrol1 set sub_no = 999 
where sub_no 
not in (select sub_no from subject1);
--6
update enrol1 set stu_no = 99999999
where stu_no not in (select stu_no from student1);
--7
delete from enrol1 where sub_no in 999; 
--8
delete from enrol1 where stu_no in 99999999;

select * from enrol1;

select * from b_student; 
delete from b_student; --dml
rollback;

create table c_student( -- create table : ddl 
stu_no number,  --자동적으로 delete가 커밋이됨 
stu_name char(10)); -- 위의 b_student rollback 불가
rollback;