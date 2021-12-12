package edu.neu.csye6200.objects;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
        private String registrationdate;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public Person(String firstName, String lastName, String gender, String registrationdate) {
        this(firstName, lastName, gender);
        this.registrationdate = registrationdate;
    }
	
        
        
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
        public String getRegistrationDate(){
            return registrationdate;
        }
        public void setRegistrationDate(String registrationdate){
            this.registrationdate=registrationdate;
        }

}
