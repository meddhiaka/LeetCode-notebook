# Write your MySQL query statement below
select sum(e.out_time - e.in_time) as total_time, emp_id, event_day as day from Employees e group by event_day, emp_id; 