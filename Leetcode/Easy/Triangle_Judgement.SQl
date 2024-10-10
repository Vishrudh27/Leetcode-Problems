-- Problem Name: Triangle Judgement
-- Problem No: 610

SELECT 
    x, y, z,  -- Select the sides of the triangle
    CASE 
        WHEN x + y > z AND x + z > y AND y + z > x THEN 'Yes'  -- Check if the sides form a valid triangle
        ELSE 'No'  -- If not, return 'No'
    END AS triangle  -- Return 'Yes' or 'No' in the column named triangle
FROM 
    Triangle;  -- From the Triangle table
