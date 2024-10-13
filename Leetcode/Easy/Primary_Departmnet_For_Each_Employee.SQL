-- Problem No: 1789
-- Problem Name: Primary Department for Each Employee

SELECT 
    employee_id, department_id  -- Select employee ID and department ID
FROM 
    Employee  -- From the Employee table
WHERE 
    primary_flag = 'Y'  -- Where the primary flag is 'Y'
    OR employee_id IN  -- Or employee ID is in the subquery result
    (
        SELECT 
            employee_id  -- Select employee ID
        FROM 
            Employee 
        GROUP BY 
            employee_id  -- Group by employee ID
        HAVING 
            COUNT(*) = 1  -- Keep only employees that occur once
    );
