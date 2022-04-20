import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// User Input

        float Num_1;// First Input
        float Num_2;// Second Input

        System.out.println("Enter First Number");
        Num_1 = input.nextFloat();

        System.out.println("Enter Second Number");
        Num_2 = input.nextFloat();

        System.out.println("Your First Number = " + Num_1 + " And " + "Second Number = " + Num_2);

        System.out.println("Press 1 for addition , 2 for subtraction, 3 for multiplicaion, 4 for division");

        int operater = input.nextInt();

        // Switch Statement for Calculation
        switch (operater) {
            case 1:
                System.out.println("You select Addition");
                System.out.println("The Result = " + (Num_1 + Num_2));// plus
                break;

            case 2:
                System.out.println("You select Subtraction");
                System.out.println("The Result = " + (Num_1 - Num_2));// Minus
                break;

            case 3:
                System.out.println("You select Multipication");
                System.out.println("The Result = " + (Num_1 * Num_2));// Multiplication
                break;

            case 4:
                System.out.println("You select Division");
                System.out.println("The Result = " + (Num_1 / Num_2));// Division
                break;

            default:
                System.out.println("Invalid selection!");// No case match then this message will be printed
        }
        // @Created By Vaibhav Sharma
    }
}