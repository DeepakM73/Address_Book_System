package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

class personalDetails{
    private String FirstName,LastName,Address,City,State,Email;
    long Zip,PhoneNumber;
    
    public personalDetails(String FirstName,String LastName,String Address,String City,String State,String Email,long Zip,long PhoneNumber){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.City=City;
        this.State=State;
        this.Email=Email;
        this.Zip=Zip;
        this.PhoneNumber=PhoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getZip() {
        return Zip;
    }

    public void setZip(long zip) {
        Zip = zip;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}

public class AddressBook {


    private static final ArrayList<personalDetails> list = new ArrayList<personalDetails>();
    public static Scanner Sc = new Scanner(System.in);


    private static personalDetails addPerson() {
        System.out.println("Enter FirstName: ");
        String FirstName = Sc.next();
        System.out.println("Enter LastName: ");
        String LastName = Sc.next();
        System.out.println("Enter Address: ");
        String Address = Sc.next();
        System.out.println("Enter City: ");
        String City = Sc.next();
        System.out.println("Enter State: ");
        String State = Sc.next();
        System.out.println("Enter Email: ");
        String Email = Sc.next();
        System.out.println("Enter Zip: ");
        long Zip = Sc.nextLong();
        System.out.println("Enter PhoneNumber: ");
        long PhoneNumber = Sc.nextLong();
        personalDetails personalDetails = new personalDetails(FirstName, LastName, Address, City, State, Email, Zip, PhoneNumber);
        return personalDetails;
    }

    private static void display(personalDetails personalDetail) {
        System.out.println("firstname is: " + personalDetail.getFirstName());
        System.out.println("lastname is: " + personalDetail.getLastName());
        System.out.println("address is: " + personalDetail.getAddress());
        System.out.println("city is: " + personalDetail.getCity());
        System.out.println("state is: " + personalDetail.getState());
        System.out.println("email is: " + personalDetail.getEmail());
        System.out.println("zip is: " + personalDetail.getZip());
        System.out.println("phoneNumber is: " + personalDetail.getPhoneNumber());
    }


    public static void main(String[] args) {

        personalDetails personalDetails = addPerson();
        list.add(personalDetails);
        for (int i = 0; i < list.size(); i++) {
            AddressBook.display(list.get(i));
        }
    }
}
