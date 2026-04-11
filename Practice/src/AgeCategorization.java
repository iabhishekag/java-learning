import java.util.Scanner;

public class AgeCategorization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to categorization of age group");
        System.out.print("Please enter your age (in years): ");
        int age = input.nextInt();
        String category;
        if (age<13){
            category = "child";
        } else if (age < 20) {
            category = "teen";
        } else if (age<60) {
            category = "adult";
        } else {
            category = "senior";
        }
        System.out.print(category);
    }
}
