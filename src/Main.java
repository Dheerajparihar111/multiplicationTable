import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Multiplication Table Generator ===");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter range: ");
        int range = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":\n");
        System.out.println("----------------");
        for (int i = 1; i <= range; i++) {
            System.out.println("|"+" "+ i+") "+number + " x " + i + " = " + (number * i)+" |");
        }
        System.out.println("-----------------");
        scanner.close();
    }
}