package Lista02;
import java.util.Scanner;

public class ex03 {
    public static void print_time(int seconds){
        int hour = 00;
        int min = 00;
        if (seconds >= 3600){
            hour = seconds / 3600;
            seconds -= hour * 3600;
        }
        if (seconds >= 60){
            min = seconds / 60;
            seconds -= min * 60;
        }
        System.out.println(hour+":"+min+":"+seconds);
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Digite um tempo em segundos -> ");
        int seconds = keyboard.nextInt();

        print_time(seconds);
        keyboard.close();
    }
}
