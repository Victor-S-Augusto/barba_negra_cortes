/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifgoiano.barbearia;
import br.edu.ifgoiano.barbearia.modelo.dto.Cliente;
import br.edu.ifgoiano.barbearia.interfaces.MenuPrincipal;

/**
 *
 * @author alexandre
 */
public class Barbearia {

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
