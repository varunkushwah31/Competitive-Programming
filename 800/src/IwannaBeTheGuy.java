import java.util.HashSet;
import java.util.Scanner;

public class IwannaBeTheGuy {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int p = read.nextInt();
        for (int i = 0; i < p; i++) {
            set.add(read.nextInt());
        }
        int q = read.nextInt();
        for (int i = 0; i < q; i++) {
            set.add(read.nextInt());
        }
        if(set.size() == n){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
