import java.util.ArrayList;
public class AddressBook {

    private ArrayList<AddressEntry> addressEntryList;

    public AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    // Create instance of AddressBook called addressBook
    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }

    // Iterate through addressEntryList and for each item call
    // toString & print it out
    public void list() {
        for (AddressEntry addressEntry : addressEntryList)
            System.out.println(addressEntry);
    }

}
