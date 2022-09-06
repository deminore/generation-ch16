show databases;
/*CREATE DATABASE tienda;
USE tienda;
DROP DATABASE tienda; BORRA LA BASE DE DATOS */

CREATE DATABASE tienda;
USE tienda;

CREATE TABLE clientes (
	cliente_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	nombre CHAR(50) NOT NULL, 
	apellido CHAR(50) NOT NULL,
    telefono CHAR (50) NOT NULL,
    direccion VARCHAR(150) NOT NULL);

INSERT INTO clientes (nombre, apellido, telefono, direccion)
VALUE ('Pedro', 'Páramo', '555555577', 'Comala'), 
	  ('Raul', 'Sánchez', '555555577', 'Comala'),
      ('Victor', 'Fernández', '555555577', 'Comala'),
      ('Diana', 'Minor', '5617627547', 'Comala');

SELECT * FROM clientes;

DELETE FROM clientes WHERE nombre = 'Pedro';