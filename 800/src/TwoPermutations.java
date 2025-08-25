import java.util.Scanner;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int a = read.nextInt();
            int b = read.nextInt();
            if((n == a) && (n == b)){
                System.out.println("Yes");
            }
            else if(a+b >= n){
                System.out.println("No");
            }
            else {
                if(n-a-b >= 2){
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}
