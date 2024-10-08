-- Problem Name: Find Users With Valid E-Mails
-- Problem No: 1517

SELECT user_id, name, mail  -- Selecting user ID, name, and email
FROM Users  -- From the Users table
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$';  -- Filtering emails that:
-- 1. Start with a letter (a-z or A-Z)
-- 2. May contain letters, digits, underscore, period, or dash after the initial letter
-- 3. End with the domain '@leetcode.com'
