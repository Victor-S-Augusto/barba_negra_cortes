/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbearia.entidades;
import java.time.LocalDateTime;

public class Agenda {

  private int id;
  private LocalDateTime dataHorario;
  private String servico;
  private Cliente cliente;

  public Agenda() {}

  public Agenda(LocalDateTime dataHorario, String servico, Cliente cliente) {
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

    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }

    public LocalDateTime getDataHorario() {
        return dataHorario;
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
