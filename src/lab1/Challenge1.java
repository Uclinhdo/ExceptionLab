package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
       
        String lastName = "unknown";
        try{       
        app.extractLastName(fullName);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception to the calling method. and handle
    // it there.
    
    public String extractLastName(String fullName) throws IllegalArgumentException {
        //String lastName = fullName.substring(LAST_NAME_IDX);
        String lastName = null;
        if(fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException("Full name is mandatory.");
        }
        String [] parts = fullName.split(" ");
       
        // Your code goes here. Assign your value to lastName
        if(parts.length < 2 || parts.length > 3){
            throw new IllegalArgumentException("Full name must contain at least 2 parts.");
        }
        if(parts.length == 2){
           lastName = parts[parts.length - 1];
        }else if(parts.length == 3) {   
        lastName = parts[parts.length - 2] + parts[parts.length - 1] ;
         }
        return lastName;
    }

}
