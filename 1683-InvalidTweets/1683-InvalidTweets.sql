-- Last updated: 9/12/2026, 7:30:47 AM
# Write your MySQL query statement below
select tweet_id from tweets
where char_length(content)>15;