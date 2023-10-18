/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.barbearia.entidades.Agenda; 
import com.mycompany.barbearia.banco.ConexaoBanco;
import com.mycompany.barbearia.entidades.Cliente;
import java.time.LocalDateTime;
import java.sql.Timestamp;

public class CrudAgenda {

  public void salvar(Agenda agenda) {

    String sql = "INSERT INTO agenda (dataHorario, nome, telefone, servico) VALUES (?, ?, ?, ?)";
    
    try {

      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);

      LocalDateTime dataHorarioUtil = agenda.getDataHorario();
      java.sql.Date dataHorarioSql = java.sql.Date.valueOf(dataHorarioUtil.toLocalDate());
      
      Timestamp timestamp = Timestamp.valueOf(dataHorarioUtil);

      stmt.setTimestamp(1, timestamp);
      stmt.setString(2, agenda.getCliente().getNome());
      stmt.setString(3, agenda.getCliente().getTelefone());
      stmt.setString(4, agenda.getServico());


      stmt.executeUpdate();

      stmt.close();
      conn.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public List<Agenda> listar() {
    
    String sql = "SELECT id, servico, dataHorario, nome, telefone FROM agenda";
    List<Agenda> agendas = new ArrayList<>();

    try {
    Connection conn = ConexaoBanco.getConnection();
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        Agenda agenda = new Agenda();
        agenda.setId(rs.getInt("id"));
        Timestamp timestamp = rs.getTimestamp("dataHorario");
        agenda.setDataHorario(timestamp.toLocalDateTime());
        agenda.setServico(rs.getString("servico"));
        
        
        Cliente cliente = new Cliente();
        cliente.setNome(rs.getString("nome"));
        cliente.setTelefone(rs.getString("telefone"));
        agenda.setCliente(cliente);
        
        agendas.add(agenda);
    }

    stmt.close();
    conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return agendas;
  }
}
