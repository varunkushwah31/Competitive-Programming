import java.util.Scanner;

public class SublimeSequence {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int x = read.nextInt();
            int n = read.nextInt();
            if((n & 1) == 0){
                System.out.println(0);
            }else{
                System.out.println(x);
            }
        }
    }
}
