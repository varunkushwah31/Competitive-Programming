import java.util.Scanner;

public class FairNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            long n = read.nextLong();
            while (!isFair(n)){
                n++;
            }
            System.out.println(n);
        }
    }
    private static boolean isFair(long n){
        long num = n;
        while (num != 0){
            long x = num % 10;
            if(x != 0 && n%x != 0){
                return  false;
            }
            num = num/10;
        }
        return true;
    }
}
