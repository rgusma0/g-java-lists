import java.util.Scanner;
public class ex02 {
    public static int[] Fill(int num){
        Scanner key = new Scanner(System.in);
        int[] array = new int[num];
        for (int i = 0; i<num; i++){
            System.out.printf("Digite o valor "+i+"-> ");
            array[i] = key.nextInt();
            key.nextLine();
            
        }
        key.close();

        return array;
    }
    public static void check(int[] list ,int number, int size){
        int happened = 0;
        for(int i = 0; i<size; i++){
            if(list[i] == number){
                happened++;
                System.out.println("O numero "+number+" aparece em ["+i+"]");  
            }
            
        }
        if (happened < 1) System.out.println("Numero nao encontrado!");
    }
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int size = 0;
        int number;

        System.out.printf("Digite o numero a ser buscado -> ");
        number = key.nextInt();

        System.out.printf("Digite o tamanho do vetor -> ");
        size = key.nextInt();
        
        int[] array = new int[size];
        array = Fill(size);
   
        check(array, number, size);
        
        key.close();
        
    }
}
