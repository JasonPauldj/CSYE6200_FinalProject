package edu.neu.csye6200.objects;

import java.sql.Date;
import java.util.List;

public class Student extends Person {

	private int studentID;
	private int age;
	private List<Integer> parentIds;
	private double gpa;
	private List<Immunization> immunizationList;
	private String address;
	private String phone;
	private Date registrationDate;
        private int caretakerID;

        public Student(int age,int caretakerID, String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
        this.age = age;
        this.caretakerID = caretakerID;
    }

      public Student(int studentID, int age, int caretakerID, String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
        this.studentID = studentID;
        this.age = age;
        this.caretakerID = caretakerID;
    }

    public int getCaretakerID() {
        return caretakerID;
    }

    public void setCaretakerID(int caretakerID) {
        this.caretakerID = caretakerID;
    }
      
      

        
    
        
        
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public List<Immunization> getImmunizationList() {
		return immunizationList;
	}
	public void setImmunizationList(List<Immunization> immunizationList) {
		this.immunizationList = immunizationList;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getParentIds() {
		return parentIds;
	}
	public void setParentIds(List<Integer> parentIds) {
		this.parentIds = parentIds;
	}
	
}
