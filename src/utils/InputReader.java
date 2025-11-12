package utils;
import java.util.Scanner;

public class InputReader {
    private static final Scanner sc = new Scanner(System.in);

    public static int scanNum() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            sc.next();
        }
        return sc.nextInt();
    }
}
