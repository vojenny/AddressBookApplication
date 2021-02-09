import java.util.ArrayList;
public class AddressEntry {

    private static String firstName;
    private static String lastName;
    private static String street;
    private static String city;
    private static String state;
    private static String email;
    private static String phone;
    private static Integer zip;

    public AddressEntry(String fn, String ln, String stt, String ct, String st, Integer z, String ph, String em) {
        this.firstName = fn;
        this.lastName = ln;
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

    public static String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public static String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public static String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public static String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public static String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public static Integer getZip()
    {
        return zip;
    }

    public void setZip(Integer zip)
    {
        this.zip = zip;
    }

    public static String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public static String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override

    public String toString() {
        return firstName + " " + lastName + " " + street + " "
                + city + " " + state + " " + zip + " "
                + phone + " " + email + "\n";
    }

}

