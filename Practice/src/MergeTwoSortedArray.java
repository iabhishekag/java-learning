import java.util.Scanner;

public class MergeTwoSortedArray {
   public static void main() {
       Scanner input = new Scanner(System.in);
       System.out.println("Size of arr 1 = ");
       int len1 = input.nextInt();
       int[] arr1 = new int[len1];
       input(arr1, len1);
       System.out.print("Size of arr 2 : ");
       int len2 = input.nextInt();
       int [] arr2 = new int[len2];
       input(arr2, len2);
       int[] arr =  merge(arr1, arr2);

       printArray(arr);

   }

    public static void input (int[] arr, int len){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < len){
            System.out.print("Enter the index value (" + i + ") : ");
            arr[i] = input.nextInt();
            i++;
        }
    }


    public static int[] merge(int arr1[], int arr2[]){
       int[] arr = new int[arr1.length + arr2.length];
       int i = 0;
       int j = 0;
       int k = 0;
       while (arr1.length > i && arr2.length > j) {
           if (arr1[i] < arr2[j]) {
               arr[k] = arr1[i];
               k++;
               i++;
           } else if (arr1[i] > arr2[j]) {
               arr[k] = arr2[j];
               j++;
               k++;
           }else if (arr[i] == arr[j]){
               arr[k] = arr[i];
               k++;
               i++;
           }
       }
       while (i < arr1.length) {
           arr[k] = arr1[i];
           i++;
           k++;
       }
       while (j < arr2.length){
           arr[k] = arr2[j];
           k++;
           j++;
       }
       return arr;
    }
    public static void printArray(int arr[]){
       int i = 0;
       while (i < arr.length){
           System.out.print(arr[i] + " ");
           i++;
       }
    }
}
