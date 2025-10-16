package Lab3;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Validation validation = new Validation();

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        List<String> options = Arrays.asList("1","2","3","4","5","6","7","8","9");

        while (true) {
            {System.out.println("""
                    
                    
                    --------------------------------------------------------------------
                    Which pattern you want to check?
                    --------------------------------------------------------------------
                    
                    1. Username
                    2. Phone number
                    3. Full name
                    4. Password
                    5. Address
                    6. Eircode
                    7. Enquiry
                    8. Blog entry
                    9. Comment
                    0. Exit
                    """);}

            System.out.print("Write a number (0-9): ");
            String number = scanner.nextLine().trim();

            if (!options.contains(number)) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }
            if (number.equals("0")) {
                System.out.println("Bye!");
                break;
            }

            switch (number) {
                case "1" -> validateInput("username");
                case "2" -> validateInput("phone number");
                case "3" -> validateInput("full name");
                case "4" -> validateInput("password");
                case "5" -> validateInput("address");
                case "6" -> validateInput("eircode");
                case "7" -> validateInput("enquiry");
                case "8" -> validateInput("blog entry");
                case "9" -> validateInput("comment");
            }
        }
    }

    private static void validateInput(String type) {
        while (true) {
            System.out.print("\nWrite a " + type + ": ");
            String input = scanner.nextLine();

            boolean valid = false;
            switch (type.toLowerCase()) {
                case "username" -> valid = validation.username(input);
                case "phone number" -> valid = validation.phoneNumber(input);
                case "full name" -> valid = validation.fullName(input);
                case "password"    -> valid = validation.password(input);
                case "address"  -> valid = validation.address(input);
                case "eircode"  -> valid = validation.eircode(input);
                case "enquiry"  -> valid = validation.enquiry(input);
                case "blog entry"  -> valid = validation.blogEntry(input);
                case "comment"  -> valid = validation.comment(input);
                default -> {
                    System.out.println("Unknown validation type: " + type);
                    return;
                }
            }

            if (valid) {
                System.out.println(type.substring(0,1).toUpperCase() + type.substring(1) + " is valid.");
                break;
            }
            else {
                System.out.println("Invalid " + type + ". Try again.");
            }
        }
    }
}