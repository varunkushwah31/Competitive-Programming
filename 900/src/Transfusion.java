import java.util.*;

public class Transfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            long sumOdd = 0, sumEven = 0;
            int countOdd = 0, countEven = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sumEven += v[i];
                    countEven++;
                } else {
                    sumOdd += v[i];
                    countOdd++;
                }
            }

            boolean valid = true;
            if (countOdd == 0 || countEven == 0) {
                valid = (sumOdd == sumEven); // handle division by zero edge case
            } else {
                valid = (sumOdd % countOdd == 0 && sumEven % countEven == 0 &&
                        sumOdd / countOdd == sumEven / countEven);
            }

            System.out.println(valid ? "YES" : "NO");
        }
        sc.close();
    }
}
