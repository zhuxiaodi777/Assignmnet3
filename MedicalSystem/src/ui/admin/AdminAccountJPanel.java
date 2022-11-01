/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import static com.oracle.nio.BufferSecrets.instance;
import java.awt.Component;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static javax.management.Query.value;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import static jdk.nashorn.internal.objects.Global.instance;
import model.AdminHistory;
import model.AdminProfile;
import model.UserHistory;
import model.UserProfile;
import model.DoctorHistory;
import model.DoctorProfile;
import model.CommHistory;
import model.CommProfile;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Clark
 */
public class AdminAccountJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    AdminHistory adminHistory;
  AdminProfile admin;
   
    public AdminAccountJPanel(JPanel upc,AdminProfile ds) {
        initComponents();
        userProcessContainer = upc;

        admin= ds;
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPositionDate = new javax.swing.JLabel();
        jTxtPositionTitle = new javax.swing.JTextField();
        jName = new javax.swing.JLabel();
        jTxtName = new javax.swing.JTextField();
        jEmail = new javax.swing.JLabel();
        jTxtEmailAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jBTview = new javax.swing.JButton();
        jBTdelete = new javax.swing.JButton();
        jBTupdate = new javax.swing.JButton();
        jBTsearch = new javax.swing.JButton();
        jTxtSearch = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Account");

        jPositionDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPositionDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPositionDate.setText("Password");

        jTxtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPositionTitleActionPerformed(evt);
            }
        });

        jName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jName.setText("Name");

        jTxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameActionPerformed(evt);
            }
        });

        jEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jEmail.setText("EmailAddress");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "EmailAddress", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        jBTview.setText("View");
        jBTview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTviewActionPerformed(evt);
            }
        });

        jBTdelete.setText("Delete");
        jBTdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTdeleteActionPerformed(evt);
            }
        });

        jBTupdate.setText("Update");
        jBTupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTupdateActionPerformed(evt);
            }
        });

        jBTsearch.setText("Search");

        jTxtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTxtSearchMouseReleased(evt);
            }
        });
        jTxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSearchActionPerformed(evt);
            }
        });
        jTxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtSearchKeyReleased(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBTview)
                                .addGap(18, 18, 18)
                                .addComponent(jBTdelete)
                                .addGap(23, 23, 23)
                                .addComponent(jBTupdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPositionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)
                        .addComponent(jBTsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBTdelete, jBTview});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jEmail, jName, jPositionDate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTview)
                    .addComponent(jBTdelete)
                    .addComponent(jBTupdate)
                    .addComponent(jBTsearch)
                    .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jName)
                    .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmail)
                    .addComponent(jTxtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPositionDate))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(104, 104, 104))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jEmail, jName, jPositionDate});

    }// </editor-fold>//GEN-END:initComponents

    private void jTxtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPositionTitleActionPerformed

    private void jTxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNameActionPerformed




    private void jBTviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTviewActionPerformed
//        // TODO add your handling code here:
// DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
// int selectedRowIndex = tblEmployee.getSelectedRow();
//  if (selectedRowIndex < 0) {
//         JOptionPane.showMessageDialog(this,"Please select a row to view!!");
//         return;
//        }
//
//jTxtName.setText(model.getValueAt(selectedRowIndex,0).toString());
//jTxtAge.setText(model.getValueAt(selectedRowIndex,1).toString());
//jTxtEmployeeID.setText(model.getValueAt(selectedRowIndex,2).toString());
//jTxtCellPhone.setText(model.getValueAt(selectedRowIndex,3).toString());
//jTxtEmailAddress.setText(model.getValueAt(selectedRowIndex,4).toString());
//jTxtGender.setText(model.getValueAt(selectedRowIndex,5).toString());
//jTxtLevel.setText(model.getValueAt(selectedRowIndex,6).toString());
//jTxtTeamInfo.setText(model.getValueAt(selectedRowIndex,7).toString());
//jTxtStartDate.setText(model.getValueAt(selectedRowIndex,8).toString());
//jTxtPositionTitle.setText(model.getValueAt(selectedRowIndex,9).toString());
////jPhoto.setText(model.getValueAt(selectedRowIndex,10).toString());//get path
//Icon icon= new ImageIcon( (String) model.getValueAt(selectedRowIndex,10));
//lbl_img.setIcon(icon);
//lbl_img.setVisible(true);
////tblEmployee.getColumn("Photo").setCellRenderer(new myTableCellRenderer());
//


//Icon icon = new ImageIcon(model.getValueAt(selectedRowIndex,10).toString());
//lbl_img.setIcon(icon);
//lbl_img.setVisible(true);
//lbl_img.setText(model.getValueAt(selectedRowIndex,10).toString());


//jTxtLevel.setText(selectedEmp.getLevel());


    }//GEN-LAST:event_jBTviewActionPerformed

    private void jBTdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTdeleteActionPerformed
        // TODO add your handling code here:
 DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
      
    try{
      int selectedRowIndex = tblEmployee.getSelectedRow();
  if (selectedRowIndex < 0) {
         JOptionPane.showMessageDialog(this,"Please select a row to delete!!");
         return;
        }
      model.removeRow(selectedRowIndex);
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null,ex);
}
//System.out.println("===============00000==============");
//System.out.println(selectedRowIndex);   
//System.out.println(tblEmployee.getModel());
//System.out.println("===============11111==============");
//System.out.println((DefaultTableModel) tblEmployee.getModel());
//System.out.println("==============22222===============");
//System.out.println( tblEmployee.getModel().toString());
////System.out.println((Employee)model.getValueAt(selectedRowIndex, 0).toString());
//
//model.getValueAt(selectedRowIndex, 0).toString();
//System.out.println("==============333333333==============");
//System.out.println(model.getValueAt(selectedRowIndex, 0).toString());
//     Employee selectedEmp = (Employee)model.getValueAt(selectedRowIndex, 0);


      //history.deleteEmp(selectedEmp);
     JOptionPane.showMessageDialog(this,"The employee info has delete!!");
    // populateTable();
    }//GEN-LAST:event_jBTdeleteActionPerformed

    private void jBTupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTupdateActionPerformed
        // TODO add your handling code here:
//   int i = tblEmployee.getSelectedRow();
//DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
//  if (i>=  0) {
//
//           model.setValueAt(jTxtName.getText(),i,0);
//           model.setValueAt(jTxtAge.getText(),i,1);
//model.setValueAt(jTxtEmployeeID.getText(),i,2);
//model.setValueAt(jTxtCellPhone.getText(),i,3);
//model.setValueAt(jTxtEmailAddress.getText(),i,4);
//model.setValueAt(jTxtGender.getText(),i,5);
//model.setValueAt(jTxtLevel.getText(),i,6);
//model.setValueAt(jTxtTeamInfo.getText(),i,7);
//model.setValueAt(jTxtStartDate.getText(),i,8);
//model.setValueAt(jTxtPositionTitle.getText(),i,9);
//model.setValueAt(jPhoto.getText(),i,10);
////Icon icon = new ImageIcon(employee.getPhoto());
////lbl_img.setIcon(icon);
////model.setValueAt(lbl_img.getText(),i,10);
//
//
//
//}
//else{
//
//         JOptionPane.showMessageDialog(null,"error");
//
//        }
//




    }//GEN-LAST:event_jBTupdateActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        // TODO add your handling code here:
//DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
// int selectedRowIndex = tblEmployee.getSelectedRow();
//
//jTxtName.setText(model.getValueAt(selectedRowIndex,0).toString());
//jTxtAge.setText(model.getValueAt(selectedRowIndex,1).toString());
//jTxtEmployeeID.setText(model.getValueAt(selectedRowIndex,2).toString());
//jTxtCellPhone.setText(model.getValueAt(selectedRowIndex,3).toString());
//jTxtEmailAddress.setText(model.getValueAt(selectedRowIndex,4).toString());
//jTxtGender.setText(model.getValueAt(selectedRowIndex,5).toString());
//jTxtLevel.setText(model.getValueAt(selectedRowIndex,6).toString());
//jTxtTeamInfo.setText(model.getValueAt(selectedRowIndex,7).toString());
//jTxtStartDate.setText(model.getValueAt(selectedRowIndex,8).toString());
//jTxtPositionTitle.setText(model.getValueAt(selectedRowIndex,9).toString());

    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void jTxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSearchActionPerformed

    private void jTxtSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtSearchMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSearchMouseReleased

    private void jTxtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtSearchKeyReleased
        // TODO add your handling code here:
DefaultTableModel table =(DefaultTableModel) tblEmployee.getModel();
String search = jTxtSearch.getText().toLowerCase();
TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
tblEmployee.setRowSorter(tr);
tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_jTxtSearchKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

public void dispalyEmployee() {
DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
 int selectedRowIndex = tblEmployee.getSelectedRow();
//
//jTxtName.setText(model.getValueAt(selectedRowIndex,0).toString());
//jTxtAge.setText(model.getValueAt(selectedRowIndex,1).toString());
//jTxtEmployeeID.setText(model.getValueAt(selectedRowIndex,2).toString());
//jTxtCellPhone.setText(model.getValueAt(selectedRowIndex,3).toString());
//jTxtEmailAddress.setText(model.getValueAt(selectedRowIndex,4).toString());
//jTxtGender.setText(model.getValueAt(selectedRowIndex,5).toString());
//jTxtLevel.setText(model.getValueAt(selectedRowIndex,6).toString());
//jTxtTeamInfo.setText(model.getValueAt(selectedRowIndex,7).toString());
//jTxtStartDate.setText(model.getValueAt(selectedRowIndex,8).toString());
//jTxtPositionTitle.setText(model.getValueAt(selectedRowIndex,9).toString());
////Icon icon = new ImageIcon(model.getValueAt(selectedRowIndex,10).toString());
////Icon icon = new ImageIcon(employee.getPhoto());
//lbl_img.setIcon(icon);
//lbl_img.setVisible(true);
//System.out.println(model.getValueAt(selectedRowIndex,10).toString());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jBTdelete;
    private javax.swing.JButton jBTsearch;
    private javax.swing.JButton jBTupdate;
    private javax.swing.JButton jBTview;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jPositionDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtEmailAddress;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtPositionTitle;
    private javax.swing.JTextField jTxtSearch;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

//        DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
//        model.setRowCount(0);
//        for( Employee emp : history.getHistory()){
//
//           Object [] row = new  Object[11];
//            row[0] = emp.getName();
//            row[1] = emp.getAge();
//            row[2] = emp.getEmployeeID();
//            row[3] = emp.getCellPhonenumber();
//            row[4] = emp.getEmailAddress();
//            row[5] = emp.getGender();
//            row[6] = emp.getLevel();
//            row[7] = emp.getPositionTitle();
//            row[8] = emp.getStartDate();
//            row[9] = emp.getTeamInfo();
//            row[10] = emp.getPhoto();
//
//            model.addRow(row); 
//
//              }

        }


}