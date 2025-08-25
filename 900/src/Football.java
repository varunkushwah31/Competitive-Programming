import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.next();
        int count = 0;
        boolean dan = false;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                if (count >= 6){
                    dan = true;
                }
            }
            else {
                count = 0;
            }
        }
        if (dan){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
