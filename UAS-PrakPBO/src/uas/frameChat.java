/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hasby
 */
public class frameChat extends javax.swing.JFrame implements Runnable{
    Socket client; //class socket
    ServerSocket server;
    BufferedReader Server_Reader, Clien_Reader; //class bufer read String
    BufferedWriter Server_Writer, Client_Writer;
    private static Connection koneksi; //Koneksi
    /**
     * Creates new form frameChat
     */
    public frameChat() {
        initComponents();
    }
    
    public void tampilkandata() {
    
    try {
        buka_koneksi();
        String sql = "select * from pesan";
        Statement stat = koneksi.createStatement();
        ResultSet res = stat.executeQuery(sql);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+e.getMessage());
    }

}
    
    private static Connection buka_koneksi() {
    
        if (koneksi==null) {
            try {
                String url="jdbc:mysql://localhost:3306/uaspbo"; 
                String user="root"; //user mysql
                String password=""; //password mysql
               
                koneksi=DriverManager.getConnection(url,user,password);
                
            }catch (SQLException t) {
                JOptionPane.showMessageDialog(null,"Terjadi kesalahan "+t.getMessage());
            }
        }
     return koneksi;
     
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jBon = new javax.swing.JButton();
        jCBserver = new javax.swing.JComboBox<>();
        jTusername = new javax.swing.JTextField();
        Lchat = new java.awt.List();
        jTchat = new javax.swing.JTextField();
        jBsend = new javax.swing.JButton();
        jBon1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBon.setText("ON");
        jBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBonActionPerformed(evt);
            }
        });

        jCBserver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SERVER", "CLIENT" }));
        jCBserver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBserverItemStateChanged(evt);
            }
        });
        jCBserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBserverActionPerformed(evt);
            }
        });

        jTusername.setText("Username");

        Lchat.setBackground(new java.awt.Color(220, 209, 179));
        Lchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LchatActionPerformed(evt);
            }
        });

        jTchat.setText("Text Message");
        jTchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTchatActionPerformed(evt);
            }
        });

        jBsend.setText("Send");
        jBsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsendActionPerformed(evt);
            }
        });

        jBon1.setText("BACK");
        jBon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBon1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("@Kelompok2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBon1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTusername)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBsend)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addComponent(Lchat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTusername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBon1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lchat, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void client_connection(){
        try {
            String ip = JOptionPane.showInputDialog("Masukan IP Address: ");
            client = new Socket(ip,2000);
            jCBserver.setEnabled(false);
            Server_Reader = new BufferedReader (new InputStreamReader (client.getInputStream()));
            Server_Writer = new BufferedWriter (new OutputStreamWriter (client.getOutputStream()));
            jBon.setText("DISCONNECT");
        } catch (UnknownHostException ex) {
            System.out.println("Accept Failed");
            System.exit(-1);
        } catch (IOException ex) {
            Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void read_connection(){
        try{
            try{
                try{
                    server = new ServerSocket(2000);
                    this.setTitle("Please Wait...");
                } catch (IOException ex) {
                    System.out.println("Accept Failed");
                    System.exit(-1);
                }
                client = server.accept();
                this.setTitle("CONNECTED " + client.getInetAddress());
            } catch (IOException ex) {
                System.out.println("Accept Failed");
                System.exit(-1);
            }
            Server_Reader = new BufferedReader (new InputStreamReader(client.getInputStream()));
            Server_Writer = new BufferedWriter (new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException ex) {
            System.out.println("Read Failed");
            System.exit(-1);
        }
    }
    
    private void disconnected_by_client(){
        try {
            client.close();
            Server_Reader.close();
            Server_Writer.close();
            jCBserver.setEnabled(true);
            jBon.setText("CONNECT");
        } catch (IOException ex) {
            Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void stopped_by_server(){
        try {
            Server_Reader.close();
            Server_Writer.close();
            jBon.setText("ON");
            setTitle("DISCONNECT");
        } catch (IOException ex) {
            Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBonActionPerformed
     if (jBon.getText().equals("CONNECT")) {
         jBon.setText("DISCONNECT");
         client_connection();
         Thread thread = new Thread(this);
         thread.start();
     } else if (jCBserver.getSelectedItem().equals("SERVER")) {
        jBon.setText("OFF");
        read_connection();
        Thread thread = new Thread(this);
        thread.start();
    }
    }//GEN-LAST:event_jBonActionPerformed

    private void jBsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsendActionPerformed
       if((jTusername.getText().equals(""))||(jTchat.getText().equals("")))
            {
                JOptionPane.showMessageDialog(jBsend, "Pesan Kosong", "INFORMASI", WIDTH, null);
            }
            else 
            {
                Connection c = buka_koneksi(); //panggil function koneksi
         String sqlkode="Insert into pesan(username,pesan) values ('"+this.jTusername.getText()+","+this.jTchat.getText()+"')";
            try {   try ( //jalankan query tersebut
                    PreparedStatement p2 = (PreparedStatement) c.prepareStatement(sqlkode)) {
                p2.executeUpdate();
                    }
               
               //tampilkan data
                tampilkandata();
                jTusername.setText("");
                jTchat.setText("");
                
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+ex.getMessage());
            }
            }
    }//GEN-LAST:event_jBsendActionPerformed

    private void jCBserverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBserverItemStateChanged
       if (jCBserver.getSelectedItem().equals("SERVER")) {
           jBon.setText("ON");
           jTusername.setText("SERVER");
       } else {
           jBon.setText("CONNECT");
           jTusername.setText("CLIENT");
       }
    }//GEN-LAST:event_jCBserverItemStateChanged

    private void jCBserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBserverActionPerformed

    private void jBon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBon1ActionPerformed
    dispose();
    }//GEN-LAST:event_jBon1ActionPerformed

    private void LchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LchatActionPerformed

    private void jTchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTchatActionPerformed

    
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
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List Lchat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jBon;
    private javax.swing.JButton jBon1;
    private javax.swing.JButton jBsend;
    private javax.swing.JComboBox<String> jCBserver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTchat;
    private javax.swing.JTextField jTusername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       while (true) {
        try{
            Lchat.add(Server_Reader.readLine());
        } catch (IOException ex) {
            Logger.getLogger(frameChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
}
