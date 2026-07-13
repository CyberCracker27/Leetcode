-- Last updated: 7/13/2026, 8:53:30 PM
# Write your MySQL query statement below
select e2.name as Employee from Employee e1
join Employee e2
on e1.id=e2.managerId
where e2.salary>e1.salary;