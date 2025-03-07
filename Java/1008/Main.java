//URI 1008;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, hoursWorked;
        double workPrice, salary;

        number = sc.nextInt();
        hoursWorked = sc.nextInt();
        workPrice = sc.nextDouble();
        sc.close();

        salary = hoursWorked * workPrice;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}
