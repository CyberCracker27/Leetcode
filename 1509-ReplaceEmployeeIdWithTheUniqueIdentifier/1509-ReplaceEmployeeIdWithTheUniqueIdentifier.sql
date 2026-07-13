-- Last updated: 7/13/2026, 8:49:44 PM
# Write your MySQL query statement below
select euni.unique_id,e.name from Employees e
left join EmployeeUNI euni
on e.id=euni.id;