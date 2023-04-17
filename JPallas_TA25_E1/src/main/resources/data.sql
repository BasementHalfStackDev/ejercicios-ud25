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
	PRIMARY KEY(id),
	FOREIGN KEY (fabricante) REFERENCES fabricantes(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO fabricantes(nombre) VALUES ('CORSAIR');
INSERT INTO fabricantes(nombre) VALUES ('ASUS');
INSERT INTO fabricantes(nombre) VALUES ('GIGABYTE');
INSERT INTO fabricantes(nombre) VALUES ('MSI');
INSERT INTO fabricantes(nombre) VALUES ('SAPPHIRE');

INSERT INTO articulos(nombre, precio, fabricante) VALUES ('GPU', 600, 5);
INSERT INTO articulos(nombre, precio, fabricante) VALUES ('Monitor', 300, 4);
INSERT INTO articulos(nombre, precio, fabricante) VALUES ('Placa Base', 150, 3);
INSERT INTO articulos(nombre, precio, fabricante) VALUES ('Fuente Alimentacion', 120, 1);
INSERT INTO articulos(nombre, precio, fabricante) VALUES ('Auriculares', 88, 2);
