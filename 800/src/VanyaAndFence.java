import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int h = read.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
            if(arr[i] > h){
                ans += 2;
            }
            else {
                ans++;
            }
        }
        System.out.println(ans);

    }
}
