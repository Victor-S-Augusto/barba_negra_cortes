/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifgoiano.barbearia.interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author alexandre
 */
public class ConfirmacaoAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmacaoAgendamento
     */
    public ConfirmacaoAgendamento() {
        initComponents();
        
                int largura = getWidth();
        int altura = getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimensoesTela = toolkit.getScreenSize();

        // Calcula a posição para centralizar a janela
        int x = (dimensoesTela.width - largura) / 2;
        int y = (dimensoesTela.height - altura) / 2;
        
        setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNovoHorario = new javax.swing.JButton();
        btnRetornarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("O horário foi agendado com sucesso!");

        btnNovoHorario.setText("Agendar Novo Horário");
        btnNovoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoHorarioActionPerformed(evt);
            }
        });

        btnRetornarMenu.setText("Menu Principal");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovoHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetornarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(btnRetornarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoHorario)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoHorarioActionPerformed
        this.dispose();
        new AgendarHorario().setVisible(true);
    }//GEN-LAST:event_btnNovoHorarioActionPerformed

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornarMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoHorario;
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
