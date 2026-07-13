-- Last updated: 7/13/2026, 8:53:31 PM
# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary
from Employee
where salary<(select MAX(salary) from Employee);