USE world;

SELECT * FROM country;

SELECT Name, Population FROM country ORDER BY Population DESC;

SELECT Name, Population FROM country WHERE Name = 'Mexico';

SELECT * FROM country WHERE Name = 'Mexico';

-- -------------------- ALIAS --------------------
SELECT Name AS Nombre_de_pais, Population AS 'Población del pais' FROM country ORDER BY Nombre_de_pais DESC;
SELECT *FROM country WHERE Continent != 'North America' ORDER BY LifeExpectancy DESC;

-- -------------------- BETWEEN --------------------
-- Se utiliza junto con WHERE
SELECT * FROM country WHERE Population BETWEEN 5000000 AND 7000000 ORDER BY Population DESC;
SELECT * FROM country WHERE Population NOT BETWEEN 5000000 AND 7000000 ORDER BY Population DESC;

-- -------------------- OR / AND/ != --------------------
SELECT * FROM country WHERE Continent = 'Asia' OR Continent = 'Europe';
SELECT * FROM country WHERE Continent != 'Asia' AND Continent != 'Europe' AND Continent != 'North America';

-- -------------------- OPERADOR IN --------------------
SELECT * FROM country WHERE Continent IN('Asia', 'Europe', 'North America'); -- Busca todas las filas donde aparezcan los elementos indicados
SELECT * FROM country WHERE Continent NOT IN('Asia', 'Europe', 'North America'); -- Busca todas las filas donde no aparezcan los elementos indicados

-- -------------------- FILTRAR VALORES NULL --------------------
SELECT * FROM country WHERE IndepYear IS NOT NULL;
SELECT * FROM country WHERE IndepYear IS NULL;

-- -------------------- LIKE --------------------
-- Sirve para buscar un patrón en específico
-- Con % busca cualquier cantidad de caracteres
-- '_' busca un caracter en específico

SELECT Name FROM country WHERE 
