package Lista02;
import java.util.Scanner;

//nome preco e qtd
//10und preco cheio
//11 a 20 -> 10%
//21 a 50 -> 20%
//50+ -> 25%

public class ex06 {
    public static double FinalValue(double price, int qtd){
        if(qtd <= 10) return price * qtd;
        if(qtd <= 20) return price * qtd * 0.9;
        if(qtd <= 50) return price * qtd * 0.8;
        return price * qtd * 0.75;
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String name;
        double price;
        int qtd;
        int control = 1;

        while(control > 0){
            
            System.out.printf("Digite o nome do produto -> ");
            name = keyboard.nextLine();

            System.out.printf("Digite o preco do produto -> ");
            price = keyboard.nextDouble();

            System.out.printf("Digite a quantidade do produto -> ");
            qtd = keyboard.nextInt();

            price = FinalValue(price, qtd);
            String total = String.format("%.2f", price);

            System.out.println(name+" \nValor total a ser pago: R$" +total);

            System.out.printf("Quer adicionar outro produto? (1/-1) ");
            control = keyboard.nextInt();
            keyboard.nextLine();
        }
    
        keyboard.close();
    }
}
