import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int[]  arr = input();
        int [] minMax = minMax(arr);
        System.out.println("Maximum number: " + minMax[1]);
        System.out.println("Minimum number: " + minMax[0]);
    }
    public static int[] input(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the length of array: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        int i = 0;
        while (i < n){
            System.out.print("Enter the value of index (" + i + ") : " );
             arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static int[] minMax(int[] arr){
        int i = arr.length - 1;

        int []minMax = {arr[0], arr[0]}; // 0: min, 1: max

        while (i > 0){
            minMax[1] = Math.max(minMax[1], arr[i]);
//            if (arr[i] > max) {
//                max = arr[i];
//            }
            minMax[0] = Math.min(minMax[0], arr[i]);
            i--;
        }
        return minMax;
    }
}
