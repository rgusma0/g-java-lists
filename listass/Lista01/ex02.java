package Lista01;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++      CELSIUS TO FAHRENHEIT CONVERTER!    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.print("Enter the temperature in Celsius -> ");
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius*1.8)+32;
        System.out.println("The temperature in Fahrenheit is -> " + fahrenheit);
        scan.close();
    }
}
