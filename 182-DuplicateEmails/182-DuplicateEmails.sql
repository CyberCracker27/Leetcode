-- Last updated: 8/3/2026, 9:34:13 AM
# Write your MySQL query statement below
select email from Person group by email having count(email)>1;