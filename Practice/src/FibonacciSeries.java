import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number up to to which you want the fibonacci series: ");
        int n = input.nextInt();
        int []arr = fibSeries(n);
        printArray(arr);
    }

    public static int[] fibSeries(int n) {
        int []arr = new int[n+1]; // for storing fib series

        int num1 = 0;
        arr[0] = num1;
        int num2 = 1;
        arr[1] = num2;
        int i = 2;
        while (i <= n){
            int num = num1 + num2;
            arr[i] = num;
            num1 = num2;
            num2 = num;
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        int length = arr.length;
        int a = 0;
        while (a < length){
            System.out.print(arr[a] + " ");
            a++;
        }
    }
}