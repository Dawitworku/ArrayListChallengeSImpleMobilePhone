package com.dave;

public class Contact {

    private String name;
    private String phoneNumber;
    private String emailAddress;



    // overriding constructor
    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }



    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    // method
    public static Contact createContacts(String name, String phoneNumber, String emailAddress) {

        return new Contact(name, phoneNumber, emailAddress);  // calling the constructor to create a new contact record
    }



}
