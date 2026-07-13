-- Last updated: 7/13/2026, 8:53:33 PM
# Write your MySQL query statement below
select p.firstname,p.lastname,a.city,a.state from Person p
left join Address a on p.personId=a.personId; 