package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
       setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }
    //Validation rules:
    //daysVacation must be between 0 and 120 inclusive
    public final void setDaysVacation(int daysVacation)throws IllegalArgumentException {
        //need validation
        if(daysVacation <0 || daysVacation >120) {
            throw new IllegalArgumentException("Argument out of range.");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
    //validate same as lastName
    public final void setFirstName(String firstName) {
       if(firstName == null || firstName.isEmpty()){
           throw new IllegalArgumentException("Last name must not have null values.");
       }if(firstName.length()>50){
           throw new IllegalArgumentException("Last name cannot have more than 50 characters.");
       }if(firstName.contains(" ")){
           throw new IllegalArgumentException("Last name should not contain spaces.");
       }
       
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }
    //Validation rules:
    //no null values
    //no empty strings
    //no name > 50 characters
    //no name should start with/ be exclusively spaces
    //names must only contain alphabet or numberic characters, plus appstrophe,
    //plus hyphens
    public final void setLastName(String lastName) throws IllegalArgumentException  {
        //need validation
       if(lastName == null){
           throw new IllegalArgumentException("Last name must not have null values.");
       }if(lastName.isEmpty()){
           throw new IllegalArgumentException("Last name cannot be empty.");
       }if(lastName.length()>50){
           throw new IllegalArgumentException("Last name cannot have more than 50 characters.");
       }if(lastName.contains(" ")){
           throw new IllegalArgumentException("Last name should not contain spaces.");
       }
           
       
               
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    //validate same as names
    //rules:
    //must be in either format xxx-xx-xxxx or xxxxxxxxx
    //only allow digits and hyphen
    //only allow 2 hyphens
    //cannot all be zero
    //
    public final void setSsn(String ssn) {
        String [] parts = ssn.split("-");
        if(ssn == null){
           throw new IllegalArgumentException("Social Security Number must not have null values.");
       }if(ssn.isEmpty()){
           throw new IllegalArgumentException("Social Security Number cannot be empty.");
       }if((ssn.length() <9) && (ssn.length()>11)){
           throw new IllegalArgumentException();
       }if(parts.length != 3 || parts.length != 1){
           throw new IllegalArgumentException();
       }
       char [] chars = ssn.toCharArray();
       for (char c : chars){
           if(!Character.isDigit(c));
       }
        this.ssn = ssn;
    }
    
    
    
}
