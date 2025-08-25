import java.util.Scanner;

public class FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int c = 0;
        for(int i=1;i<=n/2;i++){
            if((n-i)%i == 0){
                c++;
            }
        }
        System.out.println(c);
    }
}
