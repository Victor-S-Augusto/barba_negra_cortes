/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbearia.entidades;
import java.util.Date;

public class Cliente {

  private int id;
  private String nome;
  private String telefone; 
  //private Date dataServico;

  public Cliente() {}

  public Cliente(int id, String nome, String tel, Date dataServico) {
    this.id = id;
    this.nome = nome;
    this.telefone = tel;
    ///this.dataServico = dataServico;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome; 
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  //public Date getDataServico() {
  //  return dataServico;
  //}

  //public void setDataServico(Date dataServico) {
   // this.dataServico = dataServico;
  //}

}
