package Lista02;
import java.util.Scanner;


public class ex05 {

    public static double module(double a){
        if(a < 0) return a * -1;
        return a;
    }


    public static boolean IsTriangle(int[] a, int[] b, int[] c){
        double aB, aC, bC;
        aB = Math.sqrt( (Math.pow( (a[0]-b[0]), 2 )) + (Math.pow( (a[1]-b[1]), 2 )) );
        aC = Math.sqrt( (Math.pow( (a[0]-c[0]), 2 )) + (Math.pow( (a[1]-c[1]), 2 )) );
        bC = Math.sqrt( (Math.pow( (b[0]-c[0]), 2 )) + (Math.pow( (b[1]-c[1]), 2 )) );

        if(module(aB-aC) < bC && bC < (aB+aC)){
            if((aB == aC) && (aC == bC)) System.out.printf("O triangulo é equilátero!\n");
            else if((aB == aC) || (aC == bC) || (bC == aB)) System.out.printf("O triangulo é isósceles!\n");
            else System.out.printf("O triangulo é escaleno!\n");
            return true;
        }
        
        if(module(aB-bC) < aC && aC < (aB+bC)){
            if((aB == aC) && (aC == bC)) System.out.printf("O triangulo é equilátero!\n");
            else if((aB == aC) || (aC == bC) || (bC == aB)) System.out.printf("O triangulo é isósceles!\n");
            else System.out.printf("O triangulo é escaleno!\n");
            return true;
        }

        if(module(bC-aC) < aB && aB < (bC+aC)){
            if((aB == aC) && (aC == bC)) System.out.printf("O triangulo é equilátero!\n");
            else if((aB == aC) || (aC == bC) || (bC == aB)) System.out.printf("O triangulo é isósceles!\n");
            else System.out.printf("O triangulo é escaleno!\n");
            return true;
        }
        
        System.out.printf("Nao é triangulo!\n");
        return false;
    }

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int[][] pairs = new int[3][2];
        
        pairs[0] = new int[2];
        pairs[1] = new int[2];
        pairs[2] = new int[2];

        for(int i = 0; i<3; i++){
            System.out.printf("Digite as coordenadas do ponto %d -> ", i+1);
            pairs[i][0] = keyboard.nextInt();
            pairs[i][1] = keyboard.nextInt();
        }
        
        IsTriangle(pairs[0], pairs[1], pairs[2]);
        keyboard.close();
    }
}

