package conexao_bd_diegor;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class SearchClientesADM extends javax.swing.JDialog {

    public SearchClientesADM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populaTabela("");
    }

    public void recebeValores(String cod, String nome, String cpf, String endereco){}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTnomeCliente = new javax.swing.JTextField();
        jBvoltar = new javax.swing.JButton();
        jBexcluirRegistro = new javax.swing.JButton();
        jBalterarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "CPF", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("BUSCAR CLIENTES ADM");

        jLabel1.setText("Nome do cliente:");

        jTnomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnomeClienteKeyReleased(evt);
            }
        });

        jBvoltar.setText("VOLTAR");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        jBexcluirRegistro.setForeground(new java.awt.Color(255, 51, 51));
        jBexcluirRegistro.setText("EXCLUIR REGISTRO");
        jBexcluirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirRegistroActionPerformed(evt);
            }
        });

        jBalterarRegistro.setForeground(new java.awt.Color(0, 204, 204));
        jBalterarRegistro.setText("ALTERAR REGISTRO");
        jBalterarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBvoltar)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jBexcluirRegistro)
                                .addGap(39, 39, 39)
                                .addComponent(jBalterarRegistro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBvoltar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTnomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBexcluirRegistro)
                    .addComponent(jBalterarRegistro))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTnomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnomeClienteKeyReleased
        String busca = jTnomeCliente.getText();
        populaTabela(busca);
    }//GEN-LAST:event_jTnomeClienteKeyReleased

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        TabelaRegistrosADM y = new TabelaRegistrosADM(null, false);
        y.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBexcluirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirRegistroActionPerformed
        String cod = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        
        try{
            String query = "DELETE FROM `diegor_2022`.`cliente` WHERE `COD` LIKE '"+cod+"';";
            Statement stmt = Conexao.conecta().createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe SQL:\n"+ex.getMessage());
        }
        
        SearchClientesADM sca = new SearchClientesADM(null, false);
        sca.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBexcluirRegistroActionPerformed

    private void jBalterarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarRegistroActionPerformed
        String cod = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        String nome = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();
        String cpf = jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString();
        String endereco = jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString();
        
        AlterarClienteADM aca = new AlterarClienteADM();
        aca.recebeValores(cod, nome, cpf, endereco);
        aca.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBalterarRegistroActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchClientesADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchClientesADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchClientesADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchClientesADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SearchClientesADM(null, false).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterarRegistro;
    private javax.swing.JButton jBexcluirRegistro;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTnomeCliente;
    // End of variables declaration//GEN-END:variables

    private void populaTabela(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setNumRows(0);
        String query;
        if(busca.equals("")) {
            query = "SELECT * FROM cliente;";
        }else{
            query = "SELECT * FROM cliente WHERE nome LIKE  '"+busca+"%';";
        }
        
        try {
            Statement stmt = Conexao.conecta().createStatement();
            
            ResultSet resultados = stmt.executeQuery(query);
            
            while(resultados.next()){
                modelo.addRow(
                new Object[]{
                    resultados.getString("COD"),
                    resultados.getString("Nome"),
                    resultados.getString("CPF"),
                    resultados.getString("Endereço")
                }
                );
            }            
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de sintaxe SQL:\n"+ex.getMessage());
        }
    }
}
