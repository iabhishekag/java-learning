import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate Compound Interest");
        System.out.print("Please enter principle amount Rs");
        float principle = input.nextFloat();
        System.out.print("Enter your rate of interest:  ");
        float rate = input.nextFloat();
        System.out.print("Enter your time (in years): ");
        float time = input.nextFloat();
        double interest = principle*Math.pow(((1+rate)/100),time);
        System.out.print("\nCompound Interest: "+interest);
    }
}
