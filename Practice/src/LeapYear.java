import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To determine given year is a leap year");
        System.out.print("please enter your year: ");
        int year = input.nextInt();
        if (( year % 4 == 0 &&  year % 100 != 0 ) || (year % 400 == 0)) {
            System.out.print("This year is a leap year");
        }else {
            System.out.print("This year is not a leap year ");
        }
    }
}