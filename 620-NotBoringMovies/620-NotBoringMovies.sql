-- Last updated: 7/13/2026, 8:51:40 PM
# Write your MySQL query statement below
select id,movie,description,rating from Cinema where id%2=1 and description!="boring" order by rating desc;