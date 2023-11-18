CREATE VIEW vw_agendamentos AS 
SELECT * FROM agendamentos;

CREATE VIEW vw_agendamentos_por_data AS 
SELECT * FROM agendamentos WHERE DATE(data_horario) = ?;

CREATE VIEW vw_clientes AS
SELECT * FROM clientes ORDER BY nome;

