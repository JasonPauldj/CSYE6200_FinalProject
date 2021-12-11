/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.services;

import edu.neu.csye6200.controller.DBConnection;
import edu.neu.csye6200.objects.CareTaker;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


import edu.neu.csye6200.objects.ClassRoom;


/**
 *
 * @author jasonpauldarivemula
 */
public class ClassroomService {
    
    public static int insertClassroom(ClassRoom cr) {
        Connection con = DBConnection.getConnection();
        int classroomId = -1;
        if (con != null) {
            try {
                String query = "insert into classroom (grpcapacity,agegroupId) values (?,?)";
                PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, cr.getGroupAvailableCapacity());
                stmt.setInt(2, cr.getAgegroupId());

                stmt.executeUpdate();

                ResultSet rs = stmt.getGeneratedKeys();

                rs.first();
                classroomId = rs.getInt(1);
               
                stmt.close();
                return classroomId;

            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
 
        }
        return -1;

    }
}
