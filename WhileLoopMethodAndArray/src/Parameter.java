import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        int num0 = sumOfTwoNUmber(4,5);
        System.out.println(num0);
        int num1 = sumOfTwoNUmber(2,3);
        System.out.println(num1);
    }
    public static int sumOfTwoNUmber(int first , int second){
        Scanner input = new Scanner(System.in);
        System.out.println("First number received " + first);
        System.out.println("First number received " + second);
        int sum = first + second;
        return sum;
    }
}
