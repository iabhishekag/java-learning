import java.util.Scanner;

public class BitWiseOperators {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwise operators\n");
        System.out.print("Please enter on which operator you want to work on (&,|,>>,<<,^) : ");
        String operator = input.next();
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        int answer = 0;
        if (operator.equals("&")){
            answer = num1 & num2;
        }else if (operator.equals("|")){
            answer = num1 | num2;
        }else if (operator.equals(">>")){
           answer = num1>>num2;
        }else if (operator.equals("<<")){
            answer = num1<<num2;
        } else if (operator.equals("^")) {
            answer = num1 ^ num2;
        }else {
            System.out.println("\nyou have put wrong input.");
            System.exit(0);
        }
        System.out.print("\n" + num1 + " " + operator + " " + num2 + " = " + answer);
    }
}