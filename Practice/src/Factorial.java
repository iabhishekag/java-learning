import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greeting();
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.print("Factorial of " + num + " = " + result);

    }
    public static int factorial(int num){
        int num1 = 1 ;
        int i = 1;
        while (num1 <= num){
            i = i * num1;
            num1++;
        }
        return i;
    }
    public static void greeting(){
        System.out.println("To find factorial of given number");
    }
}
