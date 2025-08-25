import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0) {
            int n = read.nextInt();
            int k = read.nextInt();
            int x = read.nextInt();

            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            } else {
                if (k == 1 || (k == 2 && n % 2 == 1)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    if (n % 2 == 0) {
                        System.out.println(n / 2);
                        for (int i = 0; i < n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println((n - 3) / 2 + 1);
                        for (int i = 0; i < (n - 3) / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.print(3);
                        System.out.println();
                    }
                }
            }
        }
    }
}
