/* Write your T-SQL query statement below */


SELECT c.name as Customers FROM customers c left join orders o on c.id = o.CustomerId where o.id is null