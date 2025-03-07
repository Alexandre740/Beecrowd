import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco;

        switch (codigo)
        {
            case 1:
                preco = 4.00 * quantidade;
                System.out.printf("Total: R$ %.2f\n", preco);
                break;

            case 2:
                preco = 4.50 * quantidade;
                System.out.printf("Total: R$ %.2f\n", preco);
                break;

            case 3:
                preco = 5.00 * quantidade;
                System.out.printf("Total: R$ %.2f\n", preco);
                break;

            case 4:
                preco = 2.00 * quantidade;
                System.out.printf("Total: R$ %.2f\n", preco);
                break;

            case 5:
                preco = 1.50 * quantidade;
                System.out.printf("Total: R$ %.2f\n", preco);
                break;

        }

    }
}