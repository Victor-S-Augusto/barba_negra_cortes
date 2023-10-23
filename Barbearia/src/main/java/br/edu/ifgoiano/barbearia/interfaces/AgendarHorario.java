/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifgoiano.barbearia.interfaces;

import br.edu.ifgoiano.barbearia.modelo.dto.Cliente;
import java.time.LocalDateTime;
import br.edu.ifgoiano.barbearia.modelo.dto.Agendamento;
import br.edu.ifgoiano.barbearia.modelo.dao.AgendamentoDAO;
import br.edu.ifgoiano.barbearia.modelo.dao.ClienteDAO;
import br.edu.ifgoiano.barbearia.modelo.dto.enumeracoes.Servico;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre
 */
public class AgendarHorario extends javax.swing.JFrame {

    public AgendarHorario() {
        try {
            initComponents();
            
            int largura = getWidth();
            int altura = getHeight();
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimensoesTela = toolkit.getScreenSize();
            
            // Calcula a posição para centralizar a janela
            int x = (dimensoesTela.width - largura) / 2;
            int y = (dimensoesTela.height - altura) / 2;
            
            cmbServico.addItem(Servico.CORTE);
            cmbServico.addItem(Servico.BARBA);
            cmbServico.addItem(Servico.CORTE_MAIS_BARBA);
            
            ClienteDAO cDAO = new ClienteDAO();
            List<Cliente> clientes = cDAO.listar();
            
            for (Cliente c: clientes){
                cmbCliente.addItem(c);
            }
            
            setLocation(x, y);
        } catch (Exception ex) {
            Logger.getLogger(AgendarHorario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAno = new javax.swing.JComboBox<>();
        btnRetornarMenu = new javax.swing.JButton();
        lblHorario = new javax.swing.JLabel();
        cmbServico = new javax.swing.JComboBox<>();
        lblServico = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        cmbMinuto = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Nimbus Sans", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Agendar Horário");

        lblNome.setText("Cliente:");

        lblData.setText("Data:");

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        cmbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024" }));

        btnRetornarMenu.setText("Retornar ao Menu");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        lblHorario.setText("Horário:");

        lblServico.setText("Serviço:");

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        cmbMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServico)
                            .addComponent(lblHorario)
                            .addComponent(lblData)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRetornarMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgendar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario)
                    .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar)
                    .addComponent(btnRetornarMenu))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();

        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed

    }//GEN-LAST:event_cmbMesActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        int ano = Integer.parseInt((String) cmbAno.getSelectedItem());
        int mes = cmbMes.getSelectedIndex() + 1;
        int dia = Integer.parseInt((String) cmbDia.getSelectedItem());
        Servico servico = (Servico) cmbServico.getSelectedItem();

        int hora = Integer.parseInt((String) cmbHora.getSelectedItem());
        int minuto = Integer.parseInt((String) cmbMinuto.getSelectedItem());

        LocalDateTime dataHorario = LocalDateTime.of(ano, mes, dia, hora, minuto);
        LocalDateTime dataAtual = LocalDateTime.now();

        if (dataHorario.isBefore(dataAtual)) {
            JOptionPane.showMessageDialog(this, "Data ou horário inválidos.");
        } else {
            try {
                Cliente cliente = (Cliente) cmbCliente.getSelectedItem();
                
                Agendamento agenda = new Agendamento(dataHorario, servico, cliente);
                
                AgendamentoDAO salvar = new AgendamentoDAO();
                salvar.salvar(agenda);
                
                this.dispose();
                
                ConfirmacaoAgendamento confirmacao = new ConfirmacaoAgendamento();
                confirmacao.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(AgendarHorario.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<Cliente> cmbCliente;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbMinuto;
    private javax.swing.JComboBox<Servico> cmbServico;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
