import java.util.Scanner;

public class ex01{
    public static float Mediaturma(int num){
        int[] note_list = new int[num];
        int i = 0;
        float media = 0;
        Scanner keyboard = new Scanner(System.in);

        for (i = 0; i<num; i++){
            System.out.printf("digite o aluno "+(i+1)+" -> ");
            note_list[i] = keyboard.nextInt();
            media = media+note_list[i];
            System.out.println();

        }
        media = media/num;
        keyboard.close();

        System.out.println("Media da turma: "+media);
        for(i = 0; i<num; i++){
            if (note_list[i] > media) System.out.println("Aluno "+(i+1)+" acima da media: "+media);
        }
        

        return media;
    }
    public void main(String[] args){
        int num = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Qual o numero de alunos da turma?");
        num = keyboard.nextInt();
        Mediaturma(num);
        keyboard.close();
    }

}