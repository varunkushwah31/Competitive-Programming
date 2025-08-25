import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int curr = 0;
        int max = 0;
        while (t-- != 0){
            int a = read.nextInt();
            int b = read.nextInt();
            curr = curr - a + b;
            max = Math.max(max,curr);

        }
        System.out.println(max);
    }
}
