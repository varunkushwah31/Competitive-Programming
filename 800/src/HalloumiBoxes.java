import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int k = read.nextInt();
            int[] arr = new int[n];
            boolean ans = false;
            for(int i=0;i<n;i++) arr[i] = read.nextInt();
            if(isSorted(arr) || (k > 1)) ans = true;
            if (ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
