import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] n = input();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of which you want to find occurrence of: ");
        int target = input.nextInt();
        System.out.println("Occurrence of number: " + countFreq(n, target));
    }
    public static int[] input(){
        Scanner input =  new Scanner(System.in);
        System.out.print("enter the length: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        int length = arr.length;
        int i = 0;
        while (i < length){
            System.out.print("enter the value of index (" + i + ") :");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static int countFreq(int[] arr, int target) {
        int i = arr.length - 1;
        int b = 0;
        while (i >= 0) {
            if (arr[i] == target) {
                b += 1;
            }
            i--;
        }
        return b;
    }
}
