import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To convert Fahrenheit to Celcius\n");
        System.out.print("Temperature in Fahrenheit: ");
        float fah = input.nextFloat();
        System.out.print("Temperature in Celsius: " + ((fah-32)*5/9)+"C");
    }
}
