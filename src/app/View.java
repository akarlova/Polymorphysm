package app;

import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        System.out.println("Enter your first number ");
        String parameterOne = scanner.nextLine().trim();
        System.out.println("Enter your second number ");
        String parameterTwo = scanner.nextLine();
        scanner.close();
        return new String[]{parameterOne, parameterTwo};
    }
}
