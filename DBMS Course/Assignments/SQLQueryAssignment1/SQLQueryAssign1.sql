 -- 1. Find out the PG-13 rated comedy movies. DO NOT use the film_list table.
 SELECT film_id, title, rating, name 
 FROM film f1 
 INNER JOIN category f2 
 ON f1.rating = 'PG-13' 
 AND f2.name = 'Comedy';
 
-- 2. Find out the top 3 rented horror movies.
SELECT film.title, COUNT(rental.rental_id) AS rental_count
FROM film
INNER JOIN inventory ON film.film_id = inventory.film_id
INNER JOIN rental ON inventory.inventory_id = rental.inventory_id
WHERE film.film_id IN (
	SELECT film_id
    FROM film_category
    WHERE category_id = (
		SELECT category_id
        FROM category
        WHERE name = "Horror"
    )
)
GROUP BY film.film_id
ORDER BY rental_count DESC
LIMIT 3;

-- 3. Find out the list of customers from India who have rented sports movies.
SELECT * FROM customer_list 
WHERE country = 'India' 
AND ID IN (SELECT r.customer_id 
FROM film_list fl, inventory i, rental r 
WHERE fl.category = 'Sports' AND fl.FID = i.film_id 
AND r.inventory_id = i.inventory_id ); 

-- 4. Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.
SELECT * FROM customer_list
WHERE country = 'Canada'
AND ID IN ( SELECT r.customer_id
	FROM actor a, film_actor fa, inventory i, rental r
    WHERE a.first_name = 'NICK' AND a.last_name = 'WAHLBERG' 
    AND a.actor_id = fa.actor_id
    AND fa.film_id = i.film_id
    AND i.inventory_id = r.inventory_id );
    
-- 5. Find out the number of movies in which “SEAN WILLIAMS” acted.
SELECT COUNT(DISTINCT film_actor.film_id) 
FROM actor, film_actor 
WHERE actor.first_name = 'SEAN' 
AND actor.last_name = 'WILLIAMS' 
AND film_actor.actor_id = actor.actor_id;
    