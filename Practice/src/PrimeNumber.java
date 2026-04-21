import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int i = 2;
        if (num < 2){
            System.out.println("Your number is not prime");
            System.exit(0);
        }
        boolean isPrime = true; // assumption
        while (i < num){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }

        if(isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime");
        }
    }
}