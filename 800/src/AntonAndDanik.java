import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String str = read.next();
        int acount = 0;
        int dcount = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == 'A'){
                acount++;
            }
            else {
                dcount++;
            }
        }
        if (acount > dcount){
            System.out.println("Anton");
        } else if (dcount > acount) {
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
