import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i=0;i<n;i++){
            if(arr[i] < 0 && (i+1) <= m){
                ans += Math.abs(arr[i]);
            }
            else {
                break;
            }
        }
        System.out.println(ans);
    }
}
