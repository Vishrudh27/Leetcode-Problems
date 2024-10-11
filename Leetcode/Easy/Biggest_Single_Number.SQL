-- Problem No: 619
-- Problem Name: Biggest Single Number

SELECT 
    MAX(num) AS num  -- Select the maximum value from the subquery result and alias it as 'num'
FROM (
    SELECT num  -- Select distinct numbers from MyNumbers
    FROM MyNumbers 
    GROUP BY num  -- Group by each number to count their occurrences
    HAVING COUNT(num) = 1  -- Filter out numbers that occur more than once (keep only those that occur once)
) AS SingleNumbers;  -- Alias the subquery as 'SingleNumbers' for clarity
