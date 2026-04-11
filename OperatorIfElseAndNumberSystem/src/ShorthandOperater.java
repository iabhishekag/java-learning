import java.util.Scanner;

public class ShorthandOperater {
    public static void main(String[] args){
        int a = 5;
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        a = a + first;
        System.out.println(a);
        int b = 10;
        int second = input.nextInt();
        b = b + second;
        System.out.println(b);

        int c = 20;
        int third = input.nextInt();
        c += third;
        System.out.println(c);
        int d = 30;
        int fourth = input.nextInt();
         d -= fourth ;
        System.out.println(d);
    }
}
