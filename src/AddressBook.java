/**
* @author Jenny Vo
* @since 2021.02.24
* */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*The AddressBook class creates a brand new address book that
* will accept address entries using a TreeMap
* */
public class AddressBook {
    /**
     * @link  AddressEntry A list to hold the collection of AddressEntry objects
     */
    private List<AddressEntry> addressEntryList;
    private static AddressBook instance;

    /**
     * AddressEntry A method that creates a new list to hold entries into AddressBook
     */
    public AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    public static AddressBook newInstance() {
        if (instance == null) {
            instance = new AddressBook();
        }
        return instance;
    }

    /** Create instance of AddressBook called addressBook
    *  @param entry the addressEntry loaded with data
    */
    public void add(AddressEntry entry) {
        addressEntryList.add(entry);
    }

    /**
     * Create a method that removes an entry from AddressEntry
     * @param entry an AddressBook object
     */
    public void remove(AddressEntry entry) {
        addressEntryList.remove(entry);
    }

    /**
     * Create a method that prints the list
     */
    public void list() {
        addressEntryList.forEach(System.out::println);
    }

    public void loadFromFile(String path) throws IOException {
        ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get(path)));

        for (String info: list) {
            AddressEntry entry = new AddressEntry();
            ArrayList<String> entryList = new ArrayList<>(Arrays.asList(info.split(",")));
            entry.setFirstName(entryList.get(0).trim());
            entry.setLastName(entryList.get(1).trim());
            entry.setStreet(entryList.get(2).trim());
            entry.setCity(entryList.get(3).trim());
            entry.setState(entryList.get(4).trim());
            entry.setZip(Integer.parseInt(entryList.get(5).trim()));
            entry.setPhone(entryList.get(6).trim());
            entry.setEmail(entryList.get(7).trim());
            add(entry);
        }

        System.out.println("Read in " + list.size() + " new Addresses, successfully loaded, currently " + addressEntryList.size() + " Addresses");
    }

}
