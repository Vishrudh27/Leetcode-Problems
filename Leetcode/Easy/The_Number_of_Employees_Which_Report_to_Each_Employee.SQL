-- Problem No: 1731
-- Problem Name: The Number of Employees Which Report to Each Employee


SELECT 
    e.employee_id,             -- Select the manager's employee ID
    e.name,                    -- Select the manager's name
    COUNT(r.employee_id) AS reports_count,     -- Count the number of employees reporting to this manager
    ROUND(AVG(r.age)) AS average_age           -- Calculate the average age of those employees, rounded to nearest integer
FROM 
    Employees e               -- 'e' is the manager table
JOIN 
    Employees r               -- 'r' is the reports table
ON 
    e.employee_id = r.reports_to   -- Join employees who report to the manager
GROUP BY 
    e.employee_id, e.name         -- Group by manager's ID and name
HAVING 
    COUNT(r.employee_id) > 0      -- Ensure that the manager has at least one report
ORDER BY 
    e.employee_id;               -- Sort the results by the manager's employee ID

