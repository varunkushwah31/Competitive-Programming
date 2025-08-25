import java.util.HashSet;
import java.util.Scanner;

public class HorseShoe {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 4 ; i++) {
            set.add(read.nextInt());
        }
        System.out.println(4- set.size());
    }
}
