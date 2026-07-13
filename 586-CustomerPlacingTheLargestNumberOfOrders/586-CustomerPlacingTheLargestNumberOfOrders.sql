-- Last updated: 7/13/2026, 8:51:49 PM
# Write your MySQL query statement below
select customer_number from Orders group by customer_number order by count(*) desc LIMIT 1;