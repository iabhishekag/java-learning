import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate area of triangle: ");
        System.out.print("Base of triangle (in cms): ");
        float base = input.nextFloat();
        System.out.print("Height of triangle (in cms): ");
        float height = input.nextFloat();
        System.out.print("\n"+"Area of triangle: "+((base*height)/2)+" cms2");
    }
}
