-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**
-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (actor_id, first_name, last_name)
VALUES (10000, 'Hampton', 'Avenue')

INSERT INTO actor (actor_id, first_name, last_name)
VALUES (10001, 'Lisa', 'Byway')
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
INSERT INTO film VALUES (10000, 'Euclidian PI', 'The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece', 2008, 1, null, 5.00, .05, 198, 200, 'NC-17')

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id, film_id)
VALUES (10001, 10000)

INSERT INTO film_actor (actor_id, film_id)
VALUES (10000, 10000)
-- 4. Add Mathmagical to the category table.
INSERT INTO category VALUES (10000, 'Mathmagical')


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category VALUES (10000  , 10000)
INSERT INTO film_category VALUES (274  , 10000)
INSERT INTO film_category VALUES (494  , 10000)
INSERT INTO film_category VALUES (714  , 10000)
INSERT INTO film_category VALUES (996  , 10000)


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film.film_id IN (SELECT film.film_id FROM film_category WHERE film_category.category_id = 10000)

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory VALUES (4582, 10000, 1)
INSERT INTO inventory VALUES (4583, 10000, 2)

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film 
WHERE title = 'Euclidian PI'
--can't delete becasue it violates the foreign key constraint in film_actor table

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category 
WHERE category_id = 10000
--can't delete becasue it violates the foreign key constraint in film_category table

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category
WHERE category_id = 10000
--it worked because there were no contrainsts placed on that table as those being foreign
--for other tables

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

DELETE FROM category 
WHERE category_id = 10000
--yes because mathmagical is no longer linked to the category_film table as a foreign key

DELETE FROM film 
WHERE title = 'Euclidian PI'
--no because Euclidian PI is still linked to the foreign key film_actor