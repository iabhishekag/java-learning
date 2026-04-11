import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate simple interest: \n");
        System.out.print("Please enter principal value Rs ");
        int pValue = input.nextInt();
        System.out.print("please enter time (in years): ");
        int time = input.nextInt();
        System.out.print("Please enter rate of interest: ");
        int rate = input.nextInt();
        float sInterest = (float) (pValue * time * rate)/100;
        System.out.print("\nSimple Interest = "+sInterest);
    }
}
