import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        int evenIndex = -1;
        int oddIndex = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
            if((arr[i] & 1) == 0){
                evenCount++;
                evenIndex = i+1;
            }else{
                oddCount++;
                oddIndex = i+1;
            }
        }
        if(evenCount == 1){
            System.out.println(evenIndex);
        }else{
            System.out.println(oddIndex);
        }
    }
}
