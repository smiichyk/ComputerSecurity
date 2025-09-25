package Calculator;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter your calculation in the format: number operator number (e.g., 5 + 3).");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("\n> ");
            String input = scanner.nextLine();

            // exit condition
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                input = input.replace(" ", "");

                // split input into parts
                if (input.length() != 3) {
                    System.out.println("Input must be in format: number operator number");
                    continue;
                }
                    calculator.setNumber1(Integer.parseInt(input.charAt(0) + ""));
                    calculator.setOperator(input.charAt(1));
                    calculator.setNumber2(Integer.parseInt(input.charAt(2) + ""));

                    if (calculator.getOperator() == '+') {
                        calculator.addition();
                    } else if (calculator.getOperator() == '-') {
                        calculator.subtraction();
                    } else if (calculator.getOperator() == '*') {
                        calculator.multiplication();
                    } else if (calculator.getOperator() == '/') {
                            calculator.division();
                    } else {
                        System.out.println("Error: unsupported operator '" + calculator.getOperator() + "'. " +
                                "Please use +, -, * or /.");
                        continue;
                    }

                    System.out.println("Result: " + calculator.getTotal());

            } catch (NumberFormatException e) {
                System.out.println("Error: both sides must be digits (e.g., 3+7).");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch(Exception e){
                System.out.println("There's something wrong with your calculation.");
                System.out.println("Exception: " + e);

            }
        }
    }
}
