import java.util.Scanner;

public class EqualSubsequences {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int k = read.nextInt();
            int z = n-k;
            String s = "";
            while (k-- != 0){
                s += "1";
            }
            while (z-- != 0){
                s += "0";
            }
            System.out.println(s);
        }
    }
}
