-- Last updated: 7/13/2026, 8:53:18 PM
# Write your MySQL query statement below
delete p1 from Person p1,Person p2
where p1.email=p2.email and p1.id>p2.id;