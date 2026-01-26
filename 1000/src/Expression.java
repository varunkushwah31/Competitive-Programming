import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int max = 0;
        max = Math.max(max, a + b + c);
        max = Math.max(max, a * b * c);
        max = Math.max(max, (a + b) * c);
        max = Math.max(max, a * (b + c));
        max = Math.max(max, a + b * c);
        max = Math.max(max, a * b + c);

        System.out.println(max);
    }
}