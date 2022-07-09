import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        int num, fat = 1;

        System.out.println("Digite um numeroº");
        num = ent.nextInt();

        for(int i = 1;i <= num; i++){
            fat = fat * i;
        }

        System.out.println("!" + num + " = " + fat);
    }
}
