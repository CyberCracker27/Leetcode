-- Last updated: 7/13/2026, 8:51:52 PM
# Write your MySQL query statement below
select e.name from Employee as e
Inner join Employee as m where e.id=m.managerId
group by m.managerId having count(*)>=5;