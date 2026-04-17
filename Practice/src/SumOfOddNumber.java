import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of all Odd number from 1 to given number");
        System.out.print("Please enter the number at which you to end the sum: ");
        int lastnum = input.nextInt();
        int sum = result(lastnum);
        System.out.println("sum of odd number till "+ lastnum + ": " + sum);
    }
    public static int result(int lastnum){
        int num = 1;
        int sum = 0;
        while (num <= lastnum){
            sum += num;
            num = num + 2;
        }
        return sum;
    }
}
