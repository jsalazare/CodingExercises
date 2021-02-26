--https://leetcode.com/problems/nth-highest-salary/

CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    RETURN (
        select MAX(salary) from (SELECT ROW_NUMBER() OVER(ORDER BY salary desc) as rowNumber, salary from (select DISTINCT salary from Employee) as x) as y where rowNumber = @N

    );
END