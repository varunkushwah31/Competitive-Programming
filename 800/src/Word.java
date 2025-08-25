import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        int uppercount = 0;
        int lowercount = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                lowercount++;
            }
            else {
                uppercount++;
            }
        }
        if(lowercount >= uppercount){
            System.out.println(s.toLowerCase());
        }
        else {
            System.out.println(s.toUpperCase());
        }
    }
}
