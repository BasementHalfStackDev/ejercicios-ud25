DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE articulos(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100),
	precio INT,
	fabricante int,
	FOREIGN KEY (fabricante) REFERENCES fabricantes(id),
	PRIMARY KEY(id)
);

INSERT INTO fabricantes (nombre) VALUES ("MSI");
INSERT INTO fabricantes (nombre) VALUES ("ASUS");
INSERT INTO fabricantes (nombre) VALUES ("GIGABYTE");
INSERT INTO fabricantes (nombre) VALUES ("MSI");
INSERT INTO fabricantes (nombre) VALUES ("SAPPHIRE");

INSERT INTO articulos (nombre, precio, fabricante) VALUES ("GPU", 600, 5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ("GPU", 600, 5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ("GPU", 600, 5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ("GPU", 600, 5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ("GPU", 600, 5);
