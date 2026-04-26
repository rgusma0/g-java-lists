import java.util.Scanner;

public class ex03 {
    public static void PrintArray(int[] array, int size){
        for(int i = 0; i < size; i++){
            System.out.println("["+i+"] -> "+array[i]);
        }
    }

    public static int[] Fill(int size){
        Scanner key = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i<size; i++){
            System.out.printf("Digite o valor "+(i+1)+"-> ");
            array[i] = key.nextInt();
            
        }
        key.nextLine();
        key.close();
        
        return array;
    }

    public static void InsertCarry(int[] array, int size, int k, int p){
        
        if(!(p >= size)){
            int aux = array[p];
            array[p] = k;

            for(int i = p+1; i < size; i++){
                k = array[i];
                array[i] = aux;
                aux = k;
            }
            return;
        }

        System.out.printf("Posicao invalida!\n");

        }
        
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int size, k, p;
        System.out.printf("Digite o numero e a posicao a ser inserido -> ");
        k = keyboard.nextInt();
        p = keyboard.nextInt();

        System.out.printf("Digite o tamanho do vetor -> ");
        size = keyboard.nextInt();
        int[] array = Fill(size);

    
        InsertCarry(array, size, k, p);

        PrintArray(array, size);
        keyboard.close();
    }
}


