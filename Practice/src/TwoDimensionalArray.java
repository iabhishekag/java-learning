import java.util.Scanner;

public class TwoDimensionalArray {
  public static void main(){
    Scanner input = new Scanner(System.in);
      System.out.println("please enter the dimension of array :");
      System.out.print("Dim-1 = ");
      int D1 = input.nextInt();
      System.out.print("Dim-2 = ");
      int D2 = input.nextInt();
      int [][] arr = new int[D1][D2];
      int i = 0;
      while (i < D1){
          int j = 0;
          while ( j < D2){
              System.out.print("Enter the index value [" + i + ", " + j + "] : ");
              arr[i][j] = input.nextInt();
              j++;
          }
          i++;
      }
    System.out.print("Please select the number you want to search : ");
    int num = input.nextInt();
    int a = 0;
    myLabel:
    while (a < D1){
        int b = 0;
        while (b < D2){
            if (num == arr[a][b]){
                System.out.println("Your number is found in array at index value of (" + a + ", " + b + ")");
                break myLabel;
            }
            b++;
        }
        a++;
    }
    if(a == D1){
      System.out.println("Your number is not found in array.");
    }
  }
}
