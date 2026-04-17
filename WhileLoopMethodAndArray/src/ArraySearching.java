import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Welcome to Array Searching");
        System.out.print("Please entr the number: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println("Your number is founf in array");
        }else {
            System.out.println("Your number is not found in array");
        }

    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
