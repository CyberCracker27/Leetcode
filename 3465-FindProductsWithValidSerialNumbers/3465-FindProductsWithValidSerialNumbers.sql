-- Last updated: 9/12/2026, 7:19:58 AM
# Write your MySQL query statement below
SELECT * 
FROM products
WHERE REGEXP_LIKE(description,'\\bSN[0-9]{4}-[0-9]{4}\\b','c')
order by product_id;