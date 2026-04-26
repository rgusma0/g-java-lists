package Lista01;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.print("Type a number -> ");
        num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even!");
        } else {
            System.out.println("The number " + num + " is odd!");
        }
        scan.close();
    }
}
