/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.objects.AgeGroupEnum;
import edu.neu.csye6200.objects.Teacher;
import edu.neu.csye6200.services.TeacherService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author jasonpauldarivemula
 */
public class NewTeacherForm extends javax.swing.JFrame {
    private AgeGroupEnum[] ageGroups = AgeGroupEnum.values();
    
    /**
     * Creates new form NewTeacherForm
     */
    public NewTeacherForm() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        panel_Title = new javax.swing.JPanel();
        lbl_Title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_teacherForm = new javax.swing.JPanel();
        lbl_firstName = new javax.swing.JLabel();
        txt_firstName = new javax.swing.JTextField();
        lbl_lastName = new javax.swing.JLabel();
        txt_lastName = new javax.swing.JTextField();
        lbl_gender = new javax.swing.JLabel();
        radBtn_male = new javax.swing.JRadioButton();
        radBtn_female = new javax.swing.JRadioButton();
        radbtn_Others = new javax.swing.JRadioButton();
        combo_month = new javax.swing.JComboBox<>();
        combo_day = new javax.swing.JComboBox<>();
        combo_year = new javax.swing.JComboBox<>();
        Date = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1168, 687));

        panel_Title.setBackground(new java.awt.Color(245, 217, 213));
        panel_Title.setPreferredSize(new java.awt.Dimension(1168, 709));

        lbl_Title.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        lbl_Title.setText("NORTHEASTERN ");
        lbl_Title.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(234, 28, 44));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/jasonpauldarivemula/NetBeansProjects/daycare/src/main/java/edu/neu/csye6200/view/resources/mainlogo.png")); // NOI18N
        jLabel4.setText("Main Logo");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel5.setText("DAYCARE");

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/jasonpauldarivemula/NetBeansProjects/daycare/src/main/java/edu/neu/csye6200/view/resources/c.jpeg")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout panel_TitleLayout = new javax.swing.GroupLayout(panel_Title);
        panel_Title.setLayout(panel_TitleLayout);
        panel_TitleLayout.setHorizontalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TitleLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_TitleLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Title)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        panel_TitleLayout.setVerticalGroup(
            panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panel_TitleLayout.createSequentialGroup()
                        .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(245, 217, 213));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Instructions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panel_teacherForm.setBackground(new java.awt.Color(245, 217, 213));

        lbl_firstName.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_firstName.setText("First Name :");

        txt_firstName.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstNameActionPerformed(evt);
            }
        });

        lbl_lastName.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_lastName.setText("Last Name :");

        txt_lastName.setPreferredSize(new java.awt.Dimension(10, 25));
        txt_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastNameActionPerformed(evt);
            }
        });

        lbl_gender.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_gender.setText("Gender :");

        buttonGroup1.add(radBtn_male);
        radBtn_male.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        radBtn_male.setText("Male");
        radBtn_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtn_maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radBtn_female);
        radBtn_female.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        radBtn_female.setText("Female");

        buttonGroup1.add(radbtn_Others);
        radbtn_Others.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        radbtn_Others.setText("Other");
        radbtn_Others.setToolTipText("");
        radbtn_Others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbtn_OthersActionPerformed(evt);
            }
        });

        combo_month.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        combo_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "November", "December" }));
        combo_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_monthActionPerformed(evt);
            }
        });

        combo_day.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        combo_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        combo_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_dayActionPerformed(evt);
            }
        });

        combo_year.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        combo_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        combo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_yearActionPerformed(evt);
            }
        });

        Date.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        Date.setText("Date");
        Date.setToolTipText("");

        btn_add.setBackground(new java.awt.Color(51, 153, 255));
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add Teacher");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("ADD NEW TEACHER");

        javax.swing.GroupLayout panel_teacherFormLayout = new javax.swing.GroupLayout(panel_teacherForm);
        panel_teacherForm.setLayout(panel_teacherFormLayout);
        panel_teacherFormLayout.setHorizontalGroup(
            panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_teacherFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_teacherFormLayout.createSequentialGroup()
                        .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add)
                            .addComponent(jLabel1)
                            .addComponent(lbl_gender))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_teacherFormLayout.createSequentialGroup()
                        .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date)
                            .addGroup(panel_teacherFormLayout.createSequentialGroup()
                                .addComponent(lbl_firstName)
                                .addGap(34, 34, 34)
                                .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_teacherFormLayout.createSequentialGroup()
                                        .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(lbl_lastName)
                                        .addGap(85, 85, 85)
                                        .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_teacherFormLayout.createSequentialGroup()
                                        .addComponent(radBtn_male)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtn_female)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radbtn_Others))
                                    .addGroup(panel_teacherFormLayout.createSequentialGroup()
                                        .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(262, Short.MAX_VALUE))))
        );
        panel_teacherFormLayout.setVerticalGroup(
            panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_teacherFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_firstName)
                    .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_lastName)
                    .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender)
                    .addComponent(radBtn_male)
                    .addComponent(radBtn_female)
                    .addComponent(radbtn_Others))
                .addGap(28, 28, 28)
                .addGroup(panel_teacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_teacherForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1451, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_teacherForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String firstName = txt_firstName.getText().trim();
        String lastName = txt_lastName.getText().trim();
        
//        String group = (String)jCb_agegroup.getSelectedItem();
//        AgeGroupEnum selectedGroup=null;
//        
//        for(AgeGroupEnum ageGroup : AgeGroupEnum.values())
//        {
//            if(group.equals(ageGroup.getAgeGroupName())){
//                selectedGroup=ageGroup;
//                break;
//            }
//        }
//        int groupId = selectedGroup.getAgeGroupId();
        
        String gender="";
        String reviewdate;
        
        String day="";String month="";String year="";
        month = (String)combo_month.getSelectedItem();
       day = (String)combo_day.getSelectedItem();
       //year=combo_year.
//        reviewdate = day + "-" + month + "-" + year;
        reviewdate = month + " " + day;
        
        
        if(radBtn_male.isSelected())
            gender="Male";
        else if(radbtn_Others.isSelected())
            gender="Other";
        else
            gender="Female";
        
        Teacher t = new Teacher(firstName,lastName,gender,reviewdate);
        
        int teacherId = TeacherService.insertTeacher(t);
        
        if(teacherId != -1)
            JOptionPane.showMessageDialog(this, "Teacher was added succesfully.");
        else
            JOptionPane.showMessageDialog(this, "There was an error. Please try again.");
        
        this.dispose();
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        
            
    }//GEN-LAST:event_btn_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeFrame homeframe = new HomeFrame();
        homeframe.setVisible(true);
        homeframe.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radbtn_OthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbtn_OthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radbtn_OthersActionPerformed

    private void combo_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_monthActionPerformed

    private void combo_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_dayActionPerformed

    private void combo_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_yearActionPerformed

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
            java.util.logging.Logger.getLogger(NewTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTeacherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton btn_add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_day;
    private javax.swing.JComboBox<String> combo_month;
    private javax.swing.JComboBox<String> combo_year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JPanel panel_Title;
    private javax.swing.JPanel panel_teacherForm;
    private javax.swing.JRadioButton radBtn_female;
    private javax.swing.JRadioButton radBtn_male;
    private javax.swing.JRadioButton radbtn_Others;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextField txt_lastName;
    // End of variables declaration//GEN-END:variables
}
