package br.edu.ifgoiano.barbearia.modelo.dto;

import br.edu.ifgoiano.barbearia.modelo.dto.enumeracoes.Servico;
import java.time.LocalDateTime;

public class Agendamento {

    private int id;
    private LocalDateTime dataHorario;
    private Servico servico;
    private Cliente cliente;

    public Agendamento() {
    }

    public Agendamento(LocalDateTime dataHorario, Servico servico, Cliente cliente) {
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

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
