import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long n  = read.nextLong();
        if((n&1) == 1){
            System.out.println(-((n+1)/2));
        }
        else{
            System.out.println(n/2);
        }
    }
}
