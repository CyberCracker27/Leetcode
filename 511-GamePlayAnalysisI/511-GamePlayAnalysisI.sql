-- Last updated: 9/12/2026, 7:37:58 AM
# Write your MySQL query statement below
select distinct player_id,MIN(event_date) over(partition by player_id) as first_login
from Activity;