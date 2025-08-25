import java.util.Scanner;

public class FalseAlarm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int x = read.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = read.nextInt();
            }
            boolean used = false;
            boolean valid = true;
            int i = 0;
            while (i < n) {
                if (arr[i] == 1 && !used) {
                    i = i + x;
                    used = true;
                } else if (arr[i] == 1 && used == true) {
                    valid = false;
                    break;
                } else {
                    i++;
                }
            }
            if(valid){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
