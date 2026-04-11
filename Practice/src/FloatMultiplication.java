import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication of two number");
        System.out.print("Please enter your first number: ");
        float fnum = input.nextFloat();
        System.out.print("Please enter your second number: ");
        float snum = input.nextFloat();
        System.out.println("Multiply: " +(fnum*snum));
        double mul = fnum*snum;
        System.out.println("Multiply: " + mul);
    }
}
