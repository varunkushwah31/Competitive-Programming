import java.util.Scanner;

public class Shaslik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long f = 0, p = 0;
            long k1 = k, k2 = k;

            if (k1 >= a) {
                f = (k1 - a) / x + 1;
                k1 -= f * x;
                if (k1 >= b) {
                    f += (k1 - b) / y + 1;
                }
            }

            if (k2 >= b) {
                p = (k2 - b) / y + 1;
                k2 -= p * y;
                if (k2 >= a) {
                    p += (k2 - a) / x + 1;
                }
            }

            System.out.println(Math.max(f, p));
        }

        sc.close();
    }
}
