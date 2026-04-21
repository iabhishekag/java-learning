import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest common divisor of two number");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcdMethod2(num1, num2));
    }
    public static int gcdMethod1(int num1, int num2){
        int gcd = 1;
        int num = 2;
        int minNumberToCheck = Math.min(num1, num2);
        while (num <= minNumberToCheck) {
            int i = 1;
            while(i < 11){
                int factor = num * i;
                if (num1 % factor == 0 && num2 % factor == 0) {
                    gcd = factor;
                }
                i++;
            }
            num++;
            if(gcd == num1 || gcd == num2) {
                return gcd;
            }
        }
        return gcd;
    }

    public static int gcdMethod2(int num1, int num2){
        while (num1 > 0 && num2 > 0){
            if ( num1 > num2){
                num1 = num1 % num2;
            }else{
                num2 = num2 % num1;
            }
        }
        if ( num1 > num2){
            return num1;
        }
        return num2;
    }
}
