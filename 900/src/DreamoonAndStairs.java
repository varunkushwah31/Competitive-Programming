import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        int p = (n+1)/2;
        int f = (p+m-1)/m*m;
        if(f > n){
            System.out.println(-1);
        }
        else {
            System.out.println(f);
        }
    }
}
