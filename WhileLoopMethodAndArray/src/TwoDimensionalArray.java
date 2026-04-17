public class TwoDimensionalArray {
    public static void main(String[] args) {
//        int[][] myArry = new int[3][3];
        int[][] arr = {{1,2,3},{4,5,6}};
        int index = 0;
        while (index < arr.length){
            int i = 0;
            while (i < arr[index].length) {
                System.out.print(arr[index][i] + " ");
                i++;
            }
            System.out.println();
            index++;
        }
    }
}