import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = input.nextInt();
        int sum = 0;
        int num = n;
        while (n != 0){
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, 3);
            n = n / 10;
        }
        if (num == sum){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}
