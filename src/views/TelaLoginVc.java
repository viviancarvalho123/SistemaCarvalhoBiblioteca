/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import tools.util;

/**
 *
 * @author vivic
 */
public class TelaLoginVc extends javax.swing.JDialog {

    /**
     * Creates new form TelaLoginVc
     */
    public TelaLoginVc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         setTitle("Login no Sistema Biblioteca Carvalho");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtLogin = new javax.swing.JTextField();
        jPwfSenha = new javax.swing.JPasswordField();
        jBtnEntrar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLoginActionPerformed(evt);
            }
        });

        jPwfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwfSenhaActionPerformed(evt);
            }
        });

        jBtnEntrar.setBackground(new java.awt.Color(204, 204, 255));
        jBtnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jBtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enter.png"))); // NOI18N
        jBtnEntrar.setText("Entrar");
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });

        jBtnSair.setBackground(new java.awt.Color(204, 204, 255));
        jBtnSair.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO");

        jLabel3.setText("SENHA");

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel1.setText("Biblioteca Carvalho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLoginActionPerformed

    private void jPwfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwfSenhaActionPerformed

    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEntrarActionPerformed
        // TODO add your handling code here:

        if(jTxtLogin.getText().equals("Carvalho") && jPwfSenha.getText().equals("carvalho123") || jTxtLogin.getText().equals("Silva") && jPwfSenha.getText().equals("silvinha")){
            JOptionPane.showMessageDialog(null, "Acesso Permitido!!!");
            JFrmTelaPrincipal jfrmTelaPrincipal = new JFrmTelaPrincipal();
            jfrmTelaPrincipal.setVisible(true);
        }else{
           util.limparCampos(jTxtLogin, jPwfSenha);
            JOptionPane.showMessageDialog(null, "Acesso Negado :(");
       }

    }//GEN-LAST:event_jBtnEntrarActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginVc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginVc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginVc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginVc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLoginVc dialog = new TelaLoginVc(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnEntrar;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPwfSenha;
    private javax.swing.JTextField jTxtLogin;
    // End of variables declaration//GEN-END:variables
}
