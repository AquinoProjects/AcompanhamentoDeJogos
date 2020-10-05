
package interfacejava;

import javax.swing.JFrame;

/**
 *
 * @author Daniel. A.C de Aquino, 2020.
 */
public class TelaOpcoes extends javax.swing.JFrame {

    /**
     * Essa classe foi gerida para dar a opção para o usuario de 
     * abrir a janela para Consulta e Insercao de Dados.
     */
    public TelaOpcoes() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        panOpcoes = new javax.swing.JPanel();
        lblIntro = new javax.swing.JLabel();
        btnInsercaoDeJogos = new javax.swing.JButton();
        btnResultados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jInserir = new javax.swing.JMenu();
        jConsulta = new javax.swing.JMenuItem();
        jResultados = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenuItem();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opções");
        setLocationByPlatform(true);

        panOpcoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 153), 1, true));
        panOpcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIntro.setFont(new java.awt.Font("DejaVu Serif", 3, 18)); // NOI18N
        lblIntro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntro.setText("Sistema para Acompanhamento de Resultados");
        panOpcoes.add(lblIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 480, 41));

        btnInsercaoDeJogos.setText("Inserir e Consultar jogos");
        btnInsercaoDeJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercaoDeJogosActionPerformed(evt);
            }
        });
        panOpcoes.add(btnInsercaoDeJogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 240, -1));

        btnResultados.setText("Inserir e Consultar Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });
        panOpcoes.add(btnResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 260, -1));

        jInserir.setText("Opções");

        jConsulta.setText("Inserir e Consultar");
        jConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaActionPerformed(evt);
            }
        });
        jInserir.add(jConsulta);

        jResultados.setText("Resultados");
        jResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResultadosActionPerformed(evt);
            }
        });
        jInserir.add(jResultados);

        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jInserir.add(jSair);

        jMenuBar1.add(jInserir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsercaoDeJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercaoDeJogosActionPerformed
       //Abre uma nova tela para por fim finalizar a de Opcoes.
        new TelaConsultarJogos().setVisible(true);
        this.dispose();
        
        
    
        
    }//GEN-LAST:event_btnInsercaoDeJogosActionPerformed

    private void jConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaActionPerformed
        // //Abre uma nova tela para por fim finalizar a de Opcoes.
        new TelaConsultarJogos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jConsultaActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        // Fecha a aplicacao.
        this.dispose();
    
    }//GEN-LAST:event_jSairActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
       //Abre o Frame determinado e fecha o atual.
        new TelaConsultarResultados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void jResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResultadosActionPerformed
       //Abre o Frame determinado e fecha o atual.
        new TelaConsultarResultados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsercaoDeJogos;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jConsulta;
    private javax.swing.JMenu jInserir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jResultados;
    private javax.swing.JMenuItem jSair;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JPanel panOpcoes;
    // End of variables declaration//GEN-END:variables
}
