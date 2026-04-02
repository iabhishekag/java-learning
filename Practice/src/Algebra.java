import java.util.Scanner;

public class Algebra {
    public static void main(String[] args){
        System.out.print("Enter three value:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result = a+b-c;
        System.out.print("Result of a+b-c : " + result);
    }
}
