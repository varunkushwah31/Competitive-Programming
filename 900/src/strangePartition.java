import java.util.Scanner;

public class strangePartition {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int x = read.nextInt();
            long sum = 0;
            long maxBeauty = 0;
            for (int i = 0; i < n; i++) {
                int val  = read.nextInt();
                sum += val;
                maxBeauty += (val+x-1)/x;
            }
            long minBeauty = (sum + x - 1)/x;
            System.out.println(minBeauty + " " + maxBeauty);
        }
    }
}
