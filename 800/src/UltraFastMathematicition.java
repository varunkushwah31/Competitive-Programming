import java.util.Scanner;

public class UltraFastMathematicition {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str1 = read.next();
        String str2 = read.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            ans.append(str1.charAt(i) ^ str2.charAt(i));
        }
        System.out.println(ans);
    }
}
