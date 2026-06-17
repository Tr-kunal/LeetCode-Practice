# Write your MySQL query statement below
SELECT v.customer_id,
COUNT(v.visit_id) as count_no_trans
FROM Transactions t RIGHT JOIN Visits v
on t.visit_id = v.visit_id
where t.transaction_id is null
Group By v.customer_id;
