package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelador.JDBCAgendamento;
import modelos.Agendamento;

public class Editar_Linha_Consulta extends javax.swing.JFrame {
    JDBCAgendamento modelaAgendamento;
    int cod;
    Principal p;
    
    /**
     * Creates new form Editar_Campo
     * @param cod
     * @param nome
     * @param p
     */
    public Editar_Linha_Consulta(int cod, String nome, String dataEHora, String preco, Principal p){
        initComponents();
        String[] DataEHoraQuebrada = dataEHora.split(" ");
        modelaAgendamento = p.agendamentos;
        this.cod = cod;
        edt_nome.setText(nome);
        edt_data.setText(DataEHoraQuebrada[0]);
        edt_hora.setText(DataEHoraQuebrada[1]);
        edt_preco.setText(preco);
        this.p = p;
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
        edt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_confirmar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        edt_preco = new javax.swing.JFormattedTextField();
        edt_data = new javax.swing.JFormattedTextField();
        edt_hora = new javax.swing.JFormattedTextField();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 300));
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 300));
        jPanel1.setLayout(null);

        edt_nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(edt_nome);
        edt_nome.setBounds(40, 80, 650, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Preço:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 120, 200, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nome do Cliente:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 50, 170, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Data:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 110, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Hora:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 120, 80, 30);

        btn_confirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_confirmar.setText("Confirmar");
        btn_confirmar.setBorder(null);
        btn_confirmar.setMaximumSize(new java.awt.Dimension(120, 40));
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_confirmar);
        btn_confirmar.setBounds(570, 210, 120, 50);

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);
        btn_cancelar.setBounds(430, 210, 120, 50);

        edt_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###.0#"))));
        edt_preco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edt_preco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edt_precoFocusLost(evt);
            }
        });
        jPanel1.add(edt_preco);
        edt_preco.setBounds(490, 150, 180, 30);

        try {
            edt_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edt_data.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edt_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_dataActionPerformed(evt);
            }
        });
        jPanel1.add(edt_data);
        edt_data.setBounds(40, 150, 180, 30);

        try {
            edt_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edt_hora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edt_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_horaActionPerformed(evt);
            }
        });
        jPanel1.add(edt_hora);
        edt_hora.setBounds(260, 150, 180, 30);

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/imgs/Tela Editar Registro.jpg"))); // NOI18N
        jPanel1.add(lbl_fundo);
        lbl_fundo.setBounds(0, 0, 750, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_nomeActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void edt_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_dataActionPerformed

    private void edt_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_horaActionPerformed

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        if(edt_nome.getText().equals("") || edt_hora.getText().equals("  :  ") || edt_data.getText().equals("  /  /    ") || edt_preco.getText().equals("  ,  ")){
            JOptionPane.showMessageDialog(null, "Algum dos campos está vazio");
        }else{
            Date data = new Date();
            try {
                data = formatador.parse(edt_data.getText() + " " + edt_hora.getText());
            } catch (ParseException ex) {
                Logger.getLogger(Editar_Linha_Consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
           if(Agendamento.verificarData(data)){
               JOptionPane.showMessageDialog(null, "Digite uma data e hora válida");
           }else{
                if(modelaAgendamento.checarDataNoSistema(data, cod)){
                    modelaAgendamento.atualizarAgendamento(new Agendamento(cod, data, edt_nome.getText(), Float.valueOf(edt_preco.getText().replace(',', '.'))));
                    this.p.carregarTabelaConsulta();
                    dispose();
                }else
                    JOptionPane.showMessageDialog(null, "Data e hora cadastrada em outro cliente");
                
               }                  
        }
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void edt_precoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt_precoFocusLost

    }//GEN-LAST:event_edt_precoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JFormattedTextField edt_data;
    private javax.swing.JFormattedTextField edt_hora;
    private javax.swing.JTextField edt_nome;
    private javax.swing.JFormattedTextField edt_preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fundo;
    // End of variables declaration//GEN-END:variables
}
