import java.util.Arrays;
import java.util.Scanner;

public class RemovalsGame {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = read.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = read.nextInt();
            }
            int c = 0;
            if(Arrays.equals(a,b)){
                System.out.println("Bob");
            }
            else{
                int i = 0;
                int j = n-1;
                while(i <= j){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    i++;
                    j--;
                }
                if(Arrays.equals(a,b)){
                    System.out.println("Bob");
                }
                else {
                    System.out.println("Alice");
                }
            }
        }
    }
}
