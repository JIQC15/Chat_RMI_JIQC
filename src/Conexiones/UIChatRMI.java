package Conexiones;

import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.rmi.RemoteException;

public class UIChatRMI extends javax.swing.JFrame {

    ChatServer chatServer;
    ChatClient chatClient;

    //Atributos necesarios:
    String NombreUsuario;

    public UIChatRMI() throws RemoteException {
        this.chatServer = new ChatServer();
        this.chatClient = new ChatClient();
        initComponents();

        btnEnviarMensajeGrupo.setEnabled(false);
        btnEnviarMensajePrivado.setEnabled(false);
        txtAreaChat.setEnabled(false);
        txtMensaje.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAbrirServidor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaChat = new javax.swing.JTextArea();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnEnviarMensajeGrupo = new javax.swing.JButton();
        btnEnviarMensajePrivado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalirChat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("CHAT RMI");

        jLabel1.setText("<html><p>Bienvenido a tu chat de RMI en vivo, con este programa podrás enviar y recibir mensajes por parte de un cliente o por parte de un servidor.</p></html>");

        btnAbrirServidor.setText("Conectar Servidor");
        btnAbrirServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirServidorActionPerformed(evt);
            }
        });

        txtAreaChat.setColumns(20);
        txtAreaChat.setRows(5);
        jScrollPane1.setViewportView(txtAreaChat);

        btnRegistrarUsuario.setText("Registrar Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        btnEnviarMensajeGrupo.setText("Enviar Mensaje al grupo");
        btnEnviarMensajeGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeGrupoActionPerformed(evt);
            }
        });

        btnEnviarMensajePrivado.setText("Enviar Mensaje Privado");
        btnEnviarMensajePrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajePrivadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Es hora de empezar a chatear con los demás!");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("CHAT EN VIVO");

        btnSalirChat.setText("Salir del Chat");
        btnSalirChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAbrirServidor)
                                    .addGap(178, 178, 178)
                                    .addComponent(btnRegistrarUsuario))
                                .addComponent(jLabel2))
                            .addGap(2, 2, 2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEnviarMensajePrivado)
                            .addGap(271, 271, 271))
                        .addComponent(btnSalirChat))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEnviarMensajeGrupo)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(199, 199, 199))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirServidor)
                    .addComponent(btnRegistrarUsuario))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarMensajePrivado)
                    .addComponent(btnEnviarMensajeGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirChat)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirServidorActionPerformed
        try {
            String Ip = JOptionPane.showInputDialog(rootPane, "Escribe la IP que tendrá el servidor...", "Servidor", JOptionPane.INFORMATION_MESSAGE);
            chatServer.EstablecerConexion(Ip);
            JOptionPane.showConfirmDialog(rootPane, "Se conecto el servidor con exito!");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAbrirServidorActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        String Ip = JOptionPane.showInputDialog(rootPane, "Escribe la ip del servidor", "Usuario Nuevo", JOptionPane.INFORMATION_MESSAGE);
        NombreUsuario = JOptionPane.showInputDialog(rootPane, "Escribe el Nombre de registro: ", "Usuario Nuevo", JOptionPane.INFORMATION_MESSAGE);
        chatClient = new ChatClient();
        chatClient.ComenzarCliente(NombreUsuario, txtAreaChat, Ip);
        btnEnviarMensajeGrupo.setEnabled(true);
        btnEnviarMensajePrivado.setEnabled(true);
        txtMensaje.setEnabled(true);
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnEnviarMensajeGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeGrupoActionPerformed
        if (!txtMensaje.getText().isEmpty()) {
            String message = txtMensaje.getText();

            try {
                chatClient.enviarMensajeGrupal(message, NombreUsuario);
                limpiarArea();
            } catch (RemoteException ex) {
                Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEnviarMensajeGrupoActionPerformed

    private void btnEnviarMensajePrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajePrivadoActionPerformed
        if (!txtMensaje.getText().isEmpty()) {

            String Usuario_ReceptorPrivado = JOptionPane.showInputDialog(rootPane, "Escribe al usario al que le quieras mandar privado", "Cliente", HEIGHT);
            try {
                chatClient.enviarMensajePrivado(NombreUsuario, Usuario_ReceptorPrivado, txtMensaje.getText());
                limpiarArea();
            } catch (RemoteException ex) {
                Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txtAreaChat.setText("El usuario no escribio nada :(");
        }
    }//GEN-LAST:event_btnEnviarMensajePrivadoActionPerformed

    private void btnSalirChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirChatActionPerformed
        try {
            chatClient.CerrarCliente(NombreUsuario, txtAreaChat);
            btnEnviarMensajeGrupo.setEnabled(false);
            btnEnviarMensajePrivado.setEnabled(false);
            txtAreaChat.setEnabled(false);
            txtMensaje.setEnabled(false);
            this.dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalirChatActionPerformed

    private void limpiarArea() {
        txtMensaje.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UIChatRMI().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirServidor;
    private javax.swing.JButton btnEnviarMensajeGrupo;
    private javax.swing.JButton btnEnviarMensajePrivado;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnSalirChat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaChat;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
