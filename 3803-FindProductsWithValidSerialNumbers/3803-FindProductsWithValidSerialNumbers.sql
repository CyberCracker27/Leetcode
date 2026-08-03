-- Last updated: 8/3/2026, 9:24:31 AM
# Write your MySQL query statement below
SELECT * 
FROM products
WHERE REGEXP_LIKE(description,'\\bSN[0-9]{4}-[0-9]{4}\\b','c')
order by product_id;