# Write your MySQL query statement below
SELECT
name
FROM
Customer
WHERE
referee_id != 2 OR referee_id is NULL 
# sql do not retuen null vlaues by default so if we wnt it so we need to mention it explicitely