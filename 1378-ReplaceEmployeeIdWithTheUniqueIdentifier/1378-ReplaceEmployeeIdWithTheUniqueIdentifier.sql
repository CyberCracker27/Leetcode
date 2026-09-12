-- Last updated: 9/12/2026, 7:35:26 AM
# Write your MySQL query statement below
select euni.unique_id,e.name from Employees e
left join EmployeeUNI euni
on e.id=euni.id;