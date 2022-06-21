package visao;

import javax.swing.JOptionPane;
import modelador.Conectador;
import modelador.JDBCUsuario;


public class FirstScreen extends javax.swing.JFrame {

    Conectador c = new Conectador();
    JDBCUsuario usuario = new JDBCUsuario(c.abrirConnection());
    
    public FirstScreen() {       
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btn_cancelar = new javax.swing.JButton();
        btn_programadores = new javax.swing.JButton();
        lbl_imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 255));
        setLocation(new java.awt.Point(1600, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 800));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        btn_login.setText("Login");
        btn_login.setToolTipText("");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(283, 643, 188, 86);
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(180, 490, 278, 38);
        jPanel1.add(txtSenha);
        txtSenha.setBounds(180, 560, 278, 41);

        btn_cancelar.setBackground(new java.awt.Color(255, 58, 245));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);
        btn_cancelar.setBounds(160, 660, 110, 50);

        btn_programadores.setText("only for programers");
        btn_programadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_programadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btn_programadores);
        btn_programadores.setBounds(400, 100, 135, 22);

        lbl_imagem.setIcon(new javax.swing.ImageIcon("E:\\TCC SURPREENDENTE\\Design\\Tela Login - X.jpg")); // NOI18N
        jPanel1.add(lbl_imagem);
        lbl_imagem.setBounds(0, 0, 600, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String nome = txtUsuario.getText();
        String senha = String.copyValueOf(txtSenha.getPassword());
        if(usuario.existeUsuario(nome,senha)){
            Principal p = new Principal();
            p.show();
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "TA ERRADO PIA");
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_programadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_programadoresActionPerformed
        Principal adm = new Principal();
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_programadoresActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**.
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
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_programadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
