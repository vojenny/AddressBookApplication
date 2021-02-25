/**
 * @author Jenny Vo
 * @since 2021.02.24
 * */

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest<AddressBook> {

    private static <AddressEntry> AddressEntry testEntry() {
        return new AddressEntry("Lynne", "Grewe", new Address("123 3rd Ave", "Hayward", "Ca", 28666), "lynne.grewe@csueastbay.edu", "510-885-4167");
    }

    private static <AddressBook> AddressBook testBook() {
        AddressBook ab = new AddressBook();
        ab.add(testEntry());
        return ab;
    }

    @Test
    void testRemove() {
        AddressBook ab = testBook();
        assertTrue(ab.remove("Grewe"));
    }

    @Test
    void testFind() {
        AddressBook ab = testBook();
        ab.find("Grewe").get(0);
    }

    @Test
    void testAdd() {
        AddressBook ab = testBook();
        AddressEntry entry = testEntry();
        ab.add(entry);
        assertEquals(ab.find("Grewe").get(0), entry);
    }
}
