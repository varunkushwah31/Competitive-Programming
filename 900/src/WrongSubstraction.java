import java.util.Scanner;

public class WrongSubstraction {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        while (k-- != 0){
            if(n%10 == 0){
                n = n/10;
            }
            else{
                n--;
            }
        }
        System.out.println(n);
    }
}
