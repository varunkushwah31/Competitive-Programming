import java.util.Scanner;

public class COD2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        long[] arr = new long[n];
        boolean even = true;
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextLong();
            if((arr[i] & 1) == 1){
                even = false;
            }
        }
        if(even){
            System.out.println("Second");
        }else{
            System.out.println("First");
        }
    }
}
