/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.services;

import edu.neu.csye6200.objects.Immunization;
import edu.neu.csye6200.objects.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jasonpauldarivemula
 */
public class ImmunizationService {
    
    public List<String> getImmunizationAlerts(Connection con) throws SQLException {
		
		 Calendar calendarEnd=Calendar.getInstance();

		  // You can substract from the current Year to get the previous year last dates.
		  calendarEnd.set(Calendar.YEAR,calendarEnd.get(Calendar.YEAR)-1);

		  String endDateStr = calendarEnd.get(Calendar.YEAR)+"-"+calendarEnd.get(Calendar.MONTH)+"-"+calendarEnd.get(Calendar.DAY_OF_MONTH);
		  
		List<Immunization> imunizationList = new ArrayList<Immunization>();
		Statement stmt = con.createStatement();
		ResultSet rs =  stmt.executeQuery(String.format("Select studentid from Immunization where vaccinationdate=\"%s\"",endDateStr));
		List<String> list = new ArrayList<String>();
		while(rs.next()) {
			list.add(rs.getString(1));
		}
		return list;
	}

	public void insertImmunizationRecord(Student st, Connection con) throws SQLException {

		List<Immunization> imunizationList = st.getImmunizationList();
		Statement stmt = con.createStatement();
                //TODO: Check this logic 
		for (Immunization im : imunizationList) {
			Calendar endDate = Calendar.getInstance();
                        endDate.setTime(im.getDatesOfVaccination().get(im.getDatesOfVaccination().size()-1));
			String endDateStr = endDate.get(Calendar.YEAR)+"-"+endDate.get(Calendar.MONTH)+"-"+endDate.get(Calendar.DAY_OF_MONTH);
			String str = String.format("insert into Immunization values(\"%s\",\"%s\",\"%s\",%s)",
					im.getVaccineName(), String.valueOf(st.getStudentID()),endDateStr,String.valueOf(im.getFrequency()));
			System.out.println(str);
			stmt.executeUpdate(str);
		}
	}
    
}
