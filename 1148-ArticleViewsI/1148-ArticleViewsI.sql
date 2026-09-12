-- Last updated: 9/12/2026, 7:37:25 AM
# Write your MySQL query statement below
select distinct author_id as id from views
where author_id=viewer_id 
order by id;