import java.util.Scanner;

public class PatternPyramid {
    public static void main(String[] args) {
        int num = input();
        System.out.println("right half pyramid:");
        rightHalfPyramid(num);
        System.out.println("Reverse left pyramid:");
        reverseLeftHalfPyramid(num);
        System.out.println("left pyramid:");
        leftHalfPyramid(num);
    }
    public static int input(){
        Scanner input =  new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = input.nextInt();
        return n;
    }
    public static void rightHalfPyramid(int num){
        int i = 1;
        while (i <= num){
            int j = i;
            while (j != 0){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void reverseLeftHalfPyramid(int num) {
        int i = num;
        while ( i != 0){
            int j = i;
            while ( j != 0){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i--;
        }
    }

    public static void leftHalfPyramid(int num){
        int i = num;
        int l = 2;
        while ( i != 0){
            int k = 1;
            int j = i - 1;
            while ( j > 0){
                System.out.print(" ");
                j--;
            }
            while ( k < l ){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
            l++;
        }
    }
}