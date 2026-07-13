-- Last updated: 7/13/2026, 8:51:45 PM
# Write your MySQL query statement below
select class from Courses group by class 
having count(student)>=5;