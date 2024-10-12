-- Problem No: 176
-- Problem Name: Second Highest Salary

SELECT 
    (SELECT DISTINCT salary  -- Select distinct salaries from the Employee table
     FROM Employee 
     ORDER BY salary DESC  -- Order the salaries in descending order
     LIMIT 1 OFFSET 1) AS SecondHighestSalary;  -- Skip the highest salary (offset by 1) and limit the result to the second-highest
