package Lista02;
import java.util.Scanner;

public class ex07 {
    public static boolean IsBeetween(int a, int b, int c){
        if(b > c){
            if(a < b && a > c ){
                System.out.printf("O numero está no intervalo!\n");
                return true;
            }
        }
        else if(a < c && a > b){
            System.out.printf("O numero está no intervalo!\n");
            return true;
        }

        System.out.printf("O numero nao está no intervalo!\n");
        return false;
    }
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        System.out.printf("Digite um numero -> ");
        a = keyboard.nextInt();
        System.out.printf("Digite o segundo numero -> ");
        b = keyboard.nextInt();
        System.out.printf("Digite o terceiro numero -> ");
        c = keyboard.nextInt();

        IsBeetween(a, b, c);
        
        keyboard.close();
    }
}
