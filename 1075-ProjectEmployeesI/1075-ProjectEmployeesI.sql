-- Last updated: 9/12/2026, 7:38:02 AM
# Write your MySQL query statement belowselect 
select p.project_id ,round(avg(e.experience_years),2) as average_years from Project p
left join Employee e
on p.employee_id=e.employee_id
group by p.project_id;