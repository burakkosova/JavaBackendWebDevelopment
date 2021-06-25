SELECT country FROM country WHERE country ~~ 'A%a';

SELECT country FROM country WHERE country ~~ '%_____n';

SELECT title from film WHERE title ILIKE '%T%T%T%T%'

SELECT * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99 