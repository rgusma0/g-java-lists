package Lista01;
import java.util.Scanner;
public class ex04 {
    
    public static void calculate_coins(int n_cents){
        if (n_cents < 0){
            System.out.println("You must type a positive number of cents.");
            return;
        }
        int[] coins = {100, 50, 25, 10, 5, 1};
        int[] qtd = {0, 0, 0, 0, 0, 0};
        for(int i=0; i<6; i++){
            if(coins[i] <= n_cents){
                qtd[i] = n_cents / coins[i];
                n_cents = n_cents % coins[i];
            }
        }
        for(int i = 0; i < 6; i++){
        System.out.println("Moedas de " + coins[i] + " -> " + qtd[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number of cents: ");
        int n_cents = scan.nextInt();
        calculate_coins(n_cents);
        scan.close();
    }
}
