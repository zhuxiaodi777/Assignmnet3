/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.user;

import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.UserHistory;
import model.DoctorHistory;
import model.DoctorProfile;
import model.UserProfile;

/**
 *
 * @author judy
 */
public class UserView extends javax.swing.JPanel {

    /**
     * Creates new form UserView
     */
    JPanel userProcessContainer;
    UserHistory userHistory;
    DoctorHistory doctorHistory;
    private DefaultTableModel model;
    Order currentOrder;
    MasterOrderList masterOrderList;
    RecordHistory recordhistory;
    
    public UserView(JPanel upc,DoctorHistory ds,RecordHistory rh, Order oh) {
        initComponents();
        userProcessContainer = upc;
        //doctorHistory= doctorHistory;
        doctorHistory= ds;
//        this.doctorProfile= doctorProfile;
        currentOrder= oh;
        recordhistory= rh;
        
        populateTable();
        populateCartTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        cmbsearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUserRecord = new javax.swing.JTable();
        jbtRecordDate = new javax.swing.JButton();
        txtRecordDate = new javax.swing.JTextField();
        jbtDelete = new javax.swing.JButton();
        txtUpdateDate = new javax.swing.JTextField();
        jbtUpdateDate = new javax.swing.JButton();
        jbtDone = new javax.swing.JButton();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor_Name", "community", "city", "hospital", "email", "specialty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        cmbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor_Name", "community", "city", "hospital", "email", "specialty" }));
        cmbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel2.setText("search");

        tblUserRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor_Name", "community", "city", "hospital", "email", "specialty", "RecordDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserRecordMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUserRecord);

        jbtRecordDate.setText("RecordDate");
        jbtRecordDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecordDateActionPerformed(evt);
            }
        });

        txtRecordDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecordDateActionPerformed(evt);
            }
        });

        jbtDelete.setText("Delete");
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        jbtUpdateDate.setText("UpdateDate");
        jbtUpdateDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateDateActionPerformed(evt);
            }
        });

        jbtDone.setText("done");
        jbtDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtUpdateDate)
                        .addGap(18, 18, 18)
                        .addComponent(jbtDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtDone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRecordDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtRecordDate)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtRecordDate)
                    .addComponent(txtRecordDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtUpdateDate)
                        .addComponent(jbtDone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void tblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorMouseClicked
        // TODO add your handling code here:
        //鼠标点击选中表格中一行信息可像是在文本字段中。
//        DefaultTableModel model=(DefaultTableModel) tblDoctor.getModel();
//        //定义变量row为鼠标点击的行数。
//        int row=tblDoctor.getSelectedRow();
        //函数getValueAt返回要查询的行和列处单元格的属性值

        
//        txtName.setText(model.getValueAt(row, 0).toString());
//        txtEmployeeId.setText(model.getValueAt(row, 1).toString());
//        txtAge.setText(model.getValueAt(row, 2).toString());
//        txtGender.setText(model.getValueAt(row, 3).toString());
//        txtStartDate.setText(model.getValueAt(row, 4).toString());
//        txtLevel.setText(model.getValueAt(row, 5).toString());
//        txtTeamInfo.setText(model.getValueAt(row, 6).toString());
//        txtPositionTitle.setText(model.getValueAt(row, 7).toString());
//        txtCellPhoneNumber.setText(model.getValueAt(row, 8).toString());
//        txtEmailAddress.setText(model.getValueAt(row, 9).toString());
//        txtPhoto.setText(model.getValueAt(row, 10).toString());

//        ImageIcon icon = new ImageIcon(txtPhoto.getText());
//        Image image = icon.getImage();
//        lblPhoto.setIcon(icon);

    }//GEN-LAST:event_tblDoctorMouseClicked

    private void cmbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbsearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String ss = txtSearch.getText();
        search(ss);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblUserRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUserRecordMouseClicked

    private void txtRecordDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecordDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecordDateActionPerformed

    private void jbtRecordDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecordDateActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Please check doctor document");
            return;
        }
        DoctorProfile doctorProfile = (DoctorProfile) tblDoctor.getValueAt(selectedRowIndex, 0);
        String RecordDate;
        
        try {
            
            RecordDate = txtRecordDate.getText();

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this," Wrong Date");
            return;
        }

        OrderItem item = currentOrder.findDoctor(doctorProfile);
        
        if (item == null ){
            currentOrder.addNewOrderItem(doctorProfile,RecordDate);
        }
        else {
                if(item.getDoctorProfile().getName() == null){
                    JOptionPane.showMessageDialog(this,"");
                    return;
                }
                
//                item.getDoctorProfile().setName(item.getDoctorProfile().getName());
//                item.getDoctorProfile().getName();
//                item.setRecordDate(RecordDate);
            
                }
        populateTable();
        populateCartTable();
    }//GEN-LAST:event_jbtRecordDateActionPerformed

    private void jbtUpdateDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateDateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblUserRecord.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"please check doctor table");
            return;
        }
        OrderItem item = (OrderItem) tblUserRecord.getValueAt(selectedRowIndex, 0);
        String RecordDate;
        RecordDate = txtUpdateDate.getText();
//        item.getDoctorProfile();
        item.setRecordDate(RecordDate);
        populateCartTable();
        
    }//GEN-LAST:event_jbtUpdateDateActionPerformed

    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblUserRecord.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"please check doctor table");
            return;
        }
        OrderItem item = (OrderItem) tblUserRecord.getValueAt(selectedRowIndex, 0);
        
//        item.getDoctorProfile();
        currentOrder.deleteItem(item);
        populateCartTable();
    }//GEN-LAST:event_jbtDeleteActionPerformed

    private void jbtDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDoneActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = tblUserRecord.getSelectedRow();
        OrderItem item = (OrderItem) tblUserRecord.getValueAt(selectedRowIndex, 0);
//        DoctorProfile doctorProfile = (DoctorProfile) tblUserRecord.getValueAt(selectedRowIndex, 0);
//        OrderItem item = currentOrder.findDoctor(doctorProfile);
//        masterOrderList.addNewOrder(currentOrder);
//        currentOrder = new Order();
//        JOptionPane.showMessageDialog(this,"Record finished");

//        DefaultTableModel model = (DefaultTableModel) tblUserRecord.getModel();
//        int row=tblUserRecord.getSelectedRow();
        Record record = recordhistory.addrecord();
//        
        record.setName(item.getDoctorProfile().getName());
        record.setID(item.getDoctorProfile().getID());
        record.setCommunity(item.getDoctorProfile().getCommunity());
        record.setCity(item.getDoctorProfile().getCity());
        record.setHospital(item.getDoctorProfile().getHospital());
        record.setEmail(item.getDoctorProfile().getEmail());
        record.setSpecialty(item.getDoctorProfile().getSpecialty());
        record.setPhoto(item.getDoctorProfile().getPhoto());
        record.setRecordDate(item.getRecordDate());
        
//        ep.setCommunity(model.getValueAt(row, 1).toString());
//        ep.setCity(model.getValueAt(row, 2).toString());
//        ep.setHospital(model.getValueAt(row, 3).toString());
//        ep.setEmail(model.getValueAt(row, 4).toString());
//        ep.setSpecialty(model.getValueAt(row, 5).toString());
//        ep.setRecordDate(model.getValueAt(row, 6).toString());
        
        
        
        
    }//GEN-LAST:event_jbtDoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtDone;
    private javax.swing.JButton jbtRecordDate;
    private javax.swing.JButton jbtUpdateDate;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblUserRecord;
    private javax.swing.JTextField txtRecordDate;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUpdateDate;
    // End of variables declaration//GEN-END:variables

    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
        
        for (DoctorProfile ep : doctorHistory.getDoctorhistory()){
            Object[] row = new Object[6]; 
            //        private String name;
            row[0] = ep;
//            row[1] = ep.getName();
            row[1] = ep.getCommunity();
            row[2] = ep.getCity();
            row[3] = ep.getHospital();
            row[4] = ep.getEmail();
            row[5] = ep.getSpecialty();
            
            model.addRow(row);
        }
            
        }
    
    
    
    private void populateCartTable(){
        DefaultTableModel model = (DefaultTableModel) tblUserRecord.getModel();
        model.setRowCount(0);
//        cmb  
        for (OrderItem ep :currentOrder.getOrderItemlist()) {
            Object[] row = new Object[7];
            
            row[0] = ep;
//            row[2] = ep.getDoctorProfile().getName();
            row[1] = ep.getDoctorProfile().getCommunity();
            row[2] = ep.getDoctorProfile().getCity();
            row[3] = ep.getDoctorProfile().getHospital();
            row[4] = ep.getDoctorProfile().getEmail();
            row[5] = ep.getDoctorProfile().getSpecialty();
            row[6] = ep.getRecordDate();
            model.addRow(row);
        }
        
        
     }   
    
    public void search (String str){
        
        model = (DefaultTableModel) tblDoctor.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tblDoctor.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str,cmbsearch.getSelectedIndex()));
    }
}
