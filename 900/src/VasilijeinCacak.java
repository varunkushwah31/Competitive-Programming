import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            long n = read.nextLong();
            long k = read.nextLong();
            long x = read.nextLong();
            long Maxsum = k * n - k * (k-1)/2;
            long Minsum = k*(k+1)/2;
            if(x >= Minsum && x <= Maxsum){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
