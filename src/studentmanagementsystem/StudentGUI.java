/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hambetn
 */
public class StudentGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentGUI
     */
    public StudentGUI() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        lblName = new javax.swing.JLabel();
        txtTestOne = new javax.swing.JTextField();
        lblTestTwo = new javax.swing.JLabel();
        lblTestThree = new javax.swing.JLabel();
        lblTestOne = new javax.swing.JLabel();
        txtTestTwo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtTestThree = new javax.swing.JTextField();
        btnDisplayAll = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaStudents = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Name");

        txtTestOne.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblTestTwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTestTwo.setText("Test 2");

        lblTestThree.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTestThree.setText("Test 3");

        lblTestOne.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTestOne.setText("Test 1");

        txtTestTwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtTestThree.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnDisplayAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDisplayAll.setText("Display All");
        btnDisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAllActionPerformed(evt);
            }
        });

        btnAddStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        txaStudents.setColumns(20);
        txaStudents.setRows(5);
        jScrollPane1.setViewportView(txaStudents);

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTestThree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTestThree, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTestTwo)
                                .addGap(47, 47, 47)
                                .addComponent(txtTestTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTestOne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTestOne, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnDisplayAll, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTestOne))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTestTwo))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTestThree)
                    .addComponent(txtTestThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStudent)
                    .addComponent(btnDisplayAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAllActionPerformed
        txaStudents.setText("Name" + "\t" + "Test 1" + "\t" + "Test 2" + "\t" + "Test 3" + "\t" + "Average" + "\t" + "Grade" + "\n");
        StudentDB db = new StudentDB();

        try {
            ArrayList<Student> data = db.getAll();
            DecimalFormat fmt = new DecimalFormat("0.0");
            for (int i = 0; i < data.size(); i++) {
                Student stu = data.get(i);
                txaStudents.append(stu.getName() + "\t" + stu.getTest1() + "\t" + stu.getTest2() + "\t"
                        + stu.getTest3() + "\t" + stu.calculateAverage() + "\t"
                        + stu.calculateLetterGrade()+"\n");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDisplayAllActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        //get student information
        String stuName = txtName.getText();
        double test1 = Double.parseDouble(txtTestOne.getText());
        double test2 = Double.parseDouble(txtTestTwo.getText());
        double test3 = Double.parseDouble(txtTestThree.getText());

        //create student object
        Student stu = new Student(0, stuName, test1, test2, test3);

        //add the student to the databse using the StudentID object
        StudentDB db = new StudentDB();
        try {
            db.add(stu);
            JOptionPane.showMessageDialog(this, "Record was written to the database.");
            //clear the form
            txtName.setText("");
            txtTestOne.setText("");
            txtTestTwo.setText("");
            txtTestThree.setText("");
            txtName.requestFocus(); //put cursor back on the name field
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error. Database driver not found.", "Driver Not Found", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error. Database driver not found." + ex, "Driver Not Found", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAddStudentActionPerformed
    }

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
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTestOne;
    private javax.swing.JLabel lblTestThree;
    private javax.swing.JLabel lblTestTwo;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextArea txaStudents;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTestOne;
    private javax.swing.JTextField txtTestThree;
    private javax.swing.JTextField txtTestTwo;
    // End of variables declaration//GEN-END:variables
}