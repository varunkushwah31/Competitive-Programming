import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
            total += arr[i];
        }
        Arrays.sort(arr);
        int j = n-1;
        int count = 0;
        int sum = 0;
        while(total >= sum){
            sum += arr[j];
            total -= arr[j];
            j--;
            count++;
        }
        System.out.println(count);

    }
}
