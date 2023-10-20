package br.edu.ifgoiano.barbearia.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifgoiano.barbearia.modelo.dto.Agendamento;
import br.edu.ifgoiano.barbearia.modelo.dto.Cliente;
import br.edu.ifgoiano.barbearia.modelo.dto.enumeracoes.Servico;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.util.Date;

public class AgendamentoDAO extends DAO {

    public void salvar(Agendamento a) throws Exception {
        Connection conn = getConnection();
        
        String sql = "INSERT INTO agendamentos (data_horario, cliente, servico) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        LocalDateTime dataHorarioUtil = a.getDataHorario();
        java.sql.Date dataHorarioSql = java.sql.Date.valueOf(dataHorarioUtil.toLocalDate());

        Timestamp timestamp = Timestamp.valueOf(dataHorarioUtil);

        stmt.setTimestamp(1, timestamp);
        stmt.setInt(2, a.getCliente().getId());
        stmt.setInt(3, a.getServico().getId());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }

    public List<Agendamento> listar() throws Exception {
        List<Agendamento> agendas = new ArrayList<>();

        Connection conn = getConnection();
        
        String sql = "SELECT * FROM agendamentos";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        ClienteDAO cDAO = new ClienteDAO();

        while (rs.next()) {
            Agendamento agenda = new Agendamento();
            agenda.setId(rs.getInt("id"));
            Timestamp timestamp = rs.getTimestamp("data_horario");
            agenda.setDataHorario(timestamp.toLocalDateTime());
            agenda.setServico(Servico.get(rs.getInt("servico")));

            Cliente c = cDAO.selecionar(rs.getInt("cliente"));
            agenda.setCliente(c);

            agendas.add(agenda);
        }

        stmt.close();
        conn.close();

        return agendas;
    }
    
    public List<Agendamento> listar(Date data) throws Exception {
        List<Agendamento> agendas = new ArrayList<>();

        Connection conn = getConnection();
        
        String sql = "SELECT * FROM barbearia.agendamentos as a where date(data_horario) = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        stmt.setDate(1, new java.sql.Date(data.getTime()));
        
        ResultSet rs = stmt.executeQuery();
        
        ClienteDAO cDAO = new ClienteDAO();

        while (rs.next()) {
            Agendamento agenda = new Agendamento();
            agenda.setId(rs.getInt("id"));
            Timestamp timestamp = rs.getTimestamp("data_horario");
            agenda.setDataHorario(timestamp.toLocalDateTime());
            agenda.setServico(Servico.get(rs.getInt("servico")));

            Cliente c = cDAO.selecionar(rs.getInt("cliente"));
            agenda.setCliente(c);

            agendas.add(agenda);
        }

        stmt.close();
        conn.close();

        return agendas;
    }
}
