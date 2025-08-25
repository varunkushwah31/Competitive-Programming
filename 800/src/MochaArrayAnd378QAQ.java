import java.util.*;

public class MochaArrayAnd378QAQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // size of array
            long[] v = new long[n];

            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextLong();
            }

            Arrays.sort(v);
            long a = v[0];
            long b = 0;
            boolean ans = true;

            for (int i = 0; i < n; i++) {
                if (v[i] % a != 0) {
                    b = v[i];
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (v[i] % a != 0 && v[i] % b != 0) {
                    ans = false;
                    break;
                }
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
