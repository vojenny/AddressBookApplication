import java.util.ArrayList;

public class AddressBookApplication {

    //  create a method in your AddressBookApplication called
    //  void initAddressBookExercise(ab) that creates 2 instances
    //  of AddressEntry and places them in ab (an AddressBook)
    //  collection called AddressEntryList

    public void initAddressBookExerciser(AddressBook ab) {
        AddressEntry addressEntry1 = new AddressEntry("Jenny","Vo", "Sesame Street", "San Jose", "CA", 95132, "1234567890", "jenny@gmail.com" );
        AddressEntry addressEntry2 = new AddressEntry();

        ab.add(addressEntry1);
        ab.add(addressEntry2);

        // call the AddressBook's ab.list() method
        ab.list();
    }

    public static void main(String[] args) {

        AddressEntry.getFirstName();
        AddressEntry.getLastName();
        AddressEntry.getStreet();
        AddressEntry.getCity();
        AddressEntry.getState();
        AddressEntry.getZip();
        AddressEntry.getPhone();
        AddressEntry.getEmail();

    }
}

