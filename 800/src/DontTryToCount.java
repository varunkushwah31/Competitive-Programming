import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int m = read.nextInt();
            String x = read.next();
            String s = read.next();
            int count = 0;
            String current = x;
            int maxLength = 100;
            boolean found = false;
            while (current.length() <= maxLength){
                if(current.contains(s)){
                    System.out.println(count);
                    found = true;
                    break;
                }
                current += current;
                count++;
            }
            if(!found){
                if (current.contains(s)){
                    System.out.println(count);
                }
                else {
                    System.out.println(-1);
                }
            }
        }
    }
}
