-- Problem No: 1527                     
-- Problem Name: Patients With a Condition


SELECT patient_id, patient_name, conditions  -- Selects patient ID, name, and their medical conditions
FROM Patients  -- From the Patients table
WHERE conditions LIKE 'DIAB1%'  -- Where conditions start with 'DIAB1'
   OR conditions LIKE '% DIAB1%';  -- Or conditions contain ' DIAB1' anywhere in the string
