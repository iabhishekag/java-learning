import java.util.Scanner;

public class LearningIfElseAndRelationalOperator {
    public static void main(String [] args){
        boolean isAnAdult = false;
        boolean isAnTeenager = true;
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();
        if(isAnAdult){
            System.out.println("Hello,Mr. "+name);
        }else if (isAnTeenager) {
            System.out.print("Please enter your age: ");
            int age = input.nextInt();
           if (age >= 18){
                System.out.print("You are eligible for driving.");
            }else{System.out.print("you are not eligible for driving.");
            }
        }else{
            System.out.print("Hello,How may I help you?");
        }
    }
}
