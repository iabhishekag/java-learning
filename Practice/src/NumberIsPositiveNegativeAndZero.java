import java.util.Scanner;

public class NumberIsPositiveNegativeAndZero {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        if(num<0){
            System.out.print("your number is negative");
        }else if (num>0){
            System.out.print("Your number is positve");
        }else {
            System.out.print("Your number is zero");
        }
    }
}