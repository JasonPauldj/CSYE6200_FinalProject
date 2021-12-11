/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.services;

import edu.neu.csye6200.controller.DBConnection;
import edu.neu.csye6200.objects.AgeGroup;
import edu.neu.csye6200.objects.AgeGroupEnum;
import edu.neu.csye6200.objects.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jasonpauldarivemula
 */
public class AgeGroupService {

    public int getAgeGroup(Connection con, int groupNo) {
        try {
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(String
                    .format("Select * from grps where ageGroup =%s and remainingcapacity>0", String.valueOf(groupNo)));
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static void insertAgeGroup(int groupNo, int classroomId, int teacherId) {

        Connection con = DBConnection.getConnection();
       
        if(con!=null){
            try {
                
                String query = "insert into grps(ageGroup, classroomId, maxcapacity,remainingcapacity,teacherId) values(?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, groupNo);
                stmt.setInt(2, classroomId);
                stmt.setInt(3, getMaxCapacity(groupNo));
                stmt.setInt(4, getMaxCapacity(groupNo));
                stmt.setInt(5, teacherId);
                
                stmt.executeUpdate();  
                ResultSet rs = stmt.getGeneratedKeys();
                
            } catch (SQLException ex) {
                Logger.getLogger(AgeGroupService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
//    private int getMaxCapacity(int agegroup){
//        if(agegroup == 1 || agegroup == 2 || agegroup == 3 || agegroup== 4)
//            return 3;
//        if(agegroup == 5 || agegroup == 6)
//            return 2;
//        return -1;
//    }
    
    private static int getMaxCapacity(int agegroup){
        for( AgeGroupEnum age: AgeGroupEnum.values()){
            if(age.getAgeGroupId() ==agegroup)
                return age.getMaxGroupSize();
        }
        return -1;
    }

    public int decrementCapacity(Connection con, int groupNo) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("UPDATE grps SET remainingcapacity = remainingcapacity - 1 WHERE id = %s",
                    String.valueOf(groupNo)));
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public List<AgeGroup> getGroupListForClassRoom( int classroomNo){
        Connection con = DBConnection.getConnection();
        if (con != null) {
            try {
                String query = "Select * from grps where classroomId=?";
                PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                //stmt.setString(1,String.valueOf(classroomNo));
                stmt.setInt(1,classroomNo);
                ResultSet rs = stmt.executeQuery();
                 List<AgeGroup> list = new ArrayList<AgeGroup>();
                while(rs.next()){
                    AgeGroup grp = new AgeGroup(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),rs.getInt(6));
                    list.add(grp);
                }
                  System.out.println(list);
                return list;
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return new ArrayList<AgeGroup>();
            }
        }
        return new ArrayList<AgeGroup>();
    }

}
