import java.util.Scanner;

public class TenWordOfWisdom {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int max = -1;
            int p = 0   ;
            int c = 1;
            while (n-- != 0){
                int a = read.nextInt();
                int b = read.nextInt();
                if(a <= 10 && b > max){
                    max = b;
                    p = c;
                }
                c++;
            }
            System.out.println(p);
        }
    }
}
