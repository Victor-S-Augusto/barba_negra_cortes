/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbearia.entidades;

/**
 *
 * @author alexandre
 */
public class Agenda {
    private Cliente pessoa = new Cliente();
    private int hora;
    private int minuto;
    private int dia;
    private int mes;
    private int ano;

    public Cliente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa) {
        this.pessoa = pessoa;
    }

    public boolean agendar(int hora, int minuto, int dia, int mes, int ano, Cliente pessoa){
        
    }
    
}
