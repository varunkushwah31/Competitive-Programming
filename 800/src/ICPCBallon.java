import java.util.HashMap;
import java.util.Scanner;

public class ICPCBallon {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int  t = read.nextInt();
        while (t-- != 0){
            int n = read.nextInt();
            String s = read.next();
            HashMap<Character,Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),1) + 1);
            }
            for(char key : map.keySet()){
                count += map.get(key);
            }
            System.out.println(count);
        }
    }
}
