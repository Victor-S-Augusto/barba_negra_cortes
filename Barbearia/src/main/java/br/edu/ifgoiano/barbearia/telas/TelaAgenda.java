/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifgoiano.barbearia.telas;

import br.edu.ifgoiano.barbearia.modelo.dao.DAO;
import br.edu.ifgoiano.barbearia.modelo.dto.Agendamento;
import br.edu.ifgoiano.barbearia.modelo.dao.AgendamentoDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alexandre
 */
public class TelaAgenda extends javax.swing.JFrame {

    public TelaAgenda() {
        try {
            initComponents();
            
            AgendamentoDAO crudAgenda = new AgendamentoDAO();
            List<Agendamento> agendas = crudAgenda.listar();
            
            int largura = getWidth();
            int altura = getHeight();
            
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimensoesTela = toolkit.getScreenSize();
            
            // Calcula a posição para centralizar a janela
            int x = (dimensoesTela.width - largura) / 2;
            int y = (dimensoesTela.height - altura) / 2;
            
            setLocation(x, y);
            
            DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
            
            agendas.sort(Comparator.comparing(Agendamento::getDataHorario));
            LocalDate dataAtual = LocalDate.now();
            
            for (Agendamento agenda : agendas) {
                
                LocalDate data = agenda.getDataHorario().toLocalDate();
                LocalTime horario = agenda.getDataHorario().toLocalTime();
                
                if (data.isEqual(dataAtual) || data.isAfter(dataAtual)) {
                    model.addRow(new Object[]{agenda.getId(), agenda.getCliente().getNome(), agenda.getCliente().getTelefone(), data, horario, agenda.getServico()});
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        btnVoltarMenu = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 353));
        setResizable(false);
        getContentPane().setLayout(null);

        tblAgenda.setBackground(new java.awt.Color(102, 102, 102));
        tblAgenda.setForeground(new java.awt.Color(255, 255, 255));
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
            tblAgenda.getColumnModel().getColumn(1).setMinWidth(150);
            tblAgenda.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblAgenda.getColumnModel().getColumn(1).setMaxWidth(200);
            tblAgenda.getColumnModel().getColumn(2).setMinWidth(180);
            tblAgenda.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblAgenda.getColumnModel().getColumn(2).setMaxWidth(210);
            tblAgenda.getColumnModel().getColumn(3).setMinWidth(140);
            tblAgenda.getColumnModel().getColumn(3).setPreferredWidth(140);
            tblAgenda.getColumnModel().getColumn(3).setMaxWidth(180);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 29, 760, 288);

        btnVoltarMenu.setText("Retornar ao menu");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarMenu);
        btnVoltarMenu.setBounds(561, 323, 190, 25);

        txtTitulo.setText("Visualização dos horários");
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(304, 0, 166, 19);

        lblFundo.setBackground(new java.awt.Color(102, 102, 102));
        lblFundo.setIcon(new javax.swing.ImageIcon("/home/Aluno/Área de trabalho/barba_negra_cortes/imagens_telas/close-up-de-negativo-de-fotografia_23-2148132284.jpg")); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 770, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();

        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JTable tblAgenda;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
