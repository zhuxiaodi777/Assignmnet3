/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import ui.comm.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
/**
 *
 * @author Clark
 */
public class ComJPanel extends javax.swing.JPanel {

//import java.awt.Toolkit;
//import java.awt.event.WindowEvent;
//import javax.swing.JOptionPane;


    /**
     * Creates new form ComJPanel
     */
    public ComJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUsernameField = new javax.swing.JTextField();
        jUsername = new javax.swing.JLabel();
        jPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBTcancel = new javax.swing.JButton();
        jBTlogin = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        jUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameFieldActionPerformed(evt);
            }
        });

        jUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jUsername.setText("Username : ");

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPassword.setText("Password : ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login  Here !!");

        jBTcancel.setText("Cancel");
        jBTcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTcancelActionPerformed(evt);
            }
        });

        jBTlogin.setText("Login in");
        jBTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jUsernameField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTlogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jBTcancel))
                    .addComponent(jPasswordField))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTlogin)
                    .addComponent(jBTcancel))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameFieldActionPerformed

    private void jBTcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTcancelActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jBTcancelActionPerformed

    private void jBTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTloginActionPerformed
        // TODO add your handling code here:

String password = jPasswordField.getText();
String username = jUsernameField.getText();
//
if(password.contains("admin123") && username.contains("admin123"))

{
jPasswordField.setText("");
jUsernameField.setText("");
JOptionPane.showMessageDialog(this,"Login successfully!! Welcome back!!");
//close();
//welcome w =new welcome();
//w.setVisible(true);

}
else {
//JOptionPane.showMessageDialog(null,"username or password is wrong,please input right one","wrong pass",JOptionPane,ERROR_MESSAGE);
JOptionPane.showMessageDialog(null,"username or password is wrong,please input right one");
jPasswordField.setText("");
jUsernameField.setText("");
}






    }//GEN-LAST:event_jBTloginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTcancel;
    private javax.swing.JButton jBTlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jPassword;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jUsername;
    private javax.swing.JTextField jUsernameField;
    // End of variables declaration//GEN-END:variables
}
