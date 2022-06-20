select * from student; -- studnet 의 모든 정보
select * from subject;
select * from enrol;

select stu_name,stu_dept from student 
where stu_dept = '컴퓨터정보';  
--학생테이블에서 컴퓨터 정보 학과 학생의 이름,학과

select * from student
where stu_weight between 60 and 70; 
--학생테이블에서 몸무게가 60~70인 학생의 모든 정보

select stu_name from student
where stu_name like '김%';
--학생테이블에서 김씨성을 가진 학생의 이름

select enr_grade,enr_grade+10 from enrol;
--수식도 가능하며 별칭을 만들때는 as '별칭'이 아닌 as 별칭 이다 
             
select stu_name as name from student;
--학생테이블에서 학생의 이름을 name이라고 목록이름 명명후 출력

select stu_height from student 
where stu_height is null; -- 학생테이블에서 키가 null 인 학생

select stu_height from student 
where stu_height is not null; -- 위와 반대

select stu_height/100 as m from student;
--학생테이블에서 키를 100으로 나눈후 출력

select stu_no,stu_name,stu_dept from student
where stu_dept in('기계','컴퓨터정보');
--in() 지정된 열에서 원하는 정보만 추출 (OR 과 비슷)
--여러개 조건 값 중 하나만 만족하는 행 처리할 경우 사용


--16. 학생들의 학과, 학년 중복을 제거하고 검색하라.
select DISTINCT
stu_dept, stu_grade from student;

--17. 학생들의 학과, 반 중복을 제거하고 검색하라.
select DISTINCT stu_dept,stu_class from student;

--18. 학생들의 체중을 5만큼 증가시킨 값을 검색하라.
select stu_weight+5 as 몸무게플러스 from student;

--19. 학생들의 체중을 5만큼 감소시킨 값을 검색하라.
select stu_weight-5 from student;

--20. 학생들의 학번과 이름을 별칭 "학번", "이름"으로 부여하여 검색하라.
select stu_no as 학번 ,stu_name as 이름 from student;

--21. 수강(enrol)테이블의 모든 정보를 검색하라.
select * from enrol;

--22. 학생 테이블에서 학과명과 이름을 합쳐서 검색하라.(||)
select stu_dept || stu_name from student;

--23. 학생의 이름과 학과를 '컴퓨터정보과 옥한빛입니다'식으로 검색하라.
select stu_dept ||'과 ' || stu_name|| '입니다' 
from student;

--24. 컴퓨터정보 학생들을 검색하라.
select * from student 
where stu_dept = '컴퓨터정보';

--25. 기계과 학생들을 검색하라.
select * from student 
where stu_dept = '기계';
select stu_name from student where stu_dept in('기계');

select * from student where stu_dept not in'기계';--같은결과
select * from student where stu_dept<>'기계';
--기계과를 제외한 학생들의 모든 정보


--26. 전기전자과 학생들을 검색하라.
select * from student where stu_dept in'전기전자';

--27. 신장이 170이상인 학생들을 검색하라.
select stu_name,stu_height from student
where stu_height>=170;

--28. 체중이 65이상인 학생들을 검색하라.
select stu_name,stu_weight from student
where stu_weight>=65;

--29. 기계 학생들의 학번, 이름을 검색하라.
select stu_no,stu_name from student
where stu_dept in '기계';

--30. 컴퓨터정보 학생들의 학번, 이름을 검색하라.
select stu_no,stu_name from student
where stu_dept in '컴퓨터정보';

--31. 남학생의 이름을 검색하라.
select stu_name,stu_gender from student 
where stu_gender in 'm';

--32. 전기전자과 이외 학생들의 모든 정보를 검색하라.
select * from student where stu_dept<>'전기전자';

--33. 점수가 80점 이상인 학생들의 학번을 검색하라.
select stu_no,enr_grade from enrol where enr_grade>=80;

--34. '김인중'학생의 모든 정보를 검색하라.
select * from student where stu_name='김인중';

--35. '기계'과 이고 2학년인 학생들의 모든 정보를 검색하라. 
select * from student where stu_grade=2 and stu_dept in '기계';

--36. 성별이 여학생이며, 체중이 60이하인 학생을 모두 검색하라.
select * from student where stu_gender = 'f' 
and stu_weight<=60;

--37.'컴퓨터정보'외에 1학년 학생들의 이름을 검색하라.
select stu_name,stu_dept,stu_grade from student 
where stu_dept not in '컴퓨터정보' and stu_grade = 1;

--38. 학과 중 '기계'이외의 학과를 검색하라.
select * from subject where sub_dept not in '기계';

--39. 컴퓨터정보과 2학년 A반 학생의 이름을 검색하라.
select stu_name from student 
where stu_dept='컴퓨터정보' and stu_grade = 2 and stu_class in 'a';

--40. 신장이 160이상이며 170이하인 학생의 학번과 이름을 검색하라
select stu_no,stu_name,stu_height from student
where stu_height between 160 and 170;

select stu_no,stu_name from student order by stu_no; --오름
select stu_no,stu_name from student order by stu_no desc;
--내림차순 큰값이 먼저 출력됨

select stu_no,stu_name,stu_dept,stu_weight*1 as wei
from student order by wei;
--from student order by 4; 같은 결과 (열의 순서번호 이용가능)

select stu_no,stu_name,stu_dept,stu_weight*1 as wei
from student order by stu_dept,wei;
-- stu_dept 를 기준으로 정렬되며 그 안에서 wei로 다시정렬

select stu_no,stu_name,stu_dept,stu_weight*1 as wei
from student order by stu_dept, wei desc;
-- stu_dept 를 기준으로 정렬되며 그 안에서 wei로 다시내림차순정렬

select round(345.678,1)
from dual;--(dual) 이라는 테이블이 오라클에 존재하며 
--round함수(반올림)이다 (n, m) m:소숫점 나타날 위치

select round(345.678,-1)
from dual; -- 350이 나옴 1의 자리에서 반올림이 실행되기때문

select trunc(123.456,2) from dual;
-- 123.45 (n,m) n을 소숫점 m자리까지만 나오고 버림

select mod(10,4) from dual; -- 2 나머지 구하기

select upper('korea') from dual; -- 대문자로 변환

select initcap('korea') from dual; -- 첫글자만 대문자변환

select concat('ja','va') from dual; -- concat

select substr('java',2,3) from dual;
-- 2번째 글자부터 3글자를 반환
--select substr('something',n,m) from dual;
--something 의 n 번째 글자부터 m 글자길이 만큼 반환

select stu_no,stu_name,stu_dept from student
where stu_no like '___3%'; --2013학번의 학번,이름,학과

select * from student where stu_grade<>2;
select * from student where stu_grade not in 2;
-- 1,3학년의 모든정보 검색

select stu_no,stu_name from student
where stu_name like '김__';
-- 김씨 성을 가진 학생의 학번과 이름

select stu_name from student
where stu_name like '%옥%';
--이름에 옥자가 들어가는 학생

select stu_name,stu_height from student
where stu_height is null; --신장이 null 값인 학생

select stu_no,stu_name,stu_dept from student
where stu_dept not in '전기전자';
--학과가 컴퓨터 정보 or 기계가 아닌 학생

select stu_no,stu_name,stu_dept,stu_gender,stu_grade from student
where stu_gender = 'm' OR stu_grade = '1';
--성별이 남자이거나 1학년인 학생의 정보

select stu_no,stu_name from student
order by stu_no; --학생들의 학번과 이름을 학번 순으로 정렬

select stu_no,stu_name,stu_dept from student
order by stu_dept; --학생들의 학번,이름,학과를 학과 이름순정렬

select * from student
order by stu_dept desc,stu_grade;
--학생들의 정보를 학과내림차순 학년 오름차순 정렬

select sysdate from dual; -- 오늘날짜 반환
select next_day(sysdate,2) from dual;
-- 다음 월요일의 날짜 반환

select stu_name, length(stu_name) from student;
--학생이름의 길이 

select stu_dept,length(stu_dept) from student;
--학생들의 학과와 학과명의 길이

select stu_name,instr(stu_name,'김') from student;
--학생들의 이름에 김이 몇번째에 있는지 검색

select rpad(stu_name,15,'&') from student;
--학생의 이름을 15자리로 하고 오른쪽공간에 & 로 채우기
--이태연&&&&&&&&& 로 출력 한글은 2바이트이므로  & 9개 

select lpad(stu_name,20,'%') from student;
--%%%%%%%%%%%%%%이은결 lpad 왼쪽으로 채움


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

CREATE TABLE DEPT
       (DEPTNO NUMBER(2),
        DNAME VARCHAR2(14),
        LOC VARCHAR2(13) );

INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

CREATE TABLE SALGRADE
        (GRADE NUMBER,
         LOSAL NUMBER,
         HISAL NUMBER);

INSERT INTO SALGRADE VALUES (1,  700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

desc emp;
desc dept;
desc SALGRADE;

select * from emp;
select * from dept;
select * from SALGRADE;

select distinct deptno from emp;

--p73
desc emp; --emp테이블의 구조

--p74
desc dept; --dept 구조

--p75
desc salgrade; --salgrade 구조

--p80
select * from emp; --emp테이블의 모든 정보

--p81
select empno,ename,deptno from emp; 
--emp테이블의 empno,ename,deptno 정보

--p82
select distinct deptno from emp;
--emp테이블의 중복된 부서번호 제거

--p83
select distinct job,deptno from emp;
-- 중복된 직급제거,부서번호 
select all job,deptno from emp;
-- 중복제거 없이 직급과 부서번호

--p84
select ename,sal,sal*12+comm,comm from emp;
--이름과 급여,급여*12+추가수당,추가수당 

--p85
select ename,sal,sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm,comm
from emp;
--위의 84페이지의 결과와 같은 값 

--p86
select ename,sal,sal*12+comm as annsal,comm from emp;
-- 이름, 급여, 급여*12+수당 -> 별칭 annsal , 수당 

--p88
select * from emp order by sal;
--emp 테이블에서 모든 정보를 가져오며 sal(급여)로 오름차순정렬

--p89
select * from emp order by sal desc;
--emp 테이블에서 모든 정보를 가져오며 sal(급여)로 내림차순정렬

--p91
select * from emp order by deptno asc,sal desc;
--emp 테이블에서 모든 정보를 가져오며 우선 부서번호를 오름차순정렬하고
--그리고 나서 부서번호가 같을때 sal(급여)로 내림차순정렬한다

 
--p81
select empno,deptno from emp;

--p90
select * from emp
order by empno desc;

--p92 q2
select distinct job from emp;
--p92 q3-1
select * from emp;
--p92 q3-2
select empno as EMPLOYEE_NO,ename as EMPLOYEE_NAME,
mgr as MANAGER, sal as SALARY, comm as COMMISSION,
deptno as DEPARTMENT_NO from emp;
--p92 q3-3
select empno as EMPLOYEE_NO,ename as EMPLOYEE_NAME,
mgr as MANAGER, sal as SALARY, comm as COMMISSION,
deptno as DEPARTMENT_NO from emp order by 6 desc,2;

--p125 q1
select * from emp where ename like '%S';
--p125 q2
select empno,ename,job,sal,deptno from emp
where deptno=30 and job='SALESMAN';
--p125 q3 not use union 
select empno,ename,job,sal,deptno from emp
where deptno not in 10 and sal>2000;
-- use union

--p126 q4
select * from emp where sal<2000 or sal>3000;

--p126 q5 
select ename,empno,sal,deptno from emp
where deptno in 30 and ename like'%E%' and 
sal not between 1000 and 2000;

--p126 q6
select * from emp 
where comm is null -- 추가수당이 없고
and job in('MANAGER','CLERK') -- 직책은 'MANAGER','CLERK'이며
and mgr is not null -- 상급자가 있음
and ename not like '_L%'; --이름의 두번째 글자가 L이 아닌 사원 

select empno,ename,
to_char(hiredate,'yyyy-mm-dd') as 입사년월 from emp;

select to_char(to_number(1234.5678),'9999.999')
from dual;

select empno,ename,
to_char(to_number(sal),'$999')sal
from emp;

select empno,ename,hiredate from emp 
where hiredate=to_date('1981-12-11','yy-mm--dd');

select empno,ename,
empno+'500' -- 자동 형변환으로 인해서 덧셈이 이루어진다
from emp where ename = 'SCOTT';

select empno,to_char(to_number(empno+'100'))empno from emp;

select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') as 현재시간
from dual;

--p157 6-31
select empno,ename,empno+'500'
from emp where ename='SCOTT';
-- 6-32
select 'abcd' + empno,empno
from emp where ename='SCOTT';
--수치가 부적합합니다 'abcd'는 자동형변환할수없다

--p159 6-33
select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') as 현재날짜시간
from dual;

-- 6-34
select sysdate,
to_char(sysdate, 'MM')as MM,
to_char(sysdate, 'MON')as MON,
to_char(sysdate, 'MONTH')as MONTH,
to_char(sysdate, 'DD')as DD,
to_char(sysdate, 'DY')as DY,
to_char(sysdate, 'DAY')as DAY
from dual;

--p160 6-35
select sysdate,
to_char(sysdate, 'MM') as MM,
to_char(sysdate, 'MON', 'nls_date_language = korean')as MON_KOR,
to_char(sysdate, 'MON', 'nls_date_language = japanese')as MON_JPN,
to_char(sysdate, 'MON', 'nls_date_language = english')as MON_ENG,
to_char(sysdate, 'MONTH', 'nls_date_language = korean')as MONTH_KOR,
to_char(sysdate, 'MONTH', 'nls_date_language = japanese')as MONTH_JPN,
to_char(sysdate, 'MONTH', 'nls_date_language = english')as MONTH_ENG
from dual;

-- 6-36
select sysdate,
to_char(sysdate, 'MM') as MM,
to_char(sysdate, 'DD') as DD,
to_char(sysdate, 'DY', 'nls_date_language = korean')as DY_KOR,
to_char(sysdate, 'DY', 'nls_date_language = japanese')as DY_JPN,
to_char(sysdate, 'DY', 'nls_date_language = english')as DY_ENG,
to_char(sysdate, 'DAY', 'nls_date_language = korean')as DAY_KOR,
to_char(sysdate, 'DAY', 'nls_date_language = japanese')as DAY_JPN,
to_char(sysdate, 'DAY', 'nls_date_language = english')as DAY_ENG
from dual;

-- p161 6-37
select sysdate,
to_char(sysdate, 'HH24:MI:SS') as HH24MISS,
to_char(sysdate, 'HH12:MI:SS AM') as HHMISS_AM,
to_char(sysdate, 'HH:MI:SS PM') as HHMISS_PM
from dual;

--p162 6-38
select sal, 
to_char(sal, '$999,999') as sal_$,
to_char(sal, 'L999,999') as sal_L,
to_char(sal, '999,999.00') as sal_1,
to_char(sal, '000,999,999.00') as sal_2,
to_char(sal, '000999999.99') as sal_3,
to_char(sal, '999,999,00') as sal_4 
from emp;

--p163 6-39
select 1300 - '1500','1300' + 1500
from dual;

-- 6-40
select '1,300' - '1,500' from dual; --수치가 부적합합니다

--p164 6-41
select to_number('1,300','999,999')
- to_number('1,500','999,999') from dual;

-- 6-42
select to_date('2018-07-14', 'YYYY-MM-DD')as TODATE1,
to_date('20180714', 'YYYY-MM-DD')as TODATE2
from dual;

--p165 6-43
select * from emp
where hiredate > to_date('1981/06/01','YYYY/MM/DD');

-- 6-44
select to_date('49/12/10', 'YY/MM/DD')as YY_YEAR_49,
to_date('49/12/10', 'RR/MM/DD')as RR_YEAR_49,
to_date('50/12/10', 'YY/MM/DD')as YY_YEAR_50,
to_date('50/12/10', 'RR/MM/DD')as RR_YEAR_50,
to_date('51/12/10', 'YY/MM/DD')as YY_YEAR_51,
to_date('51/12/10', 'RR/MM/DD')as RR_YEAR_51
from dual;

