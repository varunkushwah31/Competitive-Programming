import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        boolean ans = false;
        for(char ch : str.toCharArray()){
            if(ch == 'H' || ch =='Q' || ch == '9'){
                ans = true;
                break;
            }
        }
        if(ans){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
