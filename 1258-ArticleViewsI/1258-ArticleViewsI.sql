-- Last updated: 7/13/2026, 8:50:09 PM
# Write your MySQL query statement below
select distinct author_id as id from views
where author_id=viewer_id 
order by id;