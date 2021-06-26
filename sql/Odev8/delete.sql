select * from employee

DELETE FROM employee
WHERE name LIKE 'Orv%';

DELETE FROM employee
WHERE id = 17;

DELETE FROM employee
WHERE email LIKE '%org';

DELETE FROM employee
WHERE birthday < '1920-01-01';

DELETE FROM employee
WHERE birthday > '2005-01-01';