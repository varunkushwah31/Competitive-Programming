    import java.util.Scanner;
    import java.lang.*;

    public class NearlyLuckyNumber {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            String n = read.next();
            int count = 0;
            for(int i=0;i<n.length();i++){
                if(n.charAt(i) == '7' || n.charAt(i) == '4'){
                    count++;
                }
            }
            if(luckyNumber(Integer.toString(count))){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        public static Boolean luckyNumber(String n){
            for (int i = 0; i < n.length(); i++) {
                char ch = n.charAt(i);
                if(ch != '7' && ch != '4'){
                    return false;
                }
            }
            return true;
        }
    }
