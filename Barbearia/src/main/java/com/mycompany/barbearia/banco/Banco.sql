
/**
 * Author:  alexandre
 */
CREATE DATABASE barbearia;

CREATE TABLE agenda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dataHorario DATETIME,
    nome varchar(50),
    telefone varchar(11),
    servico varchar(15)
);
