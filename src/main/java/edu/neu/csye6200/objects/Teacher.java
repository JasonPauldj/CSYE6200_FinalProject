package edu.neu.csye6200.objects;

public class Teacher extends Person{
    
    private int agegroupId;
    private int teacherID;
    private String reviewdate;
    //String 

    public Teacher(String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
    }

    public Teacher(int agegroupId, String firstName, String lastName, String gender, String reviewdate) {
        super(firstName, lastName, gender);
        this.agegroupId = agegroupId;
        this.reviewdate = reviewdate;
    }
    
    public Teacher(int agegroupId, String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
        this.agegroupId = agegroupId;
    }
    
    @Override
    public String toString(){
        return "teacher :"+getFirstName()+getLastName()+getGender()+agegroupId+teacherID;
    }

    

    public int getAgegroupId() {
        return agegroupId;
    }
    
    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
    public String getReviewdate(){
        return reviewdate;
    }

}
