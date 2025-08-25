import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int[] arr = new int[2*n];
            int Odd = 0;
            int even = 0;
            for (int i = 0; i < 2*n; i++) {
                arr[i] = read.nextInt();
                if(arr[i] %2 == 0){
                    even++;
                }
                else{
                    Odd++;
                }
            }
            if(Odd == even){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
