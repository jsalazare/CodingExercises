/* Write your T-SQL query statement below */


select MAX(salary) as SecondHighestSalary from Employee where salary < (select MAX(salary) from Employee )