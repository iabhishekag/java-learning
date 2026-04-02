import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        System.out.println("Please enter two number = ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Value 1 = " + a + ", " + "Value 2 = " + b);

        int sum = a + b;

        System.out.print("Sum of " + a + " and " + b + " = " + sum );


    }
}

