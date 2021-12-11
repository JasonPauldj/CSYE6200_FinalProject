/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.services;

import edu.neu.csye6200.controller.DBConnection;
import edu.neu.csye6200.objects.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jasonpauldarivemula
 */
public class TeacherService {
    
     public static int insertTeacher(Teacher t){
        Connection con = DBConnection.getConnection();
        int teacherId=-1;
        
        if(con!=null){
            try {
                
                String query = "insert into Teacher (firstname,lastname,gender,agegroupId) values (?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1,t.getFirstName());
                stmt.setString(2,t.getLastName());
                stmt.setString(3, t.getGender());
                stmt.setInt(4,t.getAgegroupId());
                
                stmt.executeUpdate();  
                
                ResultSet rs = stmt.getGeneratedKeys();
                
                rs.first();
                teacherId = rs.getInt(1);
                
                stmt.close();
                
                return teacherId;
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
        }
        
        return -1;
        
    }
}
