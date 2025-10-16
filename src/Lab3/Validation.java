package Lab3;

public class Validation {

    public boolean username(String username) {
        return username.matches("^([A-Za-z0-9_.]+){4,30}$");
    }

    public boolean phoneNumber(String phone_number) {
        return phone_number.matches("^\\+?[0-9]{7,15}$");
    }

    public boolean fullName(String full_name) {
        return full_name.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+$");
    }

    public boolean password(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{12,100}$");
    }

    public  boolean address(String address) {
        return address.matches("^[A-Za-z0-9 ,.-]{5,100}$");
    }

    public boolean eircode(String eircode) {
        return eircode.matches("[A-Z0-9]{7}");
    }

    public boolean enquiry(String enquiry) {
        return enquiry.matches(".{20,1100}");
    }

    public boolean blogEntry(String blog_entry) {
        return blog_entry.matches(".{1,4096}");
    }

    public boolean comment(String comment) {
        return comment.matches(".{1,2200}");
    }
}
