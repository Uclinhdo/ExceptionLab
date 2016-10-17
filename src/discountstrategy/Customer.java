/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author linhdo
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String customerId;

    public Customer(String customerId, String firstName, String lastName,String phoneNumber) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
        
        this.phoneNumber = phoneNumber;
    }

    
    
    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
       
        this.customerId = customerId;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
       
        this.lastName = lastName;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final String getCity() {
        return city;
    }

    public final void setCity(String city) {
        this.city = city;
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }

    public final String getZipCode() {
        return zipCode;
    }

    public final void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    
    public final String getFullname()
    {
        String fullname;
        fullname = firstName + " " +  lastName;
        return fullname;
    }
    
    
}
