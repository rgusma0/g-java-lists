package Lista01;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter yout name -> ");
        String name = scan.nextLine();
        System.out.println("Ola, " + name + "! Bem-vindo ao Java!" );
        scan.close();
    }
}
