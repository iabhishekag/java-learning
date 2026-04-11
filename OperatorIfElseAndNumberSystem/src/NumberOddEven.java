import java.util.Scanner;

public class NumberOddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        if (num%2==0){
            System.out.print("Your no. is even");
        }else{
            System.out.print("your no. is odd");
        }
    }
}
