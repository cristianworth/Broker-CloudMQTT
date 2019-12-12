package BrokerMQTT;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();

        jtURL.setText("tailor.cloudmqtt.com");
        jtUser1.setText("qxmwjbrt");
        jtPass.setText("UMQT0XqsQN5p");
        jtID.setText("1458400");
        jtPorta.setText("14477");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtURL = new javax.swing.JTextField();
        jtPass = new javax.swing.JTextField();
        jtUser1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtPorta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jlURL = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados Conexão Broker");
        setResizable(false);

        jLabel2.setText("Porta:");

        jLabel3.setText("ID:");

        jlURL.setText("Nome do Broker");

        jlUser.setText("Usuário");

        jlPass.setText("Senha");

        jbSalvar.setText("Salvar");
        jbSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalvarMouseClicked(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlURL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPass, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtUser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jtPass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtURL, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtPorta)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jbSalvar)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlURL)
                            .addComponent(jtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlUser)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jbCancelarMouseClicked

    private void jbSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseClicked
       BrokerMQTT broker = new BrokerMQTT();
       
       broker.SetarDadosConexao(jtURL.getText(), jtUser1.getText(), jtPass.getText(), jtID.getText(), jtPorta.getText());
       this.dispose();
       broker.setVisible(true);
    }//GEN-LAST:event_jbSalvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlURL;
    private javax.swing.JLabel jlUser;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtPass;
    private javax.swing.JTextField jtPorta;
    private javax.swing.JTextField jtURL;
    private javax.swing.JTextField jtUser1;
    // End of variables declaration//GEN-END:variables
}
