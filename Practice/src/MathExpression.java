import java.util.Scanner;

public class MathExpression {
    public static void  main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("What is your name ?");
        String name = input.nextLine();
        System.out.println("Hi " + name + ", Good Day!");

        System.out.println("Give me two number for addition:");
        int first = input.nextInt();
        int second = input.nextInt();
        int answer = first + second;
        System.out.println("After adding these value = " + answer);
    }
}

