/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.barbearia.interfaces;

import com.mycompany.barbearia.entidades.Agenda;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexandre
 */
public class HorariosHoje extends javax.swing.JFrame {

    public HorariosHoje(List<Agenda> agendas) {
        initComponents();
        
        int largura = getWidth();
        int altura = getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimensoesTela = toolkit.getScreenSize();

        // Calcula a posição para centralizar a janela
        int x = (dimensoesTela.width - largura) / 2;
        int y = (dimensoesTela.height - altura) / 2;
        
        setLocation(x, y);
        
        DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
        
        agendas.sort(Comparator.comparing(Agenda::getDataHorario));
        LocalDate dataAtual = LocalDate.now();

        for (Agenda agenda : agendas) {
                    
            LocalDate data = agenda.getDataHorario().toLocalDate();
            LocalTime horario = agenda.getDataHorario().toLocalTime();
            
            if(data.isEqual(dataAtual)){
                model.addRow(new Object[] { agenda.getId(), agenda.getCliente().getNome(), agenda.getCliente().getTelefone(), data, horario, agenda.getServico()});
            }                    
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        btnRetornarMenu = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Agendamentos de Hoje");

        tblAgenda.setBackground(new java.awt.Color(204, 255, 255));
        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Data", "Horário", "Serviço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAgenda);
        if (tblAgenda.getColumnModel().getColumnCount() > 0) {
            tblAgenda.getColumnModel().getColumn(0).setMinWidth(30);
            tblAgenda.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblAgenda.getColumnModel().getColumn(0).setMaxWidth(40);
            tblAgenda.getColumnModel().getColumn(1).setMinWidth(200);
            tblAgenda.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblAgenda.getColumnModel().getColumn(1).setMaxWidth(200);
            tblAgenda.getColumnModel().getColumn(2).setMinWidth(150);
            tblAgenda.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblAgenda.getColumnModel().getColumn(2).setMaxWidth(150);
            tblAgenda.getColumnModel().getColumn(3).setMinWidth(120);
            tblAgenda.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblAgenda.getColumnModel().getColumn(3).setMaxWidth(120);
            tblAgenda.getColumnModel().getColumn(4).setMinWidth(120);
            tblAgenda.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblAgenda.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        btnRetornarMenu.setText("Retornar ao Menu");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetornarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetornarMenu)
                    .addComponent(btnSair))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
