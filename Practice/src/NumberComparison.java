import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number (2/3): ");
        int num = input.nextInt();
        System.out.print("first number: ");
        int num1 = input.nextInt();
        System.out.print("second number: ");
        int num2 = input.nextInt();
        int result;
        if (num==2) {
            if (num1>num2) {
                result = num1;
            }else{
                result = num2;
            }
        } else {
            System.out.print("third number: ");
            int num3 = input.nextInt();
            if (num1>num2 && num1>num3){
               result = num1;
            } else if (num2 > num1 && num2 > num3) {
                result = num2;
            }else{
                result = num3;            }
        }

        System.out.println("Result = " + result);

    }
}
