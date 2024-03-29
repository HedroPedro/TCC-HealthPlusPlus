package visao;

import javax.swing.JOptionPane;
import modelador.JDBCTiposDeConsulta;

public class EditarECadastrar_Linha_TipoDeConsulta extends javax.swing.JFrame {

    int cod;
    JDBCTiposDeConsulta tiposDeConsulta;
    Principal p;
    
    /**
     * Creates new form Editar_Linha_TipoDeConsulta
     */
    public EditarECadastrar_Linha_TipoDeConsulta(int cod, JDBCTiposDeConsulta tiposDeConsulta, Principal p, String nome, String preco) {
        initComponents();
        this.cod = cod;
        this.tiposDeConsulta = tiposDeConsulta;
        this.p = p;
        edt_nome.setText(nome);
        edt_preco.setText(preco);
    }

    public EditarECadastrar_Linha_TipoDeConsulta(JDBCTiposDeConsulta tiposDeConsulta, Principal p){
        initComponents();
        this.tiposDeConsulta = tiposDeConsulta;
        this.p = p;
        btn_editar.setText("Cadastrar");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        edt_nome = new javax.swing.JTextField();
        lbl_preco = new javax.swing.JLabel();
        edt_preco = new javax.swing.JFormattedTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 300));
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(750, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 300));
        jPanel1.setLayout(null);

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_nome.setText("Nome:");
        jPanel1.add(lbl_nome);
        lbl_nome.setBounds(50, 80, 70, 30);

        edt_nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(edt_nome);
        edt_nome.setBounds(50, 110, 360, 30);

        lbl_preco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_preco.setText("Preço:");
        jPanel1.add(lbl_preco);
        lbl_preco.setBounds(460, 80, 70, 30);

        edt_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        edt_preco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edt_preco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edt_precoFocusLost(evt);
            }
        });
        edt_preco.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                edt_precoPropertyChange(evt);
            }
        });
        jPanel1.add(edt_preco);
        edt_preco.setBounds(460, 110, 210, 30);

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);
        btn_cancelar.setBounds(460, 210, 120, 50);

        btn_editar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editar);
        btn_editar.setBounds(600, 210, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/imgs/Tela Editar Registro.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if( edt_nome.getText().isBlank() || (edt_preco.getText().isBlank()))
            JOptionPane.showMessageDialog(null, "Algum dos campos está vazio");
        else{
            float preco = Float.valueOf(edt_preco.getText().replace(',', '.'));
            if(cod == 0){
                tiposDeConsulta.adicionarTipoDeConsulta(edt_nome.getText(), preco);
            }else{
                tiposDeConsulta.editarTipoDeConsulta(cod, edt_nome.getText(), preco);
            }
            p.carregarTabelaTipoDeConsulta();
            dispose();
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void edt_precoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_edt_precoPropertyChange

    }//GEN-LAST:event_edt_precoPropertyChange

    private void edt_precoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt_precoFocusLost
        if(!edt_preco.getText().contains("."))
            edt_preco.setText(edt_preco.getText().replace('.',','));
        else if(!edt_preco.getText().contains(","))
            edt_preco.setText(edt_preco.getText().concat(",00"));
            
    }//GEN-LAST:event_edt_precoFocusLost
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField edt_nome;
    private javax.swing.JFormattedTextField edt_preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_preco;
    // End of variables declaration//GEN-END:variables
}
