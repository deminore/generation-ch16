USE sakila;

-- SUM(), AVG(), COUNT()

SELECT customer_id, amount FROM payment;

-- -------------------- COUNT() --------------------
-- Cuenta las filas de una tabla
SELECT COUNT(*) FROM payment;
SELECT COUNT(*) AS 'Cantidad de filas' FROM payment;

SELECT COUNT(*) AS 'Cantidad de paises' FROM world.country;

-- Cantidad de rentas que tuvo el trabajador 2
SELECT COUNT(*) FROM payment WHERE staff_id = 1;

-- Cantidad de clientes distintos
SELECT COUNT(DISTINCT customer_id) FROM payment;


-- -------------------- SUM() --------------------
SELECT SUM(amount) AS 'Total de rentas' FROM payment;
SELECT SUM(amount) AS 'Total de rentas' FROM payment WHERE staff_id = 2;

-- ----- ¿Qué cliente realizó más rentas? -----
SELECT customer_id, COUNT(*) FROM payment GROUP BY customer_id ORDER BY COUNT(*) DESC;


-- ORDER BY -> Ordena según la columna o función que indiquemos (DESC - ASC)
-- GROUP BY -> Agrupa pero pmite valores repetidos. 


-- ------------------------------------------------------------









