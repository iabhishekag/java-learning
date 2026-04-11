import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Before Swap");
    float first = input.nextFloat();
    System.out.println("First number = " + first);
    float second = input.nextFloat();
    System.out.println("Second number = " + second);
    float third = first;
    first = second;
    second = third ;
    System.out.println("After swap");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
    }
}
