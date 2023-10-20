package br.edu.ifgoiano.barbearia.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifgoiano.barbearia.modelo.dto.Cliente;

public class ClienteDAO extends DAO {

    public void salvar(Cliente c) throws Exception {
        Connection conn = getConnection();
        
        String sql = "INSERT INTO clientes (nome, telefone) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getTelefone());

        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }

    public List<Cliente> listar() throws Exception {
        List<Cliente> lista = new ArrayList<>();

        Connection conn = getConnection();
        
        String sql = "SELECT * FROM clientes order by nome";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) { 
            Cliente cliente = new Cliente();
            
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));

            lista.add(cliente);
        }

        stmt.close();
        conn.close();

        return lista;
    }
    
    public Cliente selecionar(int id) throws Exception {
        Connection conn = getConnection();
        
        String sql = "SELECT * FROM clientes where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) { 
            Cliente cliente = new Cliente();
            
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));

            return cliente;
        } else {
            return null;
        }
    }
}
