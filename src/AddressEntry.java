/**
 * @author Jenny Vo
 * @since 2021.02.24
 * */
import java.util.ArrayList;
public class AddressEntry {

    /**
     * @param firstName first name
     * @param lastName last name
     * @param street street name
     * @param city city name
     * @param state state
     * @param email email address
     * @param phone phone number
     * @param zip zip code
     */
    private static String firstName;
    private static String lastName;
    private static String street;
    private static String city;
    private static String state;
    private static String email;
    private static String phone;
    private static Integer zip;

    /** @param fname    the first name
    *  @param lname    the last name
    *  @param stt    the street
    *  @param ct    the city
    *  @param st    the state
    *  @param z     the zipcode
    *  @param ph    the phone number
    *  @param em     the email address
    * */
    public AddressEntry(String fname, String lname, String stt, String ct, String st, Integer z, String ph, String em) {
        this.firstName = fname;
        this.lastName = lname;
        this.street = stt;
        this.city = ct;
        this.state = st;
        this.zip = z;
        this.phone = ph;
        this.email = em;

    }

    public AddressEntry () {
        firstName = "Jenny";
        lastName = "Vo";
        street = "Sesame Street";
        city = "San Jose";
        state = "CA";
        zip = 95132;
        phone = "1234567890";
        email = "jenny@gmail.com";
    }

    /** @return the first name */
    public static String getFirstName()
    {
        return firstName;
    }

    /** @param firstName     the first name */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /** @return lastName     the last name */
    public static String getLastName()
    {
        return lastName;
    }

    /** @param lastName     the last name */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /** @return the street name */
    public static String getStreet()
    {
        return street;
    }

    /** @param street    the street name */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /** @return the city */
    public static String getCity()
    {
        return city;
    }

    /** @param city      the city name */
    public void setCity(String city)
    {
        this.city = city;
    }

    /** @return the state */
    public static String getState()
    {
        return state;
    }

    /** @param state     the name of the state */
    public void setState(String state)
    {
        this.state = state;
    }

    /** @return the zip code */
    public static Integer getZip()
    {
        return zip;
    }

    /** @param zip   the zip code */
    public void setZip(Integer zip)
    {
        this.zip = zip;
    }

    /** @return the phone number */
    public static String getPhone()
    {
        return phone;
    }

    /** @param phone     the phone number */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /** @return the email address */
    public static String getEmail()
    {
        return email;
    }

    /** @param email     the email address */
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override

    /** @return the first name, last name, street, city,
    * state, zip code, phone number, and email address
    * */
    public String toString() {
        return firstName + " " + lastName + " " + street + " "
                + city + " " + state + " " + zip + " "
                + phone + " " + email + "\n";
    }

}

