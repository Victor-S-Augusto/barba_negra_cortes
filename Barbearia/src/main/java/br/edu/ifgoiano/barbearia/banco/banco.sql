
/**
 * Author:  alexandre
 */
CREATE DATABASE barbearia;

use barbearia;

create table clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50),
    telefone varchar(11)
);

CREATE TABLE agendamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_horario DATETIME,
    cliente int,
    servico int,
    foreign key (cliente) references clientes(id)
);
