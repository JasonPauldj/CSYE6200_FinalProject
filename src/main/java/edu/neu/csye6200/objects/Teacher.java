package edu.neu.csye6200.objects;

public class Teacher extends Person{
    
    private int agegroupId;

    public Teacher(String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
    }

    public Teacher(int agegroupId, String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
        this.agegroupId = agegroupId;
    }

    public int getAgegroupId() {
        return agegroupId;
    }
    
   

}
