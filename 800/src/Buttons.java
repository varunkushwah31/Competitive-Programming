import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0) {
            long a = read.nextLong();
            long b = read.nextLong();
            long c = read.nextLong();

            if (a > b) {
                System.out.println("First");
            } else if (b > a) {
                System.out.println("Second");
            } else {
                if (c % 2 == 1) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
    }
}
