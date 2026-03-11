import java.util.Scanner;
import java.math.*;
class homepage{
 void homepage(){
        System.out.println("___________________________");
        System.out.println("| 1) Multiplication Table |");
        System.out.println("| 2) Square               |");
        System.out.println("| 3) Cube                 |");
        System.out.println("---------------------------");
        System.out.print("Enter Your Choice: ");
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        homepage home = new homepage();
        home.homepage();

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println("=== Multiplication Table Generator ===");
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.print("Enter range: ");
            int range = scanner.nextInt();
            System.out.println("\nMultiplication Table of " + number + ":\n");
            System.out.println("-------------------");
            for (int i = 1; i <= range; i++) {
                System.out.println("|" + " " + i + ") " + number + " x " + i + " = " + (number * i));
            }
            System.out.println("--------------------");
            break;
            case 2:
                System.out.println("==========Square Table Generator=========");
                System.out.print("Enter the Number: ");
                int numberSquare = scanner.nextInt();
                for (int i = 1;i<2;i++){
                    System.out.println(numberSquare +" = "+ (numberSquare*numberSquare));
                }
                break;
            case 3:
                System.out.println("============Cube Table Generator===========");
                System.out.print("Enter The Number :");
                int cubeNumber = scanner.nextInt();
                System.out.println(cubeNumber+" = "+(cubeNumber*cubeNumber*cubeNumber));

        }
        scanner.close();
    }
}