package PhoneBook;

import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactMethods contactMethods = new ContactMethods();

        int userChoice = 0;
        while (userChoice != 7) {
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact by First Name");
            System.out.println("4. Find Contact by Last Name");
            System.out.println("5. Find Contact by Phone Number");
            System.out.println("6. Edit Contact");
            System.out.println("7. Exit PhoneBook");

            System.out.println("Enter a Number to Perform the action: ");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter First Name: ");
                    String firstName = input.next();
                    System.out.println("Enter Last Name: ");
                    String lastName = input.next();
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = input.next();

                    Contact contact = new Contact(firstName, lastName, phoneNumber);
                    contactMethods.addContact(contact);
                    System.out.println("Contact Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter First Name of the Contact you want to Remove: ");
                    String contactToRemove = input.next();
                    if(contactMethods.removeContact(contactToRemove)){
                        System.out.println("Contact Removed Successfully");
                    }else{
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 3:
                    System.out.println("Enter First Name of the Contact you want to Find: ");
                    String firstNameToFind = input.next();
                    Contact contactByFirstName = contactMethods.findContactByFirstName(firstNameToFind);
                    if(contactByFirstName != null){
                        System.out.println(contactByFirstName);
                    }else{
                        System.out.println("Contact with the name was not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Last Name of the Contact you want to Find: ");
                    String LastNameToFindLastName = input.next();
                    Contact contactByLastName = contactMethods.findContactByLastName(LastNameToFindLastName);
                    if(contactByLastName != null){
                        System.out.println("Contact Found Successfully"+ contactByLastName);
                    } else{
                        System.out.println("Contact with the name was Found");
                    }
                    break;

                case 5:
                    System.out.println("Enter Phone Number of the Contact you want to Find: ");
                    String phoneNumberToFind = input.next();
                    Contact contactByPhoneNumber = contactMethods.findContactByPhoneNumber(phoneNumberToFind);
                    if(contactByPhoneNumber != null){
                        System.out.println("Contact Found Successfully"+ contactByPhoneNumber);
                    } else {
                        System.out.println("Contact with the phone number was Found");
                    }
                    break;

                case 6:
                    System.out.println("Enter First Name of the Contact you want to Edit: ");
                    String contactToEditFirstName = input.next();
                    System.out.println("Enter new First Name of the Contact: ");
                    String newFirstName = input.next();
                    System.out.println("Enter new Name of the Contact: ");
                    String newLastName = input.next();
                    System.out.println("Enter new Phone Number: ");
                    String newPhoneNumber = input.next();

                    if (contactMethods.EditContact(contactToEditFirstName, newFirstName,newLastName, newPhoneNumber)){
                        System.out.println("Contact Edited Successfully");
                    } else {
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 7:
                    System.out.println("Exiting PhoneBook");
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
