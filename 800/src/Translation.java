import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        String t = read.next();
        int i = 0;
        int j = s.length() - 1;
        boolean ans = true;
        if(s.length() != t.length()){
            ans = false;
        }
        else {
            while (j >= 0 && i < s.length()) {
                if (s.charAt(i) != t.charAt(j)) {
                    ans = false;
                    break;
                }
                i++;
                j--;
            }
        }
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
