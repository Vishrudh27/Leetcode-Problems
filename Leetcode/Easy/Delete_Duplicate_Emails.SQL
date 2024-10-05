-- Problem number: 196
-- Problem name: Delete Duplicate Emails
-- Deletes rows with duplicate emails, keeping the one with the smallest 'id'.

DELETE p1                 -- Deletes the duplicate row from alias 'p1'
FROM Person p1            -- Alias 'p1' for the first instance of the 'Person' table
JOIN Person p2            -- Alias 'p2' for the second instance (self-join)
ON p1.email = p2.email    -- Matches records with the same email
AND p1.id > p2.id;        -- Deletes the row with the larger 'id'
