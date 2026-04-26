package Lista02;
import java.util.Scanner;

public class ex01 {
    public static void operacoes(int x, int y){
        int soma = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;

        System.out.println("soma = "+soma);
        System.out.println("subtracao = "+sub);
        System.out.println("multiplicacao = "+mult);
        System.out.println("divisao = "+div);
    }

    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite um inteiro -> ");
        int x = keyboard.nextInt();
     
        System.out.print("Digite outro inteiro -> ");
        int y = keyboard.nextInt();

        operacoes(x,y);
        
        keyboard.close();
    }
}
