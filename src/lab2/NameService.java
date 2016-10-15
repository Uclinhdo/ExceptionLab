package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        String lastName = "";
        // write your code here to extract the lastName and store in the
        // above local variable
        String parts[] = fullName.split(" ");
        if(lastName == null || lastName.isEmpty())
        {
            throw new IllegalArgumentException("Last name must not have null or empty value");
        }
        if(fullName == null || fullName.isEmpty() || parts.length < 1 || parts.length > 3)
        {
            throw new IllegalArgumentException("Full name must contain at least 2 parts.");
        }else{
            lastName = parts[parts.length -1];
        }
        return lastName;
    }
    

    
    
}
