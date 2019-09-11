package com.dave;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Contact> myContact = new ArrayList<Contact>();

// Display Options
    public static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To display Contact");
        System.out.println("\t 1 - To add new myContact.");
        System.out.println("\t 2 - To modify contacts.");
        System.out.println("\t 3 - To remove contacts.");
        System.out.println("\t 4 - To search contacts from the list.");
        System.out.println("\t 5 - To quit the application.");
    }
// Add new contacts
    public static void addNewContact() {      // create parameter for oldname and newname and use it
        System.out.println("Enter Full Name: ");
        String name = input.nextLine();
        if (isDuplicate(name)) {
            System.out.println("Name already exists in your list\n");
        }
        else {
            System.out.println("Enter phone number: ");
            String number = input.nextLine();

            System.out.println("Enter email address: ");
            String email = input.nextLine();

//            myContact.add(new Contact(name, number, email));
//            System.out.println("Contact successfully added to your list!\n");

            myContact.add(Contact.createContacts(name,number,email));
            System.out.println("Contact successfully added to your list!\n");
        }
    }
// To display all contacts

    public static void printContactList() {
        System.out.println("You have " + myContact.size() + " Contacts in your list");

        for (int index = 0; index < myContact.size(); index++) {

            System.out.println(index + 1 + " :" + myContact.get(index).getName() + " ," + myContact.get(index).getPhoneNumber()
                    + ", " + myContact.get(index).getEmailAddress() + "\n");
        }
    }
// Modify Contact Information

    public static void modifyContactList() {
        System.out.println("Enter contacts name to be modified");
        String oldName = input.nextLine();

        if (isDuplicate(oldName)) {
            System.out.println("Modify the Contact name: ");
            String newName = input.nextLine();
            System.out.println("Modify " + newName + "'s number: ");
            String newNumber = input.nextLine();
            System.out.println("Modify " + newName + "'s email: ");
            String newEmail = input.nextLine();

            int position = findItem(oldName);

            myContact.set((position + 1),Contact.createContacts(newName,newNumber,newEmail));
        }
        else {
            System.out.println("Contact Name not found!");
        }
    }

// Remove Contact Information

    public static void removeContact() {
        System.out.println("Enter name of contact to be removed from list: ");
        String removeThis = input.nextLine();

        int position = findItem(removeThis); // finding index and looking for the element that matches the name;
        myContact.remove(position + 1);

        System.out.println(" Contact Removed Successfully!");
    }

// Search for a Contact Information

public static void searchContact() {
    System.out.println("Enter name to search: ");
    String nameSearch = input.nextLine();

    int position = findItem(nameSearch);
        if (isDuplicate(nameSearch)) {

            System.out.println("Contact found in list at index: " + (position + 1) + " is --> " + nameSearch);
        }
        else {
            System.out.println(" Contacts name not found: Please make a selection again!");
        }
}



// methods to simplify my code

    public static int findItem(String searchName) {
        return myContact.indexOf(searchName);
    }

    public static boolean isDuplicate(String inputName) {
        for (int index = 0; index < myContact.size(); index ++) {
            if (inputName.equalsIgnoreCase(myContact.get(index).getName())){
                return true;
            }
        }
        return false;
    }



}
