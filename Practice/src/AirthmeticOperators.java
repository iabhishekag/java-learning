import java.util.Scanner;

public class AirthmeticOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstnum = input.nextInt();
        System.out.println("first number: " + firstnum);
        int secondnum = input.nextInt();
        System.out.println("second number: " + secondnum);
        System.out.println("\n" + "Addition: " + (firstnum+secondnum));
        System.out.println("Substact: " + (firstnum-secondnum));
        System.out.println("Multiplication: "+(firstnum*secondnum));
        System.out.println("Division: "+(firstnum/secondnum));
        System.out.println("Modulus: " + (firstnum%secondnum));
    }
}
