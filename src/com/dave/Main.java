package com.dave;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


       MobilePhone mobilePhone = new MobilePhone();

       boolean quit = false;

       MobilePhone.printOptions();

       while(!quit) {
           System.out.println("Enter Choice: ");
           int choice = input.nextInt();

           switch (choice) {
               case 0: MobilePhone.printContactList();
               break;
               case 1: MobilePhone.addNewContact();
               break;
               case 2: MobilePhone.modifyContactList();
               break;
               case 3: MobilePhone.removeContact();
               break;
               case 4: MobilePhone.searchContact();
               break;
               case 5: quit = true;
               break;
           }

       }

//       mobilePhone.addNewContact();
//       mobilePhone.printContactList();
//
//       MobilePhone.modifyContactList();
//
//        mobilePhone.printContactList();
//        MobilePhone.searchContact();
//        MobilePhone.remoeContact();
//        mobilePhone.printContactList();

    }
}
