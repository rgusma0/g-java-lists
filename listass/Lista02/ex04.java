package Lista02;
import java.util.Scanner;

public class ex04 {

    public static void print_trip_stats(double distance, double time, double fuel){
        double avg_speed = Math.round((distance/time)* 100.0) / 100.0;
        double km_per_l = Math.round((distance/fuel)* 100.0) / 100.0;

        System.out.println("V. Media: " +avg_speed+ " Km/h\nConsumo Medio: "+km_per_l+" km/l");
    }

    public static void main(String[] args){
        double distance;
        double time;
        double fuel;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite a distancia em Km -> ");
        distance = keyboard.nextDouble();
        System.out.print("Digite o tempo em horas -> ");
        time = keyboard.nextDouble();
        System.out.print("Digite o combustivel consumido em litros -> ");
        fuel = keyboard.nextDouble();
        System.out.println();

        print_trip_stats(distance, time, fuel);
        keyboard.close();

    }
}
