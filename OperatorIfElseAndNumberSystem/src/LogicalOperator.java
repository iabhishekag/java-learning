import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args){
        System.out.print("Welcome to Ticket discount counter\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Are you male? True / False: ");
        boolean isMale = input.nextBoolean();
        System.out.print("enter your age: ");
        int age = input.nextInt();

       if(isMale) {
           System.out.println("No Discount for males");
       } else {
           if(age < 5) {
               System.out.println("Discount: 75%");
           } else if(age > 60) {
               System.out.println("Discount: 25%");
           } else {
               System.out.println("Discount: 50%");
           }
       }
    }
}
