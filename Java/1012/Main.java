//URI 1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.nextLine();
        sc.close();

        //a) área do triângulo retângulo que tem A por base e C por altura
        double areaTriangulo = a * c / 2;
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);

        //b) área do círculo de raio C. (pi = 3.14159)
        double areaCirculo = 3.14159 * Math.pow(c,2);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);

        //c) área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = (a + b) * c / 2;
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);

        //d) área do quadrado que tem lado B.
        double areaQuadrado = Math.pow(b,2);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);

        //e) área do retângulo que tem lados A e B.
        double areaRetangulo = a * b;
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

    }
}
