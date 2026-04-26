package Lista02;
import java.util.Scanner;

public class ex02 {
    public static void operacoes(float x, float y){
        float soma = x + y;
        float sub = x - y;
        float mult = x * y;
        float div = x / y;

        System.out.println("soma = "+soma);
        System.out.println("subtracao = "+sub);
        System.out.println("multiplicacao = "+mult);
        System.out.println("divisao = "+div);
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite um inteiro -> ");
        float x = (float)keyboard.nextInt();
     
        System.out.print("Digite outro inteiro -> ");
        float y = (float)keyboard.nextInt();

        operacoes(x,y);
        
        keyboard.close();
    }
}
