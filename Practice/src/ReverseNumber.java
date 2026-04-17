import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse the given number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse number of " + num + " = " + reverse);
        if(num == reverse) {
            System.out.println("This number is palindrome");
        }
    }

    public static int count(int num){
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static int reverse(int num){
        int sum = 0;
        int count = count(num);
        while (num != 0){
          int rem = num % 10 ;
          int  product = (int) Math.pow(10, (count - 1)) * rem;
          sum = product + sum;
          count--;
          num /= 10;
        }
        return sum;
    }
}
