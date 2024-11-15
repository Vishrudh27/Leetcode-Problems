-- Problem number: 1581 (Customer Who Visited but Did Not Make Any Transactions)
-- This query selects customers who visited but did not make any transactions
-- It uses a LEFT JOIN between the Visits and Transactions tables and checks for NULL transaction IDs, 
-- indicating that the visit did not result in a transaction.
-- The result shows the customer ID and the count of such visits per customer.

SELECT V.customer_id, COUNT(V.visit_id) AS count_no_trans
FROM Visits V
LEFT JOIN Transactions T ON V.visit_id = T.visit_id
WHERE T.visit_id IS NULL
GROUP BY V.customer_id;
