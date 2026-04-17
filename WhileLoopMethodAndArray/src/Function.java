public class Function {
    public static void main(String[] args) {
        System.out.println("Method before ");
        greeting();
        System.out.println("complete Method");
        leftHandPyramid();
    }
    public static void leftHandPyramid(){
        int pattern =0;
        while (pattern <= 5){
            System.out.print("*");
            int i = 0;
            while (i < pattern){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            pattern++;
        }
    }

    public static void greeting(){
        System.out.println("Good Morning from KGCoding");
    }
}