import java.util.Scanner;

public class SoldierAndBanana {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int k = read.nextInt();
        int n = read.nextInt();
        int w = read.nextInt();
        for (int i=1;i<=w;i++){
            n = n-i*k;
        }
        System.out.println(Math.abs(n));
    }
}
