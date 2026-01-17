import java.util.Scanner;

public class COD3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- != 0){
            int n = read.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = read.nextInt();
            }
            int sum = 0;
            for(int x : arr){
                sum += x;
            }
            if((sum & 1) == 0 && sum > 0){
                    while (sum-- > 0){
                        System.out.println();
                    }
            }
        }
    }
}
