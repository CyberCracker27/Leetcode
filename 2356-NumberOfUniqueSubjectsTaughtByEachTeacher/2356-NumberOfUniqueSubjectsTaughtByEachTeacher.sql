-- Last updated: 9/12/2026, 7:24:23 AM
# Write your MySQL query statement below
select teacher_id,count(Distinct subject_id) as cnt from Teacher group by teacher_id;