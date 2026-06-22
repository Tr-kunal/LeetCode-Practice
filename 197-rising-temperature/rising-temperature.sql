# Write your MySQL query statement below
select t.id
from Weather t
join Weather y
where DATEDIFF(t.recordDate,y.recordDate)=1 AND t.temperature>y.temperature;