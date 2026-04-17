import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args) {
        greet();
        int first = readNumber() + 100;
        int second = readNumber();
        System.out.print("result: " + (first+second));
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = input.nextInt();
        return num;
    }
    public static void greet(){
        System.out.println("Welcome to simple calculator");
    }

}
