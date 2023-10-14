
/**
 * Author:  alexandre
 */
CREATE DATABASE barbearia;

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50),
    telefone varchar(11),
);

CREATE TABLE agenda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    servico varchar(15),
    dataHorario DATETIME,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);
