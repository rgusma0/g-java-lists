
import java.util.Scanner;


public class ex02 {
    // A Solucao A eh a correta.
    // A Solucao B poderia ser corrigida usando um "while... do" ao inves de um "do... while"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo = 0;

        while (codigo != -1){
            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            System.out.println("Código: " + codigo);
        } teclado.close();
    }
}

