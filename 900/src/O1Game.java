import java.util.Scanner;

public class O1Game {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- != 0){
            String s = read.next();
            int zcount = 0;
            int ocount = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '0'){
                    zcount++;
                }
                else if(s.charAt(i) == '1'){
                    ocount++;
                }
            }
            int pair = Math.min(zcount,ocount);
            if(pair%2 == 1){
                System.out.println("DA");
            }
            else {
                System.out.println("NET");
            }
        }
        read.close();
    }
}
