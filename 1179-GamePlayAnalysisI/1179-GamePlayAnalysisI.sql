-- Last updated: 7/13/2026, 8:50:38 PM
# Write your MySQL query statement below
select distinct player_id,MIN(event_date) over(partition by player_id) as first_login
from Activity;