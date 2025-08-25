import java.util.Scanner;

public class notDividing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            // Forward pass
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] % arr[i] == 0) {
                    arr[i + 1]++;
                }
            }
            // Backward pass to fix any new issues caused by increments
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i + 1] % arr[i] == 0) {
                    arr[i + 1]++;
                }
            }
            // Handle the case where arr[i] is 1
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 1) {
                    if (arr[i + 1] % arr[i] == 0) {
                        arr[i + 1]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}