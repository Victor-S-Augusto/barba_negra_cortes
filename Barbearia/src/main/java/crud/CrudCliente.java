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

import com.mycompany.barbearia.entidades.Cliente;
import com.mycompany.barbearia.banco.ConexaoBanco;

public class CrudCliente {

  public void salvar(Cliente cliente) {
    String sql = "INSERT INTO clientes (nome, telefone) VALUES (?, ?)";
    
    try {
      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);
      
      stmt.setString(1, cliente.getTelefone());
      stmt.setString(2, cliente.getTelefone());
      
      stmt.executeUpdate();
      
      stmt.close();
      conn.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public List<Cliente> listar() {
    String sql = "SELECT * FROM clientes";
    List<Cliente> clientes = new ArrayList<>();
    
    try {
      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      
      while (rs.next()) {
        Cliente cliente = new Cliente();
        cliente.setId(rs.getInt("id"));
        cliente.setNome(rs.getString("nome"));
        cliente.setTelefone(rs.getString("telefone"));
        clientes.add(cliente);  
      }
      
      stmt.close();
      conn.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return clientes;
  }
  
  public void atualizarPorId(Cliente cliente) {
    String sql = "UPDATE clientes SET nome=?, telefone=? WHERE id=?";
    
    try {
      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);
      
      stmt.setString(1, cliente.getNome());
      stmt.setString(2, cliente.getTelefone());
      stmt.setInt(3, cliente.getId());
      
      stmt.executeUpdate();
      
      stmt.close();
      conn.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void excluirPorId(int id) {
    String sql = "DELETE FROM clientes WHERE id=?";
    
    try {
      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);
      
      stmt.setInt(1, id);
      
      stmt.executeUpdate();
      
      stmt.close();
      conn.close();
      
    } catch (Exception e) {
      e.printStackTrace(); 
    }
  }
  
  public Cliente buscarPorId(int id) {
    Cliente cliente = new Cliente();
    String sql = "SELECT * FROM clientes WHERE id=?";
    
    try {
      Connection conn = ConexaoBanco.getConnection();
      PreparedStatement stmt = conn.prepareStatement(sql);
      
      stmt.setInt(1, id);
      
      ResultSet rs = stmt.executeQuery();
      
      if (rs.next()) {
        cliente.setId(rs.getInt("id"));
        cliente.setNome(rs.getString("nome"));
        cliente.setTelefone(rs.getString("telefone"));
      }
      
      stmt.close();
      conn.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return cliente;
  }
}
