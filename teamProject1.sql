select count(*),num1 from copy_lotto_table
group by num1 order by count(*) desc;
-- 1번 자리에 숫자 n이 나온 횟수

select * from copy_lotto_table where DRAW_DATE > '2020-10-11'; 

SELECT lotto_num, SUM(CNT) AS CNT
  FROM ( SELECT num1 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
           where DRAW_DATE > '2020-10-11'
          GROUP BY num1
          UNION ALL
         SELECT num2 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
           where DRAW_DATE > '2020-10-11'
          GROUP BY num2
          UNION ALL
          SELECT num3 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
           where DRAW_DATE > '2020-10-11'
          GROUP BY num3
          UNION ALL
          SELECT num4 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
           where DRAW_DATE > '2020-10-11'
          GROUP BY num4
          UNION ALL
          SELECT num5 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
           where DRAW_DATE > '2020-10-11'
          GROUP BY num5
          UNION ALL
          SELECT num6 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
           where DRAW_DATE > '2020-10-11'
          GROUP BY num6 )
 GROUP BY lotto_num
 ORDER BY 2 DESC;
 
 SELECT lotto_num, SUM(CNT) AS CNT
  FROM ( SELECT num1 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
          GROUP BY num1
          UNION ALL
         SELECT num2 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
          GROUP BY num2
          UNION ALL
          SELECT num3 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
          GROUP BY num3
          UNION ALL
          SELECT num4 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
          GROUP BY num4
          UNION ALL
          SELECT num5 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
          GROUP BY num5
          UNION ALL
          SELECT num6 lotto_num, COUNT(*) CNT
           FROM copy_lotto_table
          GROUP BY num6 )
 GROUP BY lotto_num
 ORDER BY 2 DESC;



select m_id,m_pw from copy_member_signup;

desc copy_member_signup;
select * from copy_lotto_record;
select * from copy_lotto_table;



SELECT m_id FROM copy_member_signup 
WHERE m_id = 'admin123';
-- 아이디 체크
SELECT m_pw FROM copy_member_signup 
WHERE m_id = 'admin123' and m_pw='admin';
-- 아이디가 맞았을 때 비밀번호 체크