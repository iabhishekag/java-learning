import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        int[] n = input();
        System.out.println("Mean of all elements of array: " + findMean(n));
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
    public static int findMean(int[] arr) {
        int sum = 0;
        int i = arr.length - 1;
        while(i >= 0){
            sum = sum + arr[i];
            i--;
        }
        return (int) Math.floor(sum / arr.length);
    }
}
