package utils;
import java.util.Scanner;

public class InputReader {
    private static final Scanner sc = new Scanner(System.in);

    public static int scanNum() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            sc.next();
        }
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    public static long scanLong() {
        while (!sc.hasNextLong()) {
            System.out.println("Please enter a valid number.");
            sc.next();
        }
        long num = sc.nextLong();
        sc.nextLine();
        return num;
    }

    public static String scanString() {
        String input = sc.nextLine();
        while (input == null) {
            System.out.println("Por favor, ingrese un texto válido:");
            input = sc.nextLine();
        }
        return input;
    }
}
