public class Array {
    public static void main(String[] args) {

       int[] myArr = new int[10];
          myArr[0] = 20;
          myArr[2] = 5;

        int[] mymethod = {5,4,3,2,1,0};
        System.out.println(myArr[0] + myArr[2]);
        int[] my = new int[5];
        // Array Traversal
        int i = 0;
        while (i < mymethod.length){
            System.out.println(mymethod[i]);
            i += 1;
        }
        int arr[][] = {
                {2, 3, 4},
                {1, 4, 5}
        };
        int [][]ar = new int[2][3];
        ar[1][2] = 100;
        System.out.println();

        arr[0][1] = 12;

        System.out.println();

    }
}
