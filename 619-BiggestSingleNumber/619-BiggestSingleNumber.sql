-- Last updated: 8/3/2026, 9:31:48 AM
# Write your MySQL query statement below
select (select num from MyNumbers group by num having count(num)=1 order by num desc limit 1) as num;