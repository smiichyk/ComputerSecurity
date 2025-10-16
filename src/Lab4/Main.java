package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner fileScanner;

        Authentication auth = new Authentication("smiichyk", new File("src/Lab4/file.txt"));

        while (auth.getAttempts() > 0) {
            System.out.print("\nEnter your password: ");
            String inputPassword = scanner.nextLine();

            if (auth.verifyPassword(inputPassword)) {
                System.out.println("\nAccess granted. File unlocked!");
                break;
            } else {
                System.out.println("Incorrect password!");
            }
        }
        scanner.close();


        if (!auth.isLocked()) {
            try {
                fileScanner = new Scanner(auth.getFile());
                System.out.println("\nHere’s what’s inside the file:\n");
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        } else {
            System.out.println("\nYou have no attempts to unlock the file!");
        }

    }
}

