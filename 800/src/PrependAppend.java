import java.util.Scanner;

public class PrependAppend {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            String s = read.next();
            int i = 0;
            int j = n-1;
            while (s.charAt(i) != s.charAt(j) && i < j){
                i++;
                j--;
            }
            System.out.println(j-i+1);
        }
    }
}
