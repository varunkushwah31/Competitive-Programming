import java.util.Scanner;

public class GellyFishAndTriColorPansy {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            long a = read.nextLong();
            long b = read.nextLong();
            long c =  read.nextLong();
            long d = read.nextLong();
            long p = Math.min(a,c);
            long q = Math.min(b,d);
            if(p >= q){
                System.out.println("Gellyfish");
            }
            else {
                System.out.println("Flower");
            }
        }
    }
}
