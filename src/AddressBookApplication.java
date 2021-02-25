/**
 * @author Jenny Vo
 * @since 2021.02.24
 * */

import java.awt.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

public class AddressBookApplication {

    /** @param {string} args      an array of sequence of characters */
    public static void main(String[] args) throws IOException {

        //Create a new instance of AddressBook()
        AddressBook ab = new AddressBook();

        //Prompting menu
        char choice = Menu.prompt_Menu(System.in);

        while(choice != 'f') {
            switch(choice) {
                case 'a':
                    loadFromFile(ab);
                    break;
                case 'b':
                    addEntry(ab);
                        break;
                case 'c':
                    removeEntry(ab);
                    break;
                case 'd':
                    findEntry(ab);
                case 'e':
                    ab.list();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
            choice = Menu.prompt_Menu(System.in);
        }
        if(choice == 'f') {
            System.out.println("Goodbye! ");
        }
    }

    private static void findEntry(AddressBook ab) {


    }

    private static void removeEntry(AddressBook ab) {

    }

    private static void loadFromFile(AddressBook ab) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in Filename: ");
        ab.loadFromFile(input.nextLine());
    }

    /**
     * Create a method that prompts user for entry data into AddressBook instance
     * @param ab an AddressBook instance
     */

    private static void addEntry(AddressBook ab) {
        AddressEntry entry = new AddressEntry();
        String firstName;
        String lastName;
        String street;
        String city;
        String state;
        int zip;
        String phone;
        String email;

        firstName = Menu.prompt_FirstName(System.in);
        entry.setFirstName(firstName);

        lastName = Menu.prompt_LastName(System.in);
        entry.setLastName(lastName);

        street = Menu.prompt_Street(System.in);
        entry.setStreet(street);

        city = Menu.prompt_City(System.in);
        entry.setCity(city);

        state = Menu.prompt_State(System.in);
        entry.setState(state);

        zip = Menu.prompt_Zip(System.in);
        entry.setZip(zip);

        phone = Menu.prompt_Phone(System.in);
        entry.setPhone(phone);

        email = Menu.prompt_Email(System.in);
        entry.setEmail(email);

        ab.add(entry);

        System.out.println("Thank you! The following contact has been added to your address book: \n");
        System.out.println(entry.toString());
    }


    public static void initAddressBookExercise(AddressBook addressBook) {
        AddressEntry addressEntry1 = new AddressEntry("Jen",
                "V", "2468 Sesame St", "San Jose",
                "CA", 95132, "123-456-7890", "hogwarts@gmailcom");
        AddressEntry addressEntry2 = new AddressEntry("Jaehyun",
                "Jeong", "9753 Neozen Blvd", "Valentyne",
                "JY", 77777, "098-765-4321", "jyunho@gmail.com");
        addressBook.add(addressEntry1);
        addressBook.add(addressEntry2);

        addressBook.list();
    }
}

