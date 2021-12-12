/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.view;

import javax.swing.SwingUtilities;

/**
 *
 * @author jasonpauldarivemula
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
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

        panel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        lbl_Title6 = new javax.swing.JLabel();
        btn_Immunization = new javax.swing.JButton();
        panel_HomeBtns = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_Title5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_Title3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_Title2 = new javax.swing.JLabel();
        btn_AddStudent = new javax.swing.JButton();
        btn_addClassroom = new javax.swing.JButton();
        btn_addTeacher = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_editclassroom = new javax.swing.JButton();
        txt_classroomId = new javax.swing.JTextField();
        lbl_Title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel_Title.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setToolTipText("");

        jLabel2.setToolTipText("");

        lbl_Title.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title.setText("NORTHEASTERN");
        lbl_Title.setToolTipText("");

        lbl_Title6.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl_Title6.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title6.setText("DAYCARE");
        lbl_Title6.setToolTipText("");

        btn_Immunization.setBackground(new java.awt.Color(234, 28, 44));
        btn_Immunization.setForeground(new java.awt.Color(255, 255, 255));
        btn_Immunization.setText("Immunization Alerts");
        btn_Immunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImmunizationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TitleLayout = new javax.swing.GroupLayout(panel_Title);
        panel_Title.setLayout(panel_TitleLayout);
        panel_TitleLayout.setHorizontalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TitleLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_TitleLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lbl_Title6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Immunization, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_TitleLayout.setVerticalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TitleLayout.createSequentialGroup()
                .addGroup(panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TitleLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Immunization))
                    .addGroup(panel_TitleLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addGroup(panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Title6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_HomeBtns.setBackground(new java.awt.Color(255, 255, 255));
        panel_HomeBtns.setForeground(new java.awt.Color(255, 255, 255));
        panel_HomeBtns.setPreferredSize(new java.awt.Dimension(1140, 473));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_Title5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbl_Title5.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title5.setText("Details about Daycare Members");
        lbl_Title5.setToolTipText("");

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enrolled Student");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_student_ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Employed Teacher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_teacher_employeedActionPerformed(evt);
            }
        });

        lbl_Title3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbl_Title3.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title3.setText("Information about Anniversaries");
        lbl_Title3.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Vaccination Anniversaries");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Employee Aniversaries");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Title3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Title5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Title3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_Title2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbl_Title2.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title2.setText("Add new entity");
        lbl_Title2.setToolTipText("");

        btn_AddStudent.setBackground(new java.awt.Color(0, 102, 255));
        btn_AddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddStudent.setText("+ Add New Student");
        btn_AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddStudentActionPerformed(evt);
            }
        });

        btn_addClassroom.setBackground(new java.awt.Color(0, 102, 255));
        btn_addClassroom.setForeground(new java.awt.Color(255, 255, 255));
        btn_addClassroom.setText("+ Add New Classroom");
        btn_addClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addClassroomActionPerformed(evt);
            }
        });

        btn_addTeacher.setBackground(new java.awt.Color(0, 102, 255));
        btn_addTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btn_addTeacher.setText("+ Add New Teacher");
        btn_addTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTeacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_AddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_addClassroom)
                        .addGap(71, 71, 71)
                        .addComponent(btn_addTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_AddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_editclassroom.setBackground(new java.awt.Color(0, 102, 255));
        btn_editclassroom.setForeground(new java.awt.Color(255, 255, 255));
        btn_editclassroom.setText("Edit");
        btn_editclassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editclassroomActionPerformed(evt);
            }
        });

        txt_classroomId.setText("Enter Classroom Id");
        txt_classroomId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_classroomIdActionPerformed(evt);
            }
        });

        lbl_Title1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbl_Title1.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_Title1.setText("Edit Classroom");
        lbl_Title1.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txt_classroomId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editclassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editclassroom)
                    .addComponent(txt_classroomId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_HomeBtnsLayout = new javax.swing.GroupLayout(panel_HomeBtns);
        panel_HomeBtns.setLayout(panel_HomeBtnsLayout);
        panel_HomeBtnsLayout.setHorizontalGroup(
            panel_HomeBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HomeBtnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_HomeBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_HomeBtnsLayout.setVerticalGroup(
            panel_HomeBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HomeBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_HomeBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_HomeBtnsLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_HomeBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_HomeBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ImmunizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImmunizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ImmunizationActionPerformed

    private void btn_AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddStudentActionPerformed
        // TODO add your handling code here:
        this.dispose();
        NewStudentForm newStudentForm = new NewStudentForm();
        newStudentForm.setVisible(true);
        newStudentForm.pack();
    }//GEN-LAST:event_btn_AddStudentActionPerformed

    private void btn_addTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTeacherActionPerformed
        // TODO add your handling code here:
         this.dispose();
        NewTeacherForm newTeacherForm = new NewTeacherForm();
        newTeacherForm.setVisible(true);
        newTeacherForm.pack();
    }//GEN-LAST:event_btn_addTeacherActionPerformed

    private void btn_addClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addClassroomActionPerformed
        // TODO add your handling code here:
        this.dispose();
        NewClassroomForm newClassroomForm = new NewClassroomForm();
        newClassroomForm.setVisible(true);
        newClassroomForm.pack();
    }//GEN-LAST:event_btn_addClassroomActionPerformed

    private void btn_editclassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editclassroomActionPerformed
        this.dispose();
        // TODO add your handling code here:
        String str = txt_classroomId.getText();
        EditClassroomForm edf = new EditClassroomForm(Integer.parseInt(str));
        edf.setVisible(true);
    }//GEN-LAST:event_btn_editclassroomActionPerformed

    private void txt_classroomIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_classroomIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_classroomIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        VaccinationAnniversaryForm vaf = new VaccinationAnniversaryForm();
        vaf.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void display_student_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_student_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EnrolledStudentsDisplay1 display = new EnrolledStudentsDisplay1();
        display.setVisible(true);
    }//GEN-LAST:event_display_student_ActionPerformed

    private void display_teacher_employeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_teacher_employeedActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EmployedTeacherDisplay display = new EmployedTeacherDisplay();
        display.setVisible(true);
    }//GEN-LAST:event_display_teacher_employeedActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddStudent;
    private javax.swing.JButton btn_Immunization;
    private javax.swing.JButton btn_addClassroom;
    private javax.swing.JButton btn_addTeacher;
    private javax.swing.JButton btn_editclassroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Title1;
    private javax.swing.JLabel lbl_Title2;
    private javax.swing.JLabel lbl_Title3;
    private javax.swing.JLabel lbl_Title5;
    private javax.swing.JLabel lbl_Title6;
    private javax.swing.JPanel panel_HomeBtns;
    private javax.swing.JPanel panel_Title;
    private javax.swing.JTextField txt_classroomId;
    // End of variables declaration//GEN-END:variables
}
