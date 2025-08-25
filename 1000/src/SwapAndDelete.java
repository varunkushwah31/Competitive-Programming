import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            String s = read.next();
            int c0 = 0;
            int c1 = 0;
            for (char ch : s.toCharArray()){
                if(ch == '0'){
                    c0++;
                }
                else {
                    c1++;
                }
            }
            int tsize = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0' && c1 > 0){
                    c1--;
                    tsize++;
                } else if (s.charAt(i) == '1' && c0 > 0) {
                    c0--;
                    tsize++;
                }
                else {
                    break;
                }
            }
            System.out.println(s.length() - tsize);
        }
    }
}
