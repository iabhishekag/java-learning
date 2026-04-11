import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Side of rectangle: ");
        int S1 = input.nextInt();
        int S2 = input.nextInt();
        int S3 = input.nextInt();
        int S4 = input.nextInt();
        System.out.print("Perimeter of rectangle: " + (S1+S2+S3+S4));
    }
}
