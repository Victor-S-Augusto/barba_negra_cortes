/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.barbearia;
import com.mycompany.barbearia.entidades.Cliente;
import com.mycompany.barbearia.interfaces.MenuPrincipal;
import crud.CrudCliente;

/**
 *
 * @author alexandre
 */
public class App {

  public static void main(String[] args) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
      
      
      
      
    
//    CrudCliente crudCliente = new CrudCliente();
//    
//    // Inserir cliente
//    Cliente cliente = new Cliente();
//    cliente.setNome("João");
//    cliente.setTelefone("999999999");
//    
//    crudCliente.salvar(cliente);
//    
//    // Listar clientes
//    for(Cliente c : crudCliente.listar()) {
//      System.out.println(c.getNome());
//    }
//    
//    // Buscar cliente pelo ID
//    Cliente clienteEncontrado = crudCliente.buscarPorId(1);
//    System.out.println(clienteEncontrado.getNome());
//    
//    // Atualizar cliente
//    clienteEncontrado.setNome("José");
//    crudCliente.atualizarPorId(clienteEncontrado);
//    
//    // Excluir cliente
//    crudCliente.excluirPorId(2);
    
  }

}
