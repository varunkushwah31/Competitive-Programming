import java.util.Scanner;

public class ComparisonString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            String s = read.next();
            int max = 0;
            int curr = 0;
            for(int i=0;i<n;i++){
                if(i == 0 || s.charAt(i) == s.charAt(i-1)) {
                    curr++;
                }
                else {
                    curr = 1;
                }
                max = Math.max(curr,max);
            }
            System.out.println(max+1);
        }
    }
}
