-- Last updated: 7/13/2026, 8:49:07 PM
# Write your MySQL query statement below
select tweet_id from tweets
where char_length(content)>15;