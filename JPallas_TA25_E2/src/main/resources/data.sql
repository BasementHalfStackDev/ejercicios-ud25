DROP TABLE IF EXISTS empleados;
DROP TABLE IF EXISTS departamentos;

CREATE TABLE departamentos(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	presupuesto int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE empleados(
	dni VARCHAR(9) NOT NULL,
	nombre VARCHAR(100),
	apellidos VARCHAR(255)
	departamento INT,
	PRIMARY KEY(dni),
	CONSTRAINT FK_departamento FOREIGN KEY (departamento) REFERENCES departamentos(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO departamentos(nombre, presupuesto) VALUES ('CORSAIR', 10000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('ASUS', 30000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('GIGABYTE', 5000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('MSI', 50000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('SAPPHIRE', 8000);

INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('77777777A', 'Josep', 'Pallas Batalla', 1);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('11177777b', 'Marta', 'Cyrn', 2);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('77733777C', 'Sergi', 'Jimenez', 3);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('77987777D', 'Albert', 'Pairet', 1);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('77978777E', 'Rosa', 'Fernandez', 4);