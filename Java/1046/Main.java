import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        //Caso das 24 horas
        if (a == b)
        {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        //a > b (a=16, b=2)
        else if (a > b)
        {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", (24-a) + b);
        }

        //a < b (a=2, b=16)
        else if (a < b)
        {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", b-a);
        }

    }
}
