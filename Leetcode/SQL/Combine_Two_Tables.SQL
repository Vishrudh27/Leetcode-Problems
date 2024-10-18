-- Problem No: 175
-- Problem Name: Combine Two Tables

SELECT 
    p.firstName,     -- Select the firstName from Person table
    p.lastName,      -- Select the lastName from Person table
    a.city,          -- Select the city from Address table
    a.state          -- Select the state from Address table
FROM 
    Person p         -- Alias for Person table
LEFT JOIN 
    Address a        -- Alias for Address table
ON 
    p.personId = a.personId;  -- Join condition on personId from both tables
