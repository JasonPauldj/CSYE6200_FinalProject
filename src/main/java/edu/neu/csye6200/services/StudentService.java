/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.services;

import edu.neu.csye6200.objects.Student;
import edu.neu.csye6200.controller.DBConnection;
import edu.neu.csye6200.objects.AgeGroupEnum;
import edu.neu.csye6200.services.FetchData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jasonpauldarivemula
 */
public class StudentService {
    public static int insertStudent(Student st){
        Connection con = DBConnection.getConnection();
        int studentId=-1;
        
        if(con!=null){
            try {
                
                String query = "insert into Student (firstname,lastname,age,gender,caretakerId) values (?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1,st.getFirstName());
                stmt.setString(2,st.getLastName());
                stmt.setInt(3, st.getAge());
                stmt.setString(4, st.getGender());
                stmt.setInt(5, st.getCaretakerID());
                
                stmt.executeUpdate();  
                
                ResultSet rs = stmt.getGeneratedKeys();
                
                rs.first();
                studentId = rs.getInt(1);
                
                stmt.close();
                
                return studentId;
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
        }
        
        return -1;
        
    }
    
    public static ResultSet fetchStudentData(){
        Connection con = DBConnection.getConnection();
        if(con!=null){
            try {
                
                String query = "SELECT * FROM daycaredb.Student;";
                ResultSet rs = FetchData.SelectQuery(con, query);
                
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int cols = rsmd.getColumnCount();
                  while(rs.next()){
//                      System.out.println(rs.getString("firstname"));
                        for(int i = 1; i<=cols ; i++){
                            System.out.print(rs.getString(i) + " ");
                        }
                        System.out.println();
                  }
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }
    public static ResultSet fetchStudentData(AgeGroupEnum ageGroup){
        Connection con = DBConnection.getConnection();
        if(con!=null){
            try {
                int minAge = ageGroup.getMinLimitInMonths();
                int maxAge = ageGroup.getMaxLimitInMonths();
                
                String query = "SELECT * FROM daycaredb.Student where age between "+minAge+" and "+maxAge+";";
                ResultSet rs = FetchData.SelectQuery(con, query);
                
                ResultSetMetaData rsmd = rs.getMetaData();
                
                int cols = rsmd.getColumnCount();
                  while(rs.next()){
//                      System.out.println(rs.getString("firstname"));
                        for(int i = 1; i<=cols ; i++){
                            System.out.print(rs.getString(i) + " ");
                        }
                        System.out.println();
                  }
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }
}
