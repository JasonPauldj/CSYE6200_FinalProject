package edu.neu.csye6200.objects;

import java.sql.Date;
import java.util.List;
import edu.neu.csye6200.services.AgeGroupService;

public class Student extends Person {

	private int studentID;
	private int age;
	private List<Integer> parentIds;
	private double gpa;
	private List<Immunization> immunizationList;
	private String address;
	private String phone;
	private String registrationdate;
        private int caretakerID;
        private int groupID;

        public Student(int age,int caretakerID, String firstName, String lastName, String gender, int groupID) {
        super(firstName, lastName, gender);
        this.age = age;
        this.caretakerID = caretakerID;
        this.groupID = groupID;
    }

      public Student(int age, int caretakerID, String firstName, String lastName, String gender, int groupID, int studentID) {
          this(age, caretakerID, firstName, lastName, gender, groupID);
        this.studentID = studentID;  
    }
      public Student(int age, int caretakerID, String firstName, String lastName, String gender, int groupID, int studentID
      , String address, String phone, String registrationdate){
          this(age, caretakerID, firstName, lastName, gender, groupID, studentID);
          this.address = address;
          this.phone = phone;
          this.registrationdate = registrationdate;
      }
      @Override
      public String toString(){
          return  "student: "+studentID+ age+ caretakerID+ getFirstName()+ getLastName()+ getGender();
      }

    public int getCaretakerID() {
        return caretakerID;
    }

    public void setCaretakerID(int caretakerID) {
        this.caretakerID = caretakerID;
    }
      
      

        
    
        
        public int getGroupID(){
            return groupID;
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
	public String getRegistrationDate() {
		return registrationdate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationdate = registrationDate;
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
