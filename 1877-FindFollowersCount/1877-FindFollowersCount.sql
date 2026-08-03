-- Last updated: 8/3/2026, 9:28:11 AM
# Write your MySQL query statement below
select user_id,count(follower_id) as followers_count
from Followers group by user_id order by user_id ASC;