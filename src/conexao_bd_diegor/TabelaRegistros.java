package conexao_bd_diegor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TabelaRegistros extends javax.swing.JDialog {


    public TabelaRegistros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populaTabela("");
    }

    public void recebeValores(String cod, String codUSER, String produto, String cliente, String dataRetiro, String dataDevolucao){
        jTcodUSER.setText(codUSER);
        jTproduto.setText(produto);
        jTcliente.setText(cliente);
        jTdataRetiro.setText(dataRetiro);
        jTdataDevolucao.setText(dataDevolucao);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTproduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTcliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBexcluirRegistro = new javax.swing.JButton();
        jBalterarRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTdataRetiro = new javax.swing.JTextField();
        jTdataDevolucao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBadicionar = new javax.swing.JButton();
        jBsearchProduto = new javax.swing.JButton();
        jBsearchCliente = new javax.swing.JButton();
        jBvoltar = new javax.swing.JButton();
        jTcodUSER = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("REGISTROS DE LOCAÇÃO");

        jTproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprodutoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Produto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Cliente:");

        jTcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTclienteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "COD do usuário", "Produto", "Cliente", "Data do retiro", "Data da devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable2.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Data da retirada:");

        jTdataRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdataRetiroActionPerformed(evt);
            }
        });

        jTdataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdataDevolucaoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Data da devolução:");

        jBadicionar.setText("ADICIONAR");
        jBadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarActionPerformed(evt);
            }
        });

        jBsearchProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conexao_bd_diegor/search-icon.png"))); // NOI18N
        jBsearchProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsearchProdutoActionPerformed(evt);
            }
        });

        jBsearchCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conexao_bd_diegor/search-icon.png"))); // NOI18N
        jBsearchCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsearchClienteActionPerformed(evt);
            }
        });

        jBvoltar.setText("VOLTAR");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("COD do usuário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBexcluirRegistro)
                .addGap(159, 159, 159)
                .addComponent(jBalterarRegistro)
                .addGap(235, 235, 235))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jBadicionar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jBvoltar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBsearchProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBsearchCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))))
                                .addGap(13, 13, 13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTcodUSER)
                                .addGap(2, 2, 2))
                            .addComponent(jTcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTproduto)
                            .addComponent(jTdataRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTdataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jBvoltar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcodUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBsearchProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBsearchCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdataRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addComponent(jBadicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBalterarRegistro)
                    .addComponent(jBexcluirRegistro))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsearchClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsearchClienteActionPerformed
        SearchClientes sc = new SearchClientes(null, false);
        sc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBsearchClienteActionPerformed

    private void jBsearchProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsearchProdutoActionPerformed
        SearchProdutos sp = new SearchProdutos(null, false);
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBsearchProdutoActionPerformed

    private void jBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarActionPerformed
        String codUSER = jTcodUSER.getText();
        String produto = jTproduto.getText();
        String cliente = jTcliente.getText();
        String dataRetiro = jTdataRetiro.getText();
        String dataDevolucao = jTdataDevolucao.getText();
        
        
        try{
            String query = "INSERT INTO `diegor_2022`.`registro` (`codUSER`, `produto`, `cliente`, `dataRetiro`, `dataDevolucao`)" + "VALUES ('"+codUSER+"', '"+produto+"', '"+cliente+"', '"+dataRetiro+"', '"+dataDevolucao+"');";
            Statement stmt = Conexao.conecta().createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(this, "Dados gravados com sucesso!");
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de sintaxe SQL:\n"+ex.getMessage());
        }
        
        
        TabelaRegistros t = new TabelaRegistros(null, false);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBadicionarActionPerformed

    private void jTdataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdataDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdataDevolucaoActionPerformed

    private void jTdataRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdataRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdataRetiroActionPerformed

    private void jTclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTclienteActionPerformed

    private void jTprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprodutoActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBexcluirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirRegistroActionPerformed
        String cod = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        
        try{
            String query = "DELETE FROM `diegor_2022`.`registro` WHERE `COD` LIKE '"+cod+"';";
            Statement stmt = Conexao.conecta().createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe SQL:\n"+ex.getMessage());
        }
        
        TabelaRegistros t = new TabelaRegistros(null, false);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBexcluirRegistroActionPerformed

    private void jBalterarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarRegistroActionPerformed
        String cod = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        String codUSER = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();
        String produto = jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString();
        String cliente = jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString();
        String dataRetiro = jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString();
        String dataDevolucao = jTable2.getValueAt(jTable2.getSelectedRow(), 5).toString();
        
        AlterarRegistro at = new AlterarRegistro();
        at.recebeValores(cod, codUSER, produto, cliente, dataRetiro, dataDevolucao);
        at.setVisible(true);
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
            java.util.logging.Logger.getLogger(TabelaRegistrosADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaRegistrosADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaRegistrosADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaRegistrosADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TabelaRegistros dialog = new TabelaRegistros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadicionar;
    private javax.swing.JButton jBalterarRegistro;
    private javax.swing.JButton jBexcluirRegistro;
    private javax.swing.JButton jBsearchCliente;
    private javax.swing.JButton jBsearchProduto;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTcliente;
    private javax.swing.JTextField jTcodUSER;
    private javax.swing.JTextField jTdataDevolucao;
    private javax.swing.JTextField jTdataRetiro;
    private javax.swing.JTextField jTproduto;
    // End of variables declaration//GEN-END:variables

    private void populaTabela(String string) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();        
        String query;
        query = "SELECT * FROM registro;";
        
            try {
            Statement stmt = Conexao.conecta().createStatement();

            ResultSet resultados = stmt.executeQuery(query);
            
            while(resultados.next()){
                modelo.addRow(
                new Object[]{
                    resultados.getInt("COD"),
                    resultados.getString("codUser"),
                    resultados.getString("produto"),
                    resultados.getString("cliente"),
                    resultados.getString("dataRetiro"),
                    resultados.getString("dataDevolucao"),
                }
                );
            }
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro de sintaxe SQL:\n"+ex.getMessage());
        }
    }
}
