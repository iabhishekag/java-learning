import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr = input();
        System.out.println("Second Largest Number: " + getSecondLargest(arr));
    }

    public static int[] input() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Enter the value of index (" + i + ") : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static int getSecondLargest(int[] arr) {
        int i = arr.length - 1;
        int max = arr[0];
        int smax = -1;
        while (i >= 0){
            if(arr[i] > max) max = arr[i];
            i--;
        }
        i = arr.length - 1;
        while(i >= 0){
            if (arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
            i--;
        }
        return smax;
    }
}
