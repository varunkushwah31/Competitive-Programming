import java.util.Scanner;

public class SumOfMedian {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int k = read.nextInt();
            int[] arr = new int[n*k];
            for (int i = 0; i < n*k; i++) {
                arr[i] = read.nextInt();
            }
            long sum = 0;
            int medianpos = (n+1)/2;
            int step = n-medianpos+1;
            int idx = n*k - step;
            for(int i=0;i<k;i++){
                sum += arr[idx];
                idx -= step;
            }
            System.out.println(sum);
        }
    }
}
