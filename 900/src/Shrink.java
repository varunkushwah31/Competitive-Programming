import java.util.Scanner;

public class Shrink {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int[] permutations = new int[n];
            int left = 2;
            int right = n;
            for (int i = 0; i < n; i++) {
                if(i == n-1){
                    permutations[i] = 1;
                }
                else if (i % 2 == 0) {
                    permutations[i] = left++;
                }
                else{
                    permutations[i] = right--;
                }
            }
            for(int num : permutations){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        read.close();
    }
}
