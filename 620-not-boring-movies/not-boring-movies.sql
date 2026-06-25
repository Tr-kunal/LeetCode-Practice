# Write your MySQL query statement below
SELECT *
FROM Cinema
where description !="boring" and MOD(id,2)=1
ORDER BY  rating DESC;