import java.util.Scanner;

public class Soma3e5 {
    public static void main(String[] args) {
        int x = 3;
        int z = 5;
        int res = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um numeroº: ");
        int numEnt = ent.nextInt();
        for (int i = 0; i < numEnt; i++) {
            if (i % x == 0 || i % z == 0) {
                res += i;
            }
        }
        System.out.println("A soma dos multiplos de 3 e 5 abaixo de " + numEnt +", é: " + res);
    }
}

