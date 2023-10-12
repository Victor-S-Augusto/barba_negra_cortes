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

public class CrudAgenda {

  public void salvar(Agenda agenda) {

    String sql = "INSERT INTO agenda (data, servico, cliente_id) VALUES (?, ?, ?)";
    
    try {

      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);

      java.util.Date dataHorarioUtil = agenda.getDataHorario();
      java.sql.Date dataHorarioSql = new java.sql.Date(dataHorarioUtil.getTime());

      stmt.setDate(1, dataHorarioSql); 
      stmt.setString(2, agenda.getServico());
      stmt.setLong(3, agenda.getCliente().getId());

      stmt.executeUpdate();

      stmt.close();
      conn.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public List<Agenda> listar() {
    
    String sql = "SELECT a.*, c.nome AS cliente FROM agenda a JOIN clientes c ON a.cliente_id = c.id";
    List<Agenda> agendas = new ArrayList<>();

    try {
    Connection conn = ConexaoBanco.getConnection();
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        Agenda agenda = new Agenda();
        agenda.setId(rs.getInt("id"));
        agenda.setDataHorario(rs.getDate("data"));
        agenda.setServico(rs.getString("servico"));
        
        Cliente cliente = new Cliente();
        cliente.setNome(rs.getString("cliente"));
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
