package Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ValidationUtil validation = new ValidationUtil();
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8"));

        while (true) {
            System.out.println("""
                    
                    
                    --------------------------------------------------------------------
                    Which pattern you want to check?
                    --------------------------------------------------------------------
                    
                    1. A string that only contains lowercase and uppercase letters.
                    2. A binary number.
                    3. A string that is either Saturday or Sunday.
                    4. A valid DkIT student number.
                    5. A valid Irish mobile number.
                    6. A valid mathematical expression.
                    7. A valid password.
                    8. A valid email address.
                    9. Exit.
                    """);
            System.out.print("Write a number (1-9): ");
            String number = scanner.nextLine();

            if (list.contains(number)) {
                System.out.print("Write a string: ");
                String input = scanner.nextLine();

                String pattern = "";
                System.out.print("\nResult: ");
                pattern = switch (number) {
                    case "1" -> validation.upperCaseAndLowerCasePattern();
                    case "2" -> validation.binaryNumberPattern();
                    case "3" -> validation.saturdayOrSundayPattern();
                    case "4" -> validation.DKiTStudentNumberPattern();
                    case "5" -> validation.irishNumberPattern();
                    case "6" -> validation.mathematicalExpressionPattern();
                    case "7" -> validation.passwordPattern();
                    case "8" -> validation.emailPattern();
                    default -> pattern;
                };

                System.out.print(validation.patternMatches(input, pattern));
            } else if (number.equals("9")) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
