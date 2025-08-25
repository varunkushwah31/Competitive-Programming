import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y'){
                continue;
            }
            else {
                ans.append('.');
                if(Character.isUpperCase(ch)){
                    ans.append(Character.toLowerCase(ch));
                }
                else {
                    ans.append(ch);
                }
            }
        }
        System.out.println(ans);
    }
}
