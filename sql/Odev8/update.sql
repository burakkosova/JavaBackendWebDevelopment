UPDATE employee 
SET name = 'Burak Kosova'
WHERE id = 1
RETURNING *;

UPDATE employee 
SET email = 'kathi@gaye.com'
WHERE name = 'Kathi Gaye'
RETURNING *;

UPDATE employee 
SET birthday = '1986-11-16'
WHERE birthday = '1924-03-07'
RETURNING *;

UPDATE employee 
SET birthday = '1996-03-21'
WHERE name LIKE 'Nara%'
RETURNING *;

UPDATE employee 
SET birthday = '1999-01-26'
WHERE id = 1
RETURNING *;