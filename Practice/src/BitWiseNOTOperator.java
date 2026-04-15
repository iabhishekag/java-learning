import java.util.Scanner;

public class BitWiseNOTOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwise NOT operator\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("\n ~" + num1 + " = " + (~num1) );
    }
}