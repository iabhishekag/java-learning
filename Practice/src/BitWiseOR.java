import java.util.Scanner;

public class BitWiseOR{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise OR operator\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your Second number: ");
        int num2 = input.nextInt();
        System.out.println("The bitwise OR of two number: " + (num1 | num2));
        System.out.print("The bitwise >> : " + (num1 >> 1 ));
    }
}
