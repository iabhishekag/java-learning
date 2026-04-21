import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Good Morning, To find LCM (least common factor) of two number");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("LCM of " + num1 + " and " + num2 + " = " + lCM(num1, num2));
    }

    public static int lCM(int num1, int num2){
        int num = 1;
        while (num <= num2){
            if ((num1 * num) % num2 == 0){
                return num1 * num;
            }
            num++;
        }
        return 0;
    }
}
