/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbearia.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco{

  private static String url = "jdbc:mysql://localhost:3306/nome_banco";
  private static String user = "root";
  private static String password = "123456789";

  public static Connection getConnection() {
    Connection conn = null;
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, password);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    return conn;
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}
