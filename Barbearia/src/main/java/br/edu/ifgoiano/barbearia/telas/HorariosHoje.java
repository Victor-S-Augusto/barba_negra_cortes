/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifgoiano.barbearia.telas;

import br.edu.ifgoiano.barbearia.modelo.dao.AgendamentoDAO;
import br.edu.ifgoiano.barbearia.modelo.dto.Agendamento;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexandre
 */
public class HorariosHoje extends javax.swing.JFrame {

    public HorariosHoje() {
        try {
            initComponents();
            
            AgendamentoDAO crud = new AgendamentoDAO();
            List<Agendamento> agendas = crud.listar(new Date());
                                
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
            
            for (Agendamento agenda : agendas) {
                
                LocalDate data = agenda.getDataHorario().toLocalDate();
                LocalTime horario = agenda.getDataHorario().toLocalTime();
                
                //if(data.isEqual(dataAtual)){
                    model.addRow(new Object[] { agenda.getId(), agenda.getCliente().getNome(), agenda.getCliente().getTelefone(), data, horario, agenda.getServico()});
                //}
            }
        } catch (Exception ex) {
            Logger.getLogger(HorariosHoje.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        btnRetornarMenu = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(757, 362));
        setMinimumSize(new java.awt.Dimension(757, 362));
        setPreferredSize(new java.awt.Dimension(757, 362));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Nimbus Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Agendamentos de Hoje");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(0, 10, 750, 30);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(-6, 50, 770, 269);

        btnRetornarMenu.setText("Retornar ao Menu");
        btnRetornarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetornarMenu);
        btnRetornarMenu.setBounds(520, 330, 230, 25);

        lblFundo.setIcon(new javax.swing.ImageIcon("/home/Aluno/Área de trabalho/barba_negra_cortes/imagens_telas/close-up-de-negativo-de-fotografia_23-2148132284.jpg")); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 760, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetornarMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
