//URI 1002;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio;
        double pi = 3.14159;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();
        sc.nextLine();
        sc.close();

        double area = Math.pow(raio,2) * pi;

        System.out.println("Area = " + area);

    }
}
