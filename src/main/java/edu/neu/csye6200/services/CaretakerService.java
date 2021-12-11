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

/**
 *
 * @author jasonpauldarivemula
 */
public class CaretakerService {

    public static int insertCaretaker(CareTaker ct) {
        Connection con = DBConnection.getConnection();
        int caretakerId = -1;
        if (con != null) {
            try {
                String query = "insert into Caretaker (firstname,lastname,address,phonenumber,gender) values (?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, ct.getFirstName());
                stmt.setString(2, ct.getLastName());
                stmt.setString(3, ct.getAddress());
                stmt.setString(4, ct.getPhone());
                stmt.setString(5, ct.getGender());

                stmt.executeUpdate();

                ResultSet rs = stmt.getGeneratedKeys();

                rs.first();
                caretakerId = rs.getInt(1);
               
                stmt.close();
                return caretakerId;

            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
 
        }
        return -1;

    }

    public static CareTaker getCaretakerFromPhone(String phone) {
        Connection con = DBConnection.getConnection();
        CareTaker ct = null;
        if (con != null) {
            try {
                String query = "select * from Caretaker where phonenumer=?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, phone);

                ResultSet rs = stmt.executeQuery();

                int cnt = 0;

                while (rs.next() && cnt == 0) {
                    String address = rs.getString("address");
                    String firstname = rs.getString("firstname");
                    String lastname = rs.getString("lastname");
                    String gender = rs.getString("gender");
                    int id = rs.getInt("caretakerId");

                    ct = new CareTaker(address, phone, id, firstname, lastname, gender);

                    cnt++;
                }

            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class
                        .getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        }

        return ct;
    }

}
