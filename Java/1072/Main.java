import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner (System.in);

       int n, x, i;
       int in=0, out=0;

       n = sc.nextInt();

       for (i=0; i<n; i++)  //caso faça "i<=n" o programa entra em loop
       {
           x = sc.nextInt();
           sc.nextLine();

           if (x >= 10 && x <= 20)
           {
               in = in + 1;  //inside += 1;
           }

           else
           {
               out = out + 1; //outside += 1;
           }


       }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
        sc.close();

    }
}
