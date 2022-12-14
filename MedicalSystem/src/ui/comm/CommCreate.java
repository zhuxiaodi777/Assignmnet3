/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.comm;

import java.awt.CardLayout;
import ui.comm.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.CommProfile;
import model.CommHistory;

/**
 *
 * @author judy
 */
public class CommCreate extends javax.swing.JPanel {

    /**
     * Creates new form UserCreate1
     */
    CommHistory commHistory ;
    CommProfile commprofile;
    private JPanel userProcessContainer;
    public CommCreate(JPanel upc,CommHistory ch) {
       
        initComponents();
        
        commHistory= ch;
        userProcessContainer =upc;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblHospital = new javax.swing.JLabel();
        lblCommName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtCommID = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtCommName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCommId = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        Backbtn = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        lblHospital.setText("Hospital:");

        lblCommName.setText("CommName:");

        lblAddress.setText("Address:");

        lblPassword.setText("PassWord:");

        txtCommName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommNameActionPerformed(evt);
            }
        });

        btnSave.setText("Register");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Comm-Register here!!");
        lblTitle.setToolTipText("");

        lblCommId.setText("CommID:");

        lblEmailAddress.setText("EmailAddress:");

        Backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Backbtn.setText("<<Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblHospital)
                                    .addComponent(lblCommName)
                                    .addComponent(lblCommId))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCommName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCommID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblEmailAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(339, 339, 339))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(Backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtCommID, txtCommName, txtEmailAddress, txtHospital, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommName)
                    .addComponent(txtCommName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommId)
                    .addComponent(txtCommID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospital)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtCommID, txtCommName, txtEmailAddress, txtHospital, txtPassword});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //        double temperature = Double.parseDouble(txtName.getText());

//        if (
//            txtCommName.getText().length() == 0
//                        || txtCommID.getText().length() == 0
//                        || txtHospital.getText().matches("^\\d{1,}$") == false
//                        || txtAddress.getText().length() == 0
////                        || txtCellPhoneNumber.getText().matches("^\\d{2,}$") == false
//                        || txtEmailAddress.getText().length() == 0
//                        || txtPassword.getText().length() == 0         
//        ) {
//            JOptionPane.showMessageDialog(this, "Please enter the correct format");
//            return;
//        }
        
  String CommName=null;
        
        try{
            CommName=txtCommName.getText();
            char[] arr=CommName.toCharArray();
            if(arr.length==0){
                JOptionPane.showMessageDialog(this, "The name cannot be null!");
                return;
            }
            for(char c: arr){
                if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))){
                    JOptionPane.showMessageDialog(this, "The name should be alpha!");
                    return;
                }
            }
            for(CommProfile d:commHistory.getCommhistory()) {
                if (commprofile.getCommName().equals(CommName)) {
                    JOptionPane.showMessageDialog(this, "The name has been already been registered!");
                    return;
                }
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the format of the name!");
            return;
        }

 String CommID=null;
        try{
            CommID=txtCommID.getText();
            char[] arr=CommID.toCharArray();
            if(arr.length!=4){
                JOptionPane.showMessageDialog(this, "The ID length should be 4!");
                return;
            }
            if(CommID.matches("[0-9]*")==false){
                JOptionPane.showMessageDialog(this, "The ID should only be numbers!");
                return;
            }
            
            for(CommProfile d:commHistory.getCommhistory()) {
                if (commprofile.getCommId().equals(CommID)) {
                    JOptionPane.showMessageDialog(this, "The ID is already used by other registers!");
                    return;
                }
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the format of the name!");
            return;
        }


String hospital=null;
        try{
            hospital=txtHospital.getText();
           
            if(hospital.length()==0){
               JOptionPane.showMessageDialog(this, "Please input a hospital");
                return; 
            }
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the format!");
            return;
        }

String Address=null;
        try{
            Address=txtAddress.getText();
           
            if(Address.length()==0){
               JOptionPane.showMessageDialog(this, "Please input a hospital");
                return; 
            }
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the format!");
            return;
        }


 String EmailAddress=null;
        try{
            EmailAddress=txtEmailAddress.getText();
           
            if((EmailAddress.contains("@"))==false||EmailAddress.contains(".")==false){
               JOptionPane.showMessageDialog(this, "Please input a correct email!");
                return; 
            }
          
            for(CommProfile d:commHistory.getCommhistory()) {
                if (commprofile.getEmailAddress().equals(EmailAddress)) {
                    JOptionPane.showMessageDialog(this, "The email has already been registered!");
                    return;
                }
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the format!");
            return;
        }
String Password=null;
        try{
            Password=txtPassword.getText();
           
            if(Password.length()==0){
               JOptionPane.showMessageDialog(this, "Please input a password");
                return; 
            }
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the format!");
            return;
        }

        commprofile = commHistory.addProfile();
        
        commprofile.setCommName(txtCommName.getText());
        commprofile.setCommId(txtCommID.getText());
        commprofile.setHospital(txtHospital.getText());
        commprofile.setAddress(txtAddress.getText());
        commprofile.setEmailAddress(txtEmailAddress.getText());
        commprofile.setPassword(txtPassword.getText());

        JOptionPane.showMessageDialog(this,"Registered Successful");

        txtCommName.setText("");
        txtCommID.setText("");
        txtHospital.setText("");
        txtAddress.setText("");
        txtEmailAddress.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCommNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommNameActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton btnSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCommId;
    private javax.swing.JLabel lblCommName;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCommID;
    private javax.swing.JTextField txtCommName;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
