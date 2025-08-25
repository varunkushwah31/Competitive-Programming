import java.util.Scanner;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int k = read.nextInt();
            int[] arr = new int[n];
            boolean found = false;
            for(int i=0;i<n;i++){
                arr[i] = read.nextInt();
                if(arr[i] == k){
                   found = true;
                }
            }
            if(found){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
