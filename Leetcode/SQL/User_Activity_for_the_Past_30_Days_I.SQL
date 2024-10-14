-- Problem No: 1141
-- Problem Name: User Activity for the Past 30 Days I

SELECT 
    activity_date AS day,  -- Select the activity date and alias it as 'day'
    COUNT(DISTINCT user_id) AS active_users  -- Count distinct user IDs for each day as 'active_users'
FROM 
    Activity  -- From the Activity table
WHERE 
    activity_date BETWEEN '2019-06-28' AND '2019-07-27'  -- Filter activity within the date range
GROUP BY 
    activity_date;  -- Group the result by activity date
