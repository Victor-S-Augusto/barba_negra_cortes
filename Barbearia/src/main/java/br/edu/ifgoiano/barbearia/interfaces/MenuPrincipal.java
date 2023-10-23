/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifgoiano.barbearia.interfaces;

import br.edu.ifgoiano.barbearia.modelo.dto.Agendamento;
import br.edu.ifgoiano.barbearia.modelo.dao.AgendamentoDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

/**
 * @author alexandre
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    public MenuPrincipal() {
        initComponents();
        
        int largura = getWidth();
        int altura = getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimensoesTela = toolkit.getScreenSize();

        int x = (dimensoesTela.width - largura) / 2;
        int y = (dimensoesTela.height - altura) / 2;
        
        setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnMostrarAgenda = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnMostrarAgendaHoje = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        lblNomeMarca = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        jMenuItem1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(420, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        btnMostrarAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnMostrarAgenda.setText("Visualizar Agenda");
        btnMostrarAgenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarAgenda);
        btnMostrarAgenda.setBounds(0, 190, 420, 34);

        btnAgendar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnAgendar.setText("Agendar horário");
        btnAgendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar);
        btnAgendar.setBounds(0, 230, 420, 34);

        btnSair.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(0, 340, 420, 30);

        btnMostrarAgendaHoje.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnMostrarAgendaHoje.setText("Horários de hoje");
        btnMostrarAgendaHoje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrarAgendaHoje.setMaximumSize(new java.awt.Dimension(154, 24));
        btnMostrarAgendaHoje.setMinimumSize(new java.awt.Dimension(154, 24));
        btnMostrarAgendaHoje.setPreferredSize(new java.awt.Dimension(154, 24));
        btnMostrarAgendaHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAgendaHojeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarAgendaHoje);
        btnMostrarAgendaHoje.setBounds(0, 270, 420, 34);

        btnCadastroCliente.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnCadastroCliente.setText("Cadastrar Cliente");
        btnCadastroCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastroCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroClienteMouseClicked(evt);
            }
        });
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastroCliente);
        btnCadastroCliente.setBounds(0, 150, 420, 34);

        lblNomeMarca.setFont(new java.awt.Font("Pirata One", 1, 48)); // NOI18N
        lblNomeMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeMarca.setText("Barba Negra");
        getContentPane().add(lblNomeMarca);
        lblNomeMarca.setBounds(0, 70, 420, 100);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon("/home/alexandre/Documents/aaaaaaaaaaaaa.png")); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(0, -10, 420, 120);

        lblFundo.setIcon(new javax.swing.ImageIcon("/home/alexandre/Downloads/fundo-de-textura-de-estilo-grunge-escuro-detalhado/detailed_grunge_texture_background_2307.jpg")); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 420, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAgendaActionPerformed
        TelaAgenda telaAgenda = new TelaAgenda();
        telaAgenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarAgendaActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        AgendarHorario agendar = new AgendarHorario();
        
        agendar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnMostrarAgendaHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAgendaHojeActionPerformed
        HorariosHoje agenda = new HorariosHoje();
        agenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarAgendaHojeActionPerformed

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        new CadastroCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void btnCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroClienteMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPrincipal().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnMostrarAgenda;
    private javax.swing.JButton btnMostrarAgendaHoje;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeMarca;
    // End of variables declaration//GEN-END:variables
}
