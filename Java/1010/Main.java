//URI 1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int codigo1, numeroPecas1, codigo2, numeroPecas2;
        double valorPeca1, valorPeca2;

        codigo1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        sc.nextLine();
        codigo2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        sc.close();

        double valor1, valor2, valorTotal;

        valor1 = numeroPecas1 * valorPeca1;
        valor2 = numeroPecas2 * valorPeca2;
        valorTotal = valor1 + valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
