import java.util.Scanner;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = read.nextInt();
            }
            boolean found = false;
            for(int j=1;j<n-1;j++){
                if(arr[j-1] < arr[j] && arr[j] > arr[j+1]){
                    System.out.println("YES");
                    System.out.println((j) + " " + (j+1) + " " + (j+2));
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
        }
    }
}
