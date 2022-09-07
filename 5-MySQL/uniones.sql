USE tienda;

-- ------------------------------ INNER JOIN ------------------------------
-- ---------- UNIÓN EXPLÍCITA ----------
SELECT * FROM clientes INNER JOIN compra ON clientes.cliente_id = compra.cliente_id;
SELECT clientes.cliente_id, clientes.nombre, compra. * FROM clientes INNER JOIN compra On clientes.cliente_id = compra.cliente_id;
SELECT clientes.cliente_id AS 'Número de Cliente', clientes.nombre AS Nombre, compra. * FROM clientes INNER JOIN compra On clientes.cliente_id = compra.cliente_id;

-- ---------- UNIÓN IMPLÍCITA ----------
SELECT * FROM clientes, compra WHERE clientes.cliente_id = compra.cliente_id;


-- ------------------------------ LEFT JOIN ------------------------------
SELECT * FROM clientes LEFT JOIN compra ON clientes.cliente_id = compra.cliente_id;


-- ------------------------------ RIGHT JOIN ------------------------------
SELECT * FROM clientes RIGHT JOIN compra ON clientes.cliente_id = compra.cliente_id;


-- ---------- MOSTRAR DIRECCIONES DE CADA PAÍS ----------
USE sakila;

/* 
address - city_id / address
city    - city_id / city / country_id
country - country_id / country
*/

SELECT address.address, city.city, city.country_id FROM address INNER JOIN city ON address.city_id = city.city_id;

-- ---------- Union entre 3 tablas ----------
SELECT country.country AS Pais, city.city AS Ciudad, address.address AS Dirección FROM country 
	INNER JOIN city ON country.country_id = city.country_id
	INNER JOIN address ON address.city_id = city.city_id;
