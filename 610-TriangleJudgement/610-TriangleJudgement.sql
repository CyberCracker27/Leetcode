-- Last updated: 7/13/2026, 8:51:41 PM
# Write your MySQL query statement below
select *,if(x+y>z and y+z>x and x+z>y,"Yes","No") as triangle from triangle;