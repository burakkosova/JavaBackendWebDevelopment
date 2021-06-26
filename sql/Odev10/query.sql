SELECT country.country, city.city 
FROM city LEFT JOIN country 
ON country.country_id = city.country_id;

SELECT payment.payment_id, customer.first_name, customer.last_name 
FROM payment RIGHT JOIN customer 
ON customer.customer_id = payment.customer_id
where payment_id is null;

SELECT rental.rental_id, customer.first_name, customer.last_name
FROM customer FULL OUTER JOIN rental 
ON rental.customer_id = customer.customer_id;
