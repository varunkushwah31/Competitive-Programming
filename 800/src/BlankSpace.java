import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = read.nextInt();
            }
            int max = 0;
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 0){
                    count++;
                    max = Math.max(count,max);
                }
                else {
                    count = 0;
                }
            }
            System.out.println(max);
        }
    }
}
