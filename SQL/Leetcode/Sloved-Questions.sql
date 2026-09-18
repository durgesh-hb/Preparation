197. Rising Temperature

select w1.id
from Weather w1
join weather w2
 ON w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
-- Take today's date (w1.recordDate), subtract one day, and find that date in w2.
where w1.temperature > w2.temperature;

183. Customers Who Never Order

select c.name as Customers
from customers c
left join Orders o
on c.id = o.CustomerID
where o.id is null;

176. Second Highest Salary

# Write your MySQL query statement below
select max(salary) as SecondHighestSalary
from employee
where salary < (
    select max(salary)
    from employee
);

/*suppose  
salary
------
100
80
60

it becomes like this 
SELECT MAX(salary)
FROM employee
WHERE salary < 100;
*/


177. Nth Highest Salary

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

declare m int;
set m = n -1;
  RETURN (
      # Write your MySQL query statement below.
    select distinct salary 
    from employee
    order by salary desc
    limit 1
    offset m
  );
END

619 Biggest Single Number
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS x;

511 Game Play Analysis I
select player_id , min(event_date) as first_login
from activity
group by player_id;

577 
select e.name, b.bonus
from employee e
left join bonus b
on e.empid = b.empid
where b.bonus <= 1000 or b.bonus is null;

610
select x, y, z, 
IF(
    x + y > z 
    AND x + z > y 
    AND y + z > x, 
    'Yes',
    'No'
) as triangle
from triangle
