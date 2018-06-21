-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)
INSERT INTO city (ID, name, countrycode, district, population) 
VALUES (100000, 'Smallville', 'USA', 'Kansas', 45001)


-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
INSERT INTO countrylanguage (countrycode, language, isOfficial, percentage)
VALUES ('USA', 'Kryptonese', false, .0001 )
-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.
UPDATE countrylanguage 
SET language = 'Krypto-babble'
WHERE language = 'Kryptonese' AND countrycode = 'USA'
-- 4. Set the US captial to Smallville, Kansas in the country table.
UPDATE country
SET capital = 100000
WHERE country.code = 'USA'
-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
DELETE FROM city
WHERE id = 100000;
no because city holds the foreign key for capital in country
-- 6. Return the US captial to Washington.
UPDATE country
SET capital = 3813
WHERE country.code = 'USA'
-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
DELETE FROM city
WHERE id = 100000
-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)
UPDATE countrylanguage
SET isofficial = NOT isofficial
WHERE countrylanguage.countrycode IN (SELECT country.code FROM country WHERE country.indepyear > 1800 AND country.indepyear < 1972)

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)
UPDATE city
SET population = population / 1000
-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 
-- meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)
UPDATE country
SET surfacearea = surfacearea * (2.59 * 10000000)
WHERE country.code IN (SELECT countrylanguage.countrycode FROM countrylanguage WHERE countrylanguage.percentage > 20 AND language = 'French')
