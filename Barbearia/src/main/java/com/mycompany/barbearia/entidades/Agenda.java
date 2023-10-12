/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbearia.entidades;
import java.util.Date;

public class Agenda {

  private int id;
  private Date dataHorario;
  private String servico;
  private Cliente cliente;

  public Agenda() {}

  public Agenda(int id, Date dataHorario, String servico, Cliente cliente) {
    this.id = id;
    this.dataHorario = dataHorario;
    this.servico = servico;
    this.cliente = cliente;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDataHorario() {
    return dataHorario;
  }

  public void setDataHorario(Date dataHorario) {
    this.dataHorario = dataHorario;
  }

  public String getServico() {
    return servico;
  }

  public void setServico(String servico) {
    this.servico = servico;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

}
