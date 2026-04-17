import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greeting();
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        int sum = sumOfDigit(num);
        System.out.print("Sum of digit of " + num + " = " + sum);
    }
    public static void greeting(){
        System.out.println("Welcome to compute the sum of digit of integer");
    }
    public static int sumOfDigit(int num){
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
