-- Last updated: 7/13/2026, 8:48:00 PM
# Write your MySQL query statement below
select teacher_id,count(Distinct subject_id) as cnt from Teacher group by teacher_id;