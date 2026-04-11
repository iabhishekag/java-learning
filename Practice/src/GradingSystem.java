import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grading System");
        System.out.print("Marks in physics: ");
        int physics = input.nextInt();
        System.out.print("Marks in chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Marks in Maths: ");
        int maths = input.nextInt();
        int percentage = ((physics+chemistry+maths)/3)*100;
        char grade;
        if (percentage>90){
            grade = 'A'; 
        } else if (percentage > 75 ) {
            grade = 'B';
        } else if (percentage > 60 ) {
            grade = 'C';
        } else if (percentage > 30 ) {
            grade = 'D';
        }else {
            grade = 'E';
        }
        System.out.print("Calculated grade based on marks: "+grade);
    }
}