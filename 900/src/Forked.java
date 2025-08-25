import java.util.HashSet;
import java.util.Scanner;

public class Forked {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int xk = read.nextInt();
            int yk = read.nextInt();
            int xq = read.nextInt();
            int yq = read.nextInt();

            int[][] moves = {
                    {a,b}, {-a,b}, {a,-b}, {-a,-b},
                    {b,a}, {-b,a}, {b,-a}, {-b,-a}
            };

            HashSet<String> set = new HashSet<>();
            for(int[] move : moves){
                int x = xk - move[0];
                int y = yk - move[1];
                set.add(x + "," + y);
            }

            HashSet<String> ans = new HashSet<>();
            for (int[] move : moves){
                int x = xq - move[0];
                int y = yq - move[1];
                if(set.contains(x + "," + y)){
                    ans.add(x + "," + y);
                }
            }

            System.out.println(ans.size());
        }
    }
}
