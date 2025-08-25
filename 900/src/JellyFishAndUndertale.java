import java.util.*;

public class JellyFishAndUndertale {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            long a = read.nextLong();  // Max timer value
            long b = read.nextLong();  // Initial timer value
            int n = read.nextInt();    // Number of arr

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = read.nextLong();
            }

            long ans = b;
            for(long num : arr){
                ans += Math.min(num,a-1);
            }
            System.out.println(ans);
        }
        read.close();
    }
}
