SELECT country.country, city.city 
FROM country INNER JOIN city 
ON country.country_id = city.country_id;

SELECT payment.payment_id, customer.first_name, customer.last_name
FROM customer INNER JOIN payment 
ON payment.customer_id = customer.customer_id;

SELECT rental.rental_id, customer.first_name, customer.last_name
FROM customer INNER JOIN rental 
ON rental.customer_id = customer.customer_id;
