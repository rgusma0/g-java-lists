
public class ex01{
    public static void show_mult(){
        int a = 0;
        int b = 0;
        int c = 0;

        for(a = 0; a<=10; a++){
            for(b = 0; b <= 10; b++){
                c = a * b;
                System.out.printf("%d X %d = %d\t|", b, a, c);
            }
            System.out.println("\t|");
        }
    }
    public static void main(String[] args){
        show_mult();
    }
}

