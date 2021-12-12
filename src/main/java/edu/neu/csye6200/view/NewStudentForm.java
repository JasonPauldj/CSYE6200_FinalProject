/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.controller.DBConnection;
import edu.neu.csye6200.objects.Student;
import edu.neu.csye6200.objects.CareTaker;
import edu.neu.csye6200.services.AgeGroupService;
import edu.neu.csye6200.services.CaretakerService;
import edu.neu.csye6200.services.StudentService;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author jasonpauldarivemula
 */
public class NewStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form NewStudentForm
     */
    public NewStudentForm() {
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

        btnGrp_gender = new javax.swing.ButtonGroup();
        btnGrp_parGender = new javax.swing.ButtonGroup();
        panel_Title = new javax.swing.JPanel();
        lbl_Logo = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        panel_student = new javax.swing.JPanel();
        lbl_FormTitle = new javax.swing.JLabel();
        lbl_firstName = new javax.swing.JLabel();
        lbl_lastName = new javax.swing.JLabel();
        txt_firstName = new javax.swing.JTextField();
        txt_lastName = new javax.swing.JTextField();
        lbl_gender = new javax.swing.JLabel();
        radBtn_male = new javax.swing.JRadioButton();
        radBtn_female = new javax.swing.JRadioButton();
        lbl_age = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        lbl_StudentId = new javax.swing.JLabel();
        txt_studentID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_address = new javax.swing.JTextArea();
        lbl_address = new javax.swing.JLabel();
        radBtn_Other = new javax.swing.JRadioButton();
        panel_parent = new javax.swing.JPanel();
        lbl_parFirstName = new javax.swing.JLabel();
        txt_parFirstName = new javax.swing.JTextField();
        lbl_lastName1 = new javax.swing.JLabel();
        txt_parLastame = new javax.swing.JTextField();
        lbl_gender1 = new javax.swing.JLabel();
        radBtn_parmale = new javax.swing.JRadioButton();
        radBtn_parfemale = new javax.swing.JRadioButton();
        lbl_StudentID1 = new javax.swing.JLabel();
        txt_phoneno = new javax.swing.JTextField();
        parbtn_Other = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Logo.setText("Logo");

        lbl_Title.setText("NORTHEASTERN DAYCARE");
        lbl_Title.setToolTipText("");

        javax.swing.GroupLayout panel_TitleLayout = new javax.swing.GroupLayout(panel_Title);
        panel_Title.setLayout(panel_TitleLayout);
        panel_TitleLayout.setHorizontalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TitleLayout.createSequentialGroup()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(lbl_Title)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_TitleLayout.setVerticalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Title))
        );

        panel_student.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Details"));

        lbl_FormTitle.setText("New Student Entry");

        lbl_firstName.setText("First Name :");

        lbl_lastName.setText("Last Name :");

        txt_firstName.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstNameActionPerformed(evt);
            }
        });

        txt_lastName.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastNameActionPerformed(evt);
            }
        });

        lbl_gender.setText("Gender :");

        btnGrp_gender.add(radBtn_male);
        radBtn_male.setText("Male");
        radBtn_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtn_maleActionPerformed(evt);
            }
        });

        btnGrp_gender.add(radBtn_female);
        radBtn_female.setText("Female");

        lbl_age.setText("Age :");

        txt_age.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        lbl_StudentId.setText("Student ID :");

        txt_studentID.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_studentIDActionPerformed(evt);
            }
        });

        txtArea_address.setColumns(20);
        txtArea_address.setRows(3);
        jScrollPane1.setViewportView(txtArea_address);

        lbl_address.setText("Address :");

        btnGrp_gender.add(radBtn_Other);
        radBtn_Other.setSelected(true);
        radBtn_Other.setText("Other");

        javax.swing.GroupLayout panel_studentLayout = new javax.swing.GroupLayout(panel_student);
        panel_student.setLayout(panel_studentLayout);
        panel_studentLayout.setHorizontalGroup(
            panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_studentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_FormTitle)
                .addGap(192, 192, 192))
            .addGroup(panel_studentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_studentLayout.createSequentialGroup()
                        .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_firstName)
                            .addComponent(lbl_gender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_studentLayout.createSequentialGroup()
                                .addComponent(radBtn_male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radBtn_female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radBtn_Other)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_studentLayout.createSequentialGroup()
                                .addComponent(lbl_lastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_studentLayout.createSequentialGroup()
                                .addComponent(lbl_age)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_studentLayout.createSequentialGroup()
                        .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_StudentId)
                            .addComponent(lbl_address))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_studentLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_studentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_studentLayout.setVerticalGroup(
            panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_studentLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_FormTitle)
                .addGap(18, 18, 18)
                .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_firstName)
                    .addComponent(lbl_lastName)
                    .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender)
                    .addComponent(radBtn_male)
                    .addComponent(radBtn_female)
                    .addComponent(lbl_age)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radBtn_Other))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StudentId)
                    .addComponent(txt_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_address)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        panel_parent.setBorder(javax.swing.BorderFactory.createTitledBorder("Parent"));

        lbl_parFirstName.setText("First Name :");

        txt_parFirstName.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_parFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_parFirstNameActionPerformed(evt);
            }
        });

        lbl_lastName1.setText("Last Name :");

        txt_parLastame.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_parLastame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_parLastameActionPerformed(evt);
            }
        });

        lbl_gender1.setText("Gender :");

        btnGrp_parGender.add(radBtn_parmale);
        radBtn_parmale.setText("Male");
        radBtn_parmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtn_parmaleActionPerformed(evt);
            }
        });

        btnGrp_parGender.add(radBtn_parfemale);
        radBtn_parfemale.setText("Female");

        lbl_StudentID1.setText("Phone No :");

        txt_phoneno.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phonenoActionPerformed(evt);
            }
        });

        btnGrp_parGender.add(parbtn_Other);
        parbtn_Other.setText("Other");
        parbtn_Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parbtn_OtherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_parentLayout = new javax.swing.GroupLayout(panel_parent);
        panel_parent.setLayout(panel_parentLayout);
        panel_parentLayout.setHorizontalGroup(
            panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_parentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_parentLayout.createSequentialGroup()
                        .addComponent(lbl_StudentID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_parentLayout.createSequentialGroup()
                        .addGroup(panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_parFirstName)
                            .addComponent(lbl_gender1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_parentLayout.createSequentialGroup()
                                .addComponent(radBtn_parmale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radBtn_parfemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parbtn_Other)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_parentLayout.createSequentialGroup()
                                .addComponent(txt_parFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_lastName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_parLastame, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panel_parentLayout.setVerticalGroup(
            panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_parentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_parFirstName)
                    .addComponent(lbl_lastName1)
                    .addComponent(txt_parFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_parLastame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender1)
                    .addComponent(radBtn_parmale)
                    .addComponent(radBtn_parfemale)
                    .addComponent(parbtn_Other))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StudentID1)
                    .addComponent(txt_phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(btn_add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_add)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstNameActionPerformed

    private void txt_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastNameActionPerformed

    private void radBtn_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtn_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtn_maleActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        
        String parfirstName = txt_parFirstName.getText().trim();
        String parlastName = txt_parLastame.getText().trim();
        
        String pargender="";
        
        String address = txtArea_address.getText().trim();
        
        String phone = txt_phoneno.getText().trim();
        
        if(radBtn_parmale.isSelected())
            pargender="Male";
        else if(parbtn_Other.isSelected())
            pargender="Other";
        else
            pargender="Female";
        
        CareTaker caretaker = new CareTaker(address,phone,parfirstName, parlastName, pargender);
        int caretakerId= CaretakerService.insertCaretaker(caretaker);
      
        
        String firstName = txt_firstName.getText().trim();
        String lastName = txt_lastName.getText().trim();
        
        String gender="";
        
        int age = Integer.parseInt(txt_age.getText().trim());
        
        if(radBtn_male.isSelected())
            gender="Male";
        else if(radBtn_Other.isSelected())
            gender="Other";
        else
            gender="Female";
        
        int assignedGroupID = AgeGroupService.groupAvailability(age);
        if(assignedGroupID == -1){
            // TO BE IMPLEMENTED. POP UP WINDOW MENTIONING THAT THERE IS NO SPACE FOR STUDENT IN ANY EXISTING GROUP
            return;
        }
//        String registrationDate = DateTimeFormatter.ofPattern("yyyy/dd/MM").toString();
//        System.out.println(registrationDate);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();  
        String registrationDate = dtf.format(now);  
        System.out.println(registrationDate);
        
        Student st = new Student(age, address, phone, registrationDate, firstName,lastName, gender,caretakerId,assignedGroupID);
        
        StudentService.insertStudent(st);
        
        JOptionPane.showMessageDialog(this, "Student was added succesfully");
        
        this.dispose();
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_studentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_studentIDActionPerformed

    private void txt_parFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_parFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_parFirstNameActionPerformed

    private void txt_parLastameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_parLastameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_parLastameActionPerformed

    private void radBtn_parmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtn_parmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtn_parmaleActionPerformed

    private void txt_phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phonenoActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeFrame homeframe = new HomeFrame();
        homeframe.setVisible(true);
        homeframe.pack();
    }//GEN-LAST:event_btn_backActionPerformed

    private void parbtn_OtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parbtn_OtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parbtn_OtherActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewStudentForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrp_gender;
    private javax.swing.ButtonGroup btnGrp_parGender;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_FormTitle;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_StudentID1;
    private javax.swing.JLabel lbl_StudentId;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_gender1;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_lastName1;
    private javax.swing.JLabel lbl_parFirstName;
    private javax.swing.JPanel panel_Title;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JPanel panel_student;
    private javax.swing.JRadioButton parbtn_Other;
    private javax.swing.JRadioButton radBtn_Other;
    private javax.swing.JRadioButton radBtn_female;
    private javax.swing.JRadioButton radBtn_male;
    private javax.swing.JRadioButton radBtn_parfemale;
    private javax.swing.JRadioButton radBtn_parmale;
    private javax.swing.JTextArea txtArea_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JTextField txt_parFirstName;
    private javax.swing.JTextField txt_parLastame;
    private javax.swing.JTextField txt_phoneno;
    private javax.swing.JTextField txt_studentID;
    // End of variables declaration//GEN-END:variables
}
