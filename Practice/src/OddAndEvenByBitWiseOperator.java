import java.util.Scanner;

public class OddAndEvenByBitWiseOperator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To check odd and even by using bitwise opeartor");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        if (((num & 1) == 0)&&((num & 1) != 1)){
            System.out.print("\nYour given number is even.");
        }else {
            System.out.print("\nYour given number is odd.");
        }
    }
}