import java.util.Scanner;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            long a = read.nextLong();
            long b = read.nextLong();
            if(a == b){
                System.out.println("0 0");
            }
            else{
                long d = Math.abs(a-b);
                long moves = Math.min(a%d,d-(a%d));
                System.out.println(d + " " + moves);
            }
        }
        read.close();
    }
}
