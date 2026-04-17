import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in to Multiplication table for a given number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num) {
        int count = 0;
        while (count < 11) {
            int result = num * count;
            System.out.println(num + " * " + count + " = " + result);
            count++;
        }
    }
}