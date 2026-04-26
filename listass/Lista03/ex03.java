
import java.util.Scanner;

public class ex03 {

    public static int word_length(String word){
        int size = 0;
        size = word.length();
        return size;
    }

    public static void print_to_upper(String word){
        word = word.toUpperCase();
        System.out.println(word);
    }

    public static void print_to_lower(String word){
        word = word.toLowerCase();
        System.out.println(word);
    }

    public static int appearences_of(char character, String word){
        int number = 0;
        int i;
        int size = word.length();
        String wordlow = word.toLowerCase();
        for(i = 0; i < size; i++){
            if(wordlow.charAt(i) == character) number++;
        }
        return number;
    }


    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase -> ");
        String word = teclado.nextLine();

        int size = 0;
        size = word_length(word);
        System.out.println("String size -> "+size);

        print_to_upper(word);
        print_to_lower(word);

        int appearences = 0;
        char character = 'a';
        appearences = appearences_of(character, word);
        System.out.println("\"a\" appearences -> "+appearences);

        teclado.close();
    }
}
