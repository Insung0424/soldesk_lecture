select * from emp1,dept1 
where emp1.deptno = dept1.deptno 
order by empno; 

CREATE TABLE EMP
(EMPNO NUMBER(4) NOT NULL,
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7, 2),
COMM NUMBER(7, 2),
DEPTNO NUMBER(2));
INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'81-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'81-05-01',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'81-05-09',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'81-04-01',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'81-09-10',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'81-02-11',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'81-08-21',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'81-12-11',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'81-02-23',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'81-12-11',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'80-12-09',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'82-12-22',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'83-01-15',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'82-01-11',1300,NULL,10);

select * from student,enrol 
where student.stu_no = enrol.stu_no;

select student.stu_no,
--join에서 사용한 데이터를 가져올 때는 위치를 확실히 지정해야함
stu_name,stu_dept,enr_grade 
from student,enrol 
where student.stu_no = enrol.stu_no;

select stu_no,stu_name,stu_dept,enr_grade
from student natural join enrol;

select empno,ename,job,mgr,hiredate,sal,comm,
deptno,dname,loc from emp natural join dept
order by deptno,empno;

select stu_no,stu_name,stu_dept,enr_grade
from student join enrol using(stu_no);
--공통된 부분을 using()의 안쪽에 작성하면 된다.2쌍 이상도 가능

select student.stu_no,stu_name,stu_dept,enr_grade
from student join enrol on student.stu_no=enrol.stu_no;
--기존where절에 작성하던 조건식을 on 뒤에 작성하는 방식

select * from student natural join enrol;

select sub_name,stu_no,enr_grade 
from subject natural join enrol;

select sub_name,stu_no,enr_grade from subject
join enrol using(sub_no);

--과목점수가 70이상인 학생의 이름 equi join
select stu_name,enr_grade from student,enrol 
where student.stu_no=enrol.stu_no and enr_grade>=70;

--과목점수가 60이상인 학생의 이름 join using
select stu_name,enr_grade from student 
join enrol using(stu_no) where enr_grade>=60;

--과목점수가 70이하인 학생의 이름 natural join
select stu_name,enr_grade from student natural join enrol
where enr_grade<=70;

--강종영 교수님의 수업을 듣는 학생의 이름 equi join
select stu_name from subject,student,enrol
where sub_prof='강종영' and 
subject.sub_no=enrol.sub_no and
enrol.stu_no=student.stu_no;

--컴퓨터개론 수강하는 학생의 학번, 이름 equi join
select student.stu_no,stu_name from subject,student,enrol
where sub_name='컴퓨터개론' and 
subject.sub_no=enrol.sub_no and
enrol.stu_no=student.stu_no;
--stu_no 가 중복되므로 명시해줘야 한다

--21. 사원이름을 15자리로 하고, 뒤에 ‘&’를채워 검색하라.
select rpad(ename,15,'&') from emp1; 
--22. 사원직무를 20자리로 하고, 앞에 ‘%’를채워 검색하라.
select lpad(job,20,'%') from emp1;
--23. 사원의 사원번호, 사원이름, 급여를 검색하라.(급여는두번째 자리에서 반올림함)
select empno,ename,round(sal,-2) from emp1;
--24. 사원의 사원번호, 사원이름, 급여를 검색하라.(급여는두번째 자리에서 절삭함)
select empno,ename,trunc(sal,-2) from emp1;
--25. 사원번호와급여를 100으로 나눈 나머지를 검색하라.
select empno,mod(sal/100) from emp1;
--26. 사원번호, 사원이름, 입사일, 입사후 100일의 날짜를 검색하라.
select empno,ename,hiredate,
hiredate+100 from emp1;
--27. 사원번호,  사원이름, 입사일, 근무 일자를 계산하여 검색하라.
select empno,ename,hiredate,trunc(sysdate - hiredate,0)
from emp1;
--28. 사원들의 입사일에서 3달째 되는 날짜를 검색하라.
select hiredate,add_months(hiredate,3) from emp1;
--29. 사원들의 입사일다음 토요일의 날짜를 검색하라.
select hiredate,next_day(hiredate,7) from emp1;
select hiredate,next_day(hiredate,'토') from emp1;
--30. 사원들의 입사월의마지막 날짜를 검색하라. 
select hiredate,last_day(hiredate) from emp1;
--31 부서별 평균 급여 
select deptno,avg(sal) from emp1 group by deptno;
--32 부서별 사원들 급여의 표준편차
select deptno,stddev(sal) from emp1 group by deptno;
--33 부서별 직무별 사원 급여의 합
select deptno,job,count(*),sum(sal) from emp1 group by deptno,job;
--34 부서별 직무별 평균급여
select deptno,job,count(*),avg(sal) from emp1 group by deptno,job;
--35 부서별 직무별 입사일의 max,min 
select deptno,job,max(hiredate),
min(hiredate) from emp1 group by deptno,job;

--36. 부서별 사원들의 인원수를 인원수가 많은 순으로 검색하라.
select deptno,count(*) from emp1 
group by deptno
order by count(*) desc;
--37. 부서별 사원들의평균  급여를 평균 급여 순으로 검색하라.
select deptno,avg(sal) from emp1
group by deptno 
order by avg(sal);
--38. 부서별, 사원직무별 사원의 급여 합을 많은 순으로 검색하라.
select deptno,job,count(*)as 해당부서같은직무인원,sum(sal) as 급여합계 from emp1 
group by deptno,job
order by 급여합계 desc;
--39. 부서별, 사원직무별 사원들의 평균 급여를 평균 급여가 많은 순으로 검색하라.
select deptno,job,avg(sal) from emp1
group by deptno,job
order by avg(sal) desc;
--40. 사원들의 입사일을 년을 기준으로 반올림하여 검색하라.
select round(hiredate,'year') from emp1;
--41. 사원들의 입사일을 년을 기준으로 절삭하여 검색하라.
select trunc(hiredate,'year') from emp1;
select ename, to_char(trunc(hiredate, 'y'), 'yyyy') 
from emp1 order by 2;
--42. 상급자사원번호(mgr)가 없는 사원의 경우 ‘상급자 없음’을 나타내도록 하는 질의문을 작성해라.
select nvl(to_char(mgr),'상급자없음')as 상급자유무 from emp1;
--43 수당과 급여의 합과 사번,이름 
select empno,ename,sal+nvl(comm,0) from emp1;
--44 수당을 포함한 연봉과 사번,이름
select empno,ename,
nvl(comm+sal*12,sal*12) as 포괄연봉제out from emp1;
--101번 과목을 수강하는 학생의 학번
select student.stu_no,stu_name from student,enrol
where student.stu_no = enrol.stu_no and
sub_no=101;

--101번 또는 102번 과목을 수강하는 학생의 학번
select student.stu_no,stu_name from student,enrol
where student.stu_no = enrol.stu_no and
sub_no = 101 or sub_no = 102;
-- and 연산자가 or연산자보다 우선순위가 높아서 결과가 잘못나온다
-- 괄호를 사용해서 출력하거나
-- sub_no in (101,102);는 정상출력
-- 추가조건이 여러개인 경우 이퀴조인의 다른 방식 사용
select stu_no,stu_name 
from student natural join enrol
where sub_no = 101 or sub_no = 102;
select stu_no,stu_name 
from student join enrol using(stu_no)
where sub_no = 101 or sub_no = 102;

select enr_grade,stu_name 
from student,enrol
where enr_grade between 80 and 90;

select * from emp1 natural join dept1;

--51. 사원 테이블과 부서 테이블을 natural join해라.
select * from emp1 natural join dept1; 
--52. 사원번호, 사원이름, 부서이름을 검색하라.(equi)
select empno,ename,dname from emp1,dept1
where emp1.deptno = dept1.deptno;
--53. 사원번호, 사원이름, 부서이름을 검색하라.(natural)
select empno,ename,dname from emp1 natural join dept1;
--54. 사원번호, 사원이름, 부서이름을 검색하라.(join~using)
select empno,ename,dname from emp1 join dept1 using(deptno);
--55. 지역이 NEW YORK인 사원이름을 검색하라.(equi)
select ename,loc from emp1,dept1 
where emp1.deptno = dept1.deptno and loc='NEW YORK';

--1. ADAMS사원이 근무 중인 부서이름과 지역을검색하라.(equi join)
select ename,dname,loc from dept1,emp1 
where dept1.deptno = emp1.deptno and ename='ADAMS';
--2. 급여가 2000이상인 사원들의 사원명과 지역을검색하라. (natural join)
select ename,loc,sal from emp1 natural join dept1
where sal>=2000;
--3. 2번을equi join으로 바꿔라.
select ename,loc,sal from emp1,dept1
where emp1.deptno = dept1.deptno and sal>=2000;
--4. 급여가 1000 이상 2000 이하인 사원들의 사원번호, 사원이름, 
--부서이름을 사원번호순으로 검색하라. (join using)
select empno,ename,dname,sal 
from emp1 join dept1 using (deptno)
where sal between 1000 and 2000
order by empno;
--5. 사원직무가 SALESMAN이면서 CHICAGO 지역에 근무 중인 
--사원명을 검색하라.
select ename,job,loc from emp1 natural join dept1
where job in('SALESMAN') and loc like 'C%';
--6. NEW YORK이나 DALLAS 지역에 근무하는 사원들의 사원번호와 
--사원이름을 사원번호 순으로 검색하라. (equi join)
select empno,ename,loc from emp1,dept1
where emp1.deptno = dept1.deptno and
loc in('NEW YORK','DALLAS')
order by empno;
--7. 부서이름이 ACCOUNTING이거나, 지역이 CHICAGO인 사원의 
--사원번호와 사원이름을 검색하라. (equi join)
select empno,ename,dname,loc from emp1,dept1
where emp1.deptno = dept1.deptno and
(dname = 'ACCOUNTING' or loc = 'CHICAGO');
--8. NEW YORK이나 DALLAS 지역에 근무하는 사원들의 사원번호와 
--사원이름을 사원번호 순으로 검색하라. (natural join)
select empno,ename,dname,loc 
from emp1 natural join dept1
where loc in('NEW YORK','DALLAS')
order by empno;

select e1.empno as 사원번호,e1.ename as 사원이름,
e2.empno as 상급자사원번호,e2.ename as 상급자이름
from emp1 e1,emp1 e2
where e1.mgr = e2.empno;

select a.*,sub_name from enrol a,subject b
where a.sub_no=b.sub_no order by 1;

--과목테이블도 다출력 (외부조인)
select a.*,sub_name from enrol a 
right outer join subject b
on a.sub_no = b.sub_no
order by 1; -- a 의 * 이 1번 필드이므로 enrol의 1번이 기준이됨

select a.*,sub_name from enrol a 
left outer join subject b
on a.sub_no = b.sub_no
order by 1; 
--null값이 안뜨는 이유:기준이 b가 되므로 모든 조건이 만족됨

--옥성우 보다 키가 큰 학생들의 학번 , 키 ,이름
select stu_no,stu_name,stu_height from student
where stu_height > 172;
select stu_no,stu_name,stu_height from student where stu_height 
> (select stu_height from student where stu_name = '옥성우');

--박희철이랑 같은 몸무게를 가지고 있는 학생의 모든 정보
select * from student where stu_weight = 
(select stu_weight from student where stu_name = '박희철')
--박희철이랑 같은 몸무게를 가지고 있는 학생
and stu_name<> '박희철';
--박희철은 제외

--키가 전체 학생들의 평균키보다 큰 학생
select * from student where stu_height > 
(select avg(stu_height) from student); 

select * from student where stu_class 
in(select stu_class from student where stu_dept='컴퓨터정보')
--컴퓨터정보에 속한 학생들의 반
and stu_dept<> '컴퓨터정보'; 
--컴퓨터정보과를 제외한

--9. BLAKE 사원보다 많은 급여를 받는 사원이름을검색하라. (부질의)
select ename,sal from emp1
where sal > (select sal from emp1 where ename='BLAKE');
--10. FORD 사원과 같은 부서에 근무하는 사원이름을 검색하라. (부질의)
select ename,deptno from emp1 where deptno = 
(select deptno from emp1 where ename in 'FORD')
and ename<>'FORD';

select empno,rpad(substr(ename,1,2),length(ename),'*')
from emp;


--239 q1 sql99before,after
select deptno,dname,empno,ename,sal 
from emp, dept
where emp.deptno = dept.deptno;

select deptno,dname,empno,ename,sal 
from emp natural join dept;

--q2 sql99before,after
select dept.deptno,dept.dname,avg(sal),max(sal),min(sal),count(*)
from emp,dept
where emp.deptno = dept.deptno
group by dept.deptno,dept.dname;

select deptno,dname,trunc(avg(sal)),max(sal),min(sal),count(*)
from emp natural join dept
group by deptno,dname;
--q3 sql99before,after
select dept.deptno,dept.dname,
emp.empno,emp.ename,emp.job,emp.sal from emp,dept
where emp.deptno=dept.deptno
order by emp.deptno,emp.ename;

select deptno,dname,
empno,ename,job,sal 
from emp join dept using(deptno)
order by deptno,ename;

--q4 sql99before,after
select d.deptno,d.dname,
e.empno,e.ename,e.mgr,e.sal,e.deptno,
s.losal,s.hisal,s.grade,
e1.empno as mgr_empno,e1.ename as mgr_ename 
from emp e,dept d,salgrade s,emp e1
where e.deptno(+) = d.deptno and
(e.sal between s.losal(+) and s.hisal(+))
and e.mgr = e1.empno(+)
order by e.deptno,e.empno; 

select d.deptno,d.dname,
e.empno,e.ename,e.mgr,e.sal,e.deptno,
s.losal,s.hisal,s.grade,
e1.empno as mgr_empno,e1.ename as mgr_ename 
from emp e right outer join dept d
on(e.deptno = d.deptno)
left outer join salgrade s
on(e.sal between s.losal and s.hisal)
left outer join emp e1
on(e.mgr = e1.empno)
order by e.deptno,e.empno;
