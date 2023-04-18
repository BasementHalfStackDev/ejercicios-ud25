DROP TABLE IF EXISTS cajas;
DROP TABLE IF EXISTS almacenes;

CREATE TABLE almacenes(
	id INT NOT NULL AUTO_INCREMENT,
	lugar VARCHAR(100) DEFAULT NULL,
	capacidad int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE cajas(
	ref_num VARCHAR(5) NOT NULL,
	contenido VARCHAR(100) DEFAULT NULL,
	valor int DEFAULT NULL,
	almacen int,
	PRIMARY KEY(ref_num),
	CONSTRAINT FK_almacen FOREIGN KEY (almacen) REFERENCES almacenes(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacenes(lugar, capacidad) VALUES ('Barcelona', 150);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Madrid', 500);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Tarragona', 50);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Santander', 100);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Badajoz', 75);

INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123AB', 'Libros', 300, 1);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123AD', 'Piedras', 50, 4);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123BC', 'Comida', 150, 5);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123CD', 'Materiales', 600, 2);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123XD', 'Memes', 20, 3);