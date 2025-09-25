package Calculator;

import java.util.Scanner;

public class Main {

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

                char n1 = input.charAt(0);
                char op = input.charAt(1);
                char n2 = input.charAt(2);

                if ((!Character.isDigit(n1) || !Character.isDigit(n2))) {
                    System.out.println("Error: both sides must be digits (e.g., 3+7).");
                } else if (op != '+' && op != '-' && op != '*' && op != '/') {
                    System.out.println("Error: unknown operator '"+op+"'. Use +, -, *, /.");
                } else {
                    calculator.setNumber1(Integer.parseInt(input.charAt(0) + ""));
                    calculator.setOperator(input.charAt(1));
                    calculator.setNumber2(Integer.parseInt(input.charAt(2) + ""));

                    if (calculator.getOperator() == '+') {
                        calculator.addition();
                    } else if (calculator.getOperator() == '-') {
                        calculator.subtraction();
                    }  else if (calculator.getOperator() == '*') {
                        calculator.multiplication();
                    }  else if (calculator.getOperator() == '/') {
                        if (calculator.getNumber2()!=0) {
                            calculator.division();
                        } else {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                    } else {
                        System.out.println("Invalid input!");
                        break;
                    }

                    System.out.println("Result: " + calculator.getTotal());
                }
            } catch(Exception e){
                System.out.println("There's something wrong with your calculation.");
                System.out.println("Exception: " + e);

            }
        }
    }
}
