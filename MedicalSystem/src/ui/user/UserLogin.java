/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui.user;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.DoctorHistory;
import model.DoctorProfile;
import model.UserHistory;
import model.UserProfile;

/**
 *
 * @author judy
 */
public class UserLogin extends javax.swing.JPanel {

    /** Creates new form UserLogin */
    JPanel userProcessContainer;
    UserHistory userHistory;
    UserProfile userprofile;
    DoctorHistory doctorhistory;
//    DoctorProfile doctorProfile;

    DoctorHistory doctorHistory;
    RecordHistory recordhistory;
    public UserLogin(JPanel upc,UserHistory uh, DoctorHistory ds) {
        initComponents();
        userProcessContainer=upc;
        userHistory = uh;
        doctorhistory=ds;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpwpass = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btntest = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnRegister1 = new javax.swing.JButton();

        jpwpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwpassActionPerformed(evt);
            }
        });

        lblName.setText("Email Address:");

        lblEmployeeId.setText("Password");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btntest.setText("test");
        btntest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntestActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UserLogin");
        lblTitle.setToolTipText("");

        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblEmployeeId))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpwpass, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btntest, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpwpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeId))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btntest, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpwpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwpassActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        //        double temperature = Double.parseDouble(txtName.getText());

        //        if (
            //            txtUserId.getText().length() == 0
            //            || txtEmail.getText().length() == 0
            //            //                || txtAge.getText().length() == 0
            //            //            || txtAge.getText().matches("^\\d{1,}$") == false
            //
            //        ) {
            //            JOptionPane.showMessageDialog(this, "Please enter the correct format");
            //            return;
            //        }

        String useremail = txtEmail.getText();
        String password = jpwpass.getText();
        if ((useremail.contains("1")) && (password.contains("1"))) {
            
            UserView uv = new UserView(userProcessContainer, doctorhistory,recordhistory);
            userProcessContainer.add("ManageSupplierAdministrative", uv);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtEmail.setText("");
            jpwpass.setText("");
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);

        }

        //        EmployeeProfile ep = history.addNewEmployee();
        //
        //        ep.setName(name);
        //        ep.setEmployeeId(employeeId);
        //        ep.setAge(age);
        //        ep.setGender(gender);
        //        ep.setStartDate(startDate);
        //        ep.setLevel(level);
        //        ep.setTeamInfo(teamInfo);
        //        ep.setPositionTitle(positionTitle);
        //        ep.setCellPhoneNumber(cellPhoneNumber);
        //        ep.setEmailAddress(emailAddress);
        //        ep.setPhoto(photo);
        //
        //        JOptionPane.showMessageDialog(this,"New Employee Profile added.");

        txtEmail.setText("");
        jpwpass.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btntestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntestActionPerformed
        // TODO add your handling code here:


        UserView1 uc = new UserView1(userProcessContainer, doctorHistory);
        userProcessContainer.add("ManageSupplierAdministrative", uc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btntestActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
        
        UserCreate uc = new UserCreate(userProcessContainer, userHistory);
        userProcessContainer.add("ManageSupplierAdministrative", uc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegister1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btntest;
    private javax.swing.JPasswordField jpwpass;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

}
