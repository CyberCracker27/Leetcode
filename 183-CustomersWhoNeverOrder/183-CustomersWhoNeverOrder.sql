-- Last updated: 7/13/2026, 8:53:24 PM
# Write your MySQL query statement below
select name as Customers from Customers LEFT JOIN Orders on Customers.id=Orders.customerId
where Orders.customerId is NULL;