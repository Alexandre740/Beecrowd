//URI 1003;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.printf("Soma = " +
                "%d", x+y);

        sc.close();
    }
}