import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            int a1 = read.nextInt();
            int a2 = read.nextInt();
            int a4 = read.nextInt();
            int a5 = read.nextInt();


            int[] possibleA3 = {
                    a1 + a2,
                    a4 - a2,
                    a5 - a4
            };

            int maxFibonacciness = 0;

            for (int a3 : possibleA3) {
                int count = 0;
                if (a3 == a1 + a2) count++;
                if (a4 == a2 + a3) count++;
                if (a5 == a3 + a4) count++;
                maxFibonacciness = Math.max(maxFibonacciness, count);
            }

            System.out.println(maxFibonacciness);
        }

        read.close();
    }
}
