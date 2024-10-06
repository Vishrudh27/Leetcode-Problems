-- Problem number: 1667
-- Problem name: Fix Names in a Table

SELECT user_id,  -- Select user_id column
       CONCAT(UPPER(LEFT(name,1)),  -- Capitalize the first letter of the name
              LOWER(SUBSTRING(name, 2))) AS name  -- Make the rest of the name lowercase
FROM Users  -- From the Users table
ORDER BY user_id;  -- Order the result by user_id
