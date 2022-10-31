/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import doctor.UI.DoctorLoginJPanel;
import java.awt.CardLayout;
import model.DoctorHistory;
import model.DoctorProfile;
import model.UserHistory;
import ui.comm.CommJPanel;
import ui.admin.AdminJPanel;
//import model.SupplierDirectory;
//import ui.AdminRole.AdminWorkAreaJPanel;
import ui.user.UserLogin;

/**
 *
 * @author archil
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
//    SupplierDirectory supplierDirectory;
    UserHistory userHistory;
    DoctorHistory doctorDirectory;
    DoctorProfile doctor;
    
    
    public MainJFrame() {
        initComponents();
        doctor = new DoctorProfile();
        doctorDirectory= new DoctorHistory();
        userHistory=new UserHistory();

//        setSize(830,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnCommAdmin = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab 5 Skeleton");

        splitPane.setDividerLocation(150);
        splitPane.setOpaque(false);

        btnCommAdmin.setText("CommAdmin");
        btnCommAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommAdminActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnUser.setText("User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnAdmin.setText("Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCommAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommAdmin, btnDoctor});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnDoctor)
                .addGap(18, 18, 18)
                .addComponent(btnUser)
                .addGap(18, 18, 18)
                .addComponent(btnCommAdmin)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCommAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommAdminActionPerformed
  CommJPanel commJPanel  = new  CommJPanel();
// //ViewJPanel viewJPanel  = new  ViewJPanel(emp);
//      
splitPane.setRightComponent(commJPanel);
//      UserLogin userlogin = new UserLogin(userProcessContainer, userHistory);
//        userProcessContainer.add("UserLogin", userlogin);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, supplierDirectory);
//        userProcessContainer.add("AdminWorkAreaJPanel",awajp);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCommAdminActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed

        DoctorLoginJPanel ls = new DoctorLoginJPanel(userProcessContainer,doctorDirectory);
        userProcessContainer.add("DoctorLoginJPanel", ls);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        UserLogin userlogin = new UserLogin(userProcessContainer, userHistory, doctorDirectory);
        userProcessContainer.add("UserLogin", userlogin);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
  AdminJPanel adminJPanel  = new  AdminJPanel();
// //ViewJPanel viewJPanel  = new  ViewJPanel(emp);
//      
splitPane.setRightComponent(adminJPanel);


    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCommAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnUser;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
