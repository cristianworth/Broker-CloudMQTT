package BrokerMQTT;

import javax.swing.JOptionPane;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class BrokerMQTT extends javax.swing.JFrame {
    
    public static String Topic;
    public static String URL;
    public static String User;
    public static String Pass;
    public static String ID;
    public static String Porta;

    public BrokerMQTT() {
        initComponents();
    }

    public static void SetarDadosConexao(String URL, String User, String Pass, String ID, String Porta) {
        BrokerMQTT.URL = URL;
        BrokerMQTT.User = User;
        BrokerMQTT.Pass = Pass;
        BrokerMQTT.ID = ID;
        BrokerMQTT.Porta = Porta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMensagem = new javax.swing.JTextArea();
        jbEnviaMsg = new javax.swing.JButton();
        jtTopico = new javax.swing.JTextField();
        jlTopic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensagem Broker");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Publish a message"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jtaMensagem.setColumns(20);
        jtaMensagem.setRows(5);
        jScrollPane1.setViewportView(jtaMensagem);

        jbEnviaMsg.setText("Enviar Mensagem");
        jbEnviaMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviaMsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbEnviaMsg)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEnviaMsg)
                .addContainerGap())
        );

        jlTopic.setText("Tópico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jlTopic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTopico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTopico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTopic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnviaMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviaMsgActionPerformed
        String enderecoBroker = "tcp://".concat(BrokerMQTT.URL).concat(":").concat(BrokerMQTT.Porta);
        try {
            MqttConnectOptions dadosConexaoMqtt = new MqttConnectOptions();
            dadosConexaoMqtt.setCleanSession(true);
            dadosConexaoMqtt.setUserName(BrokerMQTT.User);
            dadosConexaoMqtt.setPassword(BrokerMQTT.Pass.toCharArray());
            
            MqttClient mqttController = new MqttClient(enderecoBroker, BrokerMQTT.ID);
            mqttController.connect(dadosConexaoMqtt);

            MqttMessage message = new MqttMessage(jtaMensagem.getText().getBytes());
            message.setQos(2);
            mqttController.publish(jtTopico.getText(), message);
            System.out.println("Mensagem enviada: " + jtaMensagem.getText()); 
            JOptionPane.showMessageDialog(this, "Mensagem enviada com sucesso!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            mqttController.disconnect();
            jtaMensagem.setText("");
        } catch (MqttException error) {
            JOptionPane.showMessageDialog(this, error.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEnviaMsgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEnviaMsg;
    private javax.swing.JLabel jlTopic;
    private javax.swing.JTextField jtTopico;
    private javax.swing.JTextArea jtaMensagem;
    // End of variables declaration//GEN-END:variables
}
