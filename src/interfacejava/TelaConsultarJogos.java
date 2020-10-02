
package interfacejava;
;
import interfacejava.TelaInserirJogos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel A. C. de Aquino
 */
public class TelaConsultarJogos extends javax.swing.JFrame {

    /**
     * Classe criada para dar inicio a visualizacao de jogos e inserir novos dados,
     * tambem como a consulta de calculos atribuidos.
     * 
     * 2020, Daniel. A.C de Aquino
     */

    
    public TelaConsultarJogos() {
        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaConsultar = new javax.swing.JTable();
        btnAdicionarJogo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lblIntro = new javax.swing.JLabel();
        lblIntro1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTabelaResultados = new javax.swing.JTable();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Jogos");
        setLocationByPlatform(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(606, 301));

        jTabelaConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabelaConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "12"},
                {"2", "24"},
                {"3", "10"},
                {"4", "24"}
            },
            new String [] {
                "Jogo", "Placar"
            }
        ));
        jTabelaConsultar.setGridColor(new java.awt.Color(0, 0, 0));
        jTabelaConsultar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabelaConsultar);

        btnAdicionarJogo.setText("Adicionar novo Jogo");
        btnAdicionarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarJogoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblIntro.setFont(new java.awt.Font("DejaVu Serif", 3, 18)); // NOI18N
        lblIntro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntro.setText(" Sistema para acompanhamento de resultados");

        lblIntro1.setFont(new java.awt.Font("DejaVu Serif", 3, 18)); // NOI18N
        lblIntro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntro1.setText("Consulta de jogos");

        JTabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTabelaResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdicionarJogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizar))
                            .addComponent(lblIntro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIntro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(557, 557, 557))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIntro1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarJogo)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addGap(70, 70, 70)
                .addComponent(lblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarJogoActionPerformed
        // Abertura de um novo jFrame e finalizar o atual.
        TelaInserirJogos novoJogo = new TelaInserirJogos();
        novoJogo.setVisible(true);
        novoJogo.pack();
        novoJogo.setLocationRelativeTo(null);
        novoJogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    public static void AddRowToTable(Object [] inserir)
    {
           DefaultTableModel modeloTabela = (DefaultTableModel) jTabelaConsultar.getModel();
           modeloTabela.addRow(inserir);
    }
    
    {
    }//GEN-LAST:event_btnAdicionarJogoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //O botao apaga a linha selecionada.
        //Condicao para o usuario selecionar uma linha e excluir.
        if(jTabelaConsultar.getSelectedRow() != -1) {
            
        DefaultTableModel modeloTabela = (DefaultTableModel) jTabelaConsultar.getModel();
        modeloTabela.removeRow(jTabelaConsultar.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Jogo excluído!");
        }else{
            
            
            //Condicao para o usuario selecionar uma linha e excluir na outra Jtable.
            if(JTabelaResultados.getSelectedRow() != -1) {
            
        DefaultTableModel modeloTabelaResultados = (DefaultTableModel) JTabelaResultados.getModel();
        modeloTabelaResultados.removeRow(JTabelaResultados.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Jogo excluído!");
            }else{
           JOptionPane.showMessageDialog(null, "Selecione um jogo para excluir"); 
            
      
   
            }          
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        //A condicao da atribuicao para a Jtable de Resultados
        //a partir dos dados da Jtable Consultar, usando getSelectedRow.
        if (jTabelaConsultar.getSelectedRowCount()!=0) {
            DefaultTableModel modeloConsultar = (DefaultTableModel) jTabelaConsultar.getModel();
            DefaultTableModel modeloResultados = (DefaultTableModel) JTabelaResultados.getModel();

            Object[] transfer = {jTabelaConsultar.getValueAt(jTabelaConsultar.getSelectedRow()
                , 0), jTabelaConsultar.getValueAt(jTabelaConsultar.getSelectedRow(), 1)};
      modeloResultados.addRow(transfer);
        modeloConsultar.removeRow(jTabelaConsultar.getSelectedRow());
        }else{

        }

        //Array list para manipular os dados da tabela Resultados
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaConsultarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabelaResultados;
    private javax.swing.JButton btnAdicionarJogo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTabelaConsultar;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JLabel lblIntro1;
    // End of variables declaration//GEN-END:variables
}
