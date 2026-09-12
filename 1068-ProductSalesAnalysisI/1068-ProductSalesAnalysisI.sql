-- Last updated: 9/12/2026, 7:38:04 AM
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from Sales s
left join Product p
on s.product_id=p.product_id;